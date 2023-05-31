/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import model.DanhMuc;
import model.DonHang;
import model.KhachHang;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DonHangDAO {

    Connection connection = JDBCUtil.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public int khoiTaoID() {

        int r = 0;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select max(id_donhang) from donhang");
            while (rs.next()) {

                r = rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return r + 1;
    }

    //  @Override
    public int selectId(String e) {
        int id = 0;
        try {
            ps = connection.prepareStatement("select id_nhacungcap from nhacungcap where email=?");
            ps.setString(1, e);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    //  @Override

    public String[] selectInfor(String email) {
        String[] infor = new String[6];
        try {
            String sql = "select id_khachhang,tenkhachhang,diachi,sodienthoai,ngaysinh,ngaydangky  from khachhang where email=?'" + email + "'";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                infor[0] = rs.getString(1);
                infor[1] = rs.getString(2);
                infor[2] = rs.getString(3);
                infor[3] = rs.getString(4);
                infor[4] = rs.getString(5);
                infor[5] = rs.getString(6);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    public int insert(DonHang t, String email) {

        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "INSERT INTO donhang (ID_donhang, tensanpham, tenkhachhang, gia, soluong, tong, ngaymua, ngaynhan, trangthai, id_sanpham, id_khachhang) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, (SELECT ID_sanpham FROM sanpham WHERE tensanpham = ?), (SELECT id_khachhang FROM khachhang WHERE email = ?))";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());
            statement.setString(2, t.getSanpham());
            statement.setString(3, t.getTenkhachhang());
            statement.setDouble(4, t.getGia());
            statement.setInt(5, t.getSoluong());
            statement.setDouble(6, t.getTong());
            statement.setDate(7, t.getNgaymua());
            statement.setDate(8, t.getNgaynhan());
            statement.setString(9, t.getTrangthai());
            statement.setString(10, t.getSanpham());
            statement.setString(11, email);

            ketqua = statement.executeUpdate();
            System.out.println("Câu truy vấn được thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            //JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketqua;
    }

    public int getSLSP(String tensp) {

        int sl = 0;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select soluong from sanpham where tensanpham ='" + tensp + "'");
            if (rs.next()) {

                sl = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sl;
    }

    public void updateSanPham(String tensp, int sl) {

        String sql = "update sanpham set soluong=? where tensanpham=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setString(2, tensp);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int updateXacNhan(int id) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE donhang SET trangthai='Xác nhận' where id_donhang=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            // JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public int updateVanChuyen(int id) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE donhang SET trangthai='Đang vận chuyển' where id_donhang=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public int delete(DonHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void loadData(JTable JT, String email) {

        try {
            String sql = "SELECT * FROM KHACHHANG KH, DONHANG DH WHERE KH.ID_KHACHHANG = DH.ID_KHACHHANG AND EMAIL = ? ORDER BY id_donhang ASC";
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Đơn hàng");
            model.addColumn("Tên sản phẩm");
            model.addColumn("Tên khách hàng");
            model.addColumn("Giá");
            model.addColumn("Số lượng");
            model.addColumn("Tổng");
            model.addColumn("Ngày mua");
            model.addColumn("Ngày nhận");
            model.addColumn("Trạng thái");
            Object[] r;
            while (rs.next()) {
                r = new Object[9];
                r[0] = rs.getInt("ID_DONHANG");
                r[1] = rs.getString("TENSANPHAM");
                r[2] = rs.getString("TENKHACHHANG");
                r[3] = rs.getDouble("GIA");
                r[4] = rs.getInt("SOLUONG");
                r[5] = rs.getDouble("tong");
                r[6] = rs.getDate("NGAYMUA");
                r[7] = rs.getDate("NGAYNHAN");
                r[8] = rs.getString("TRANGTHAI");
                model.addRow(r);
            }
            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadData(JTable JT) {
        try {
            String sql = "SELECT d.ID_DONHANG, d.id_sanpham, s.TENSANPHAM, d.id_khachhang, d.TENKHACHHANG, s.id_nhacungcap, s.TENNHACUNGCAP, d.SOLUONG, d.GIA, d.TONG, d.NGAYMUA, d.NGAYNHAN, d.TRANGTHAI "
                    + "FROM DONHANG d "
                    + "INNER JOIN SANPHAM s ON d.id_sanpham = s.ID_SANPHAM "
                    + "ORDER BY d.ID_DONHANG ASC";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Đơn hàng");
            model.addColumn("ID Sản phẩm");
            model.addColumn("Tên sản phẩm");
            model.addColumn("ID Khách hàng");
            model.addColumn("Tên khách hàng");
            model.addColumn("ID Nhà cung cấp");
            model.addColumn("Nhà cung cấp");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Tổng");
            model.addColumn("Ngày mua");
            model.addColumn("Ngày nhận");
            model.addColumn("Trạng thái");

            Object[] r;
            while (rs.next()) {
                r = new Object[13];
                r[0] = rs.getInt("id_donhang");
                r[1] = rs.getInt("id_sanpham");
                r[2] = rs.getString("tensanpham");
                r[3] = rs.getInt("id_khachhang");
                r[4] = rs.getString("tenkhachhang");
                r[5] = rs.getString("id_nhacungcap");
                r[6] = rs.getString("tennhacungcap");
                r[7] = rs.getInt("soluong");
                r[8] = rs.getDouble("gia");
                r[9] = rs.getDouble("tong");
                r[10] = rs.getDate("ngaymua");
                r[11] = rs.getDate("ngaynhan");
                r[12] = rs.getString("trangthai");

                model.addRow(r);
            }

            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getNhaCungCap(JTable JT, String ten) {
        try {
            String sql = "SELECT * FROM donhang ORDER BY id_donhang ASC";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSet rs2;
            String sql2 = "SELECT * FROM sanpham WHERE tensanpham=?";
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps2.setString(1, ten);
            rs2 = ps2.executeQuery();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Đơn hàng");
            model.addColumn("Tên sản phẩm");
            model.addColumn("Tên khách hàng");
            model.addColumn("Nhà cung cấp");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Tổng");
            model.addColumn("Ngày mua");
            model.addColumn("Ngày nhận");
            model.addColumn("Trạng thái");
            Object[] r;
            while (rs.next()) {
                r = new Object[10];
                r[0] = rs.getInt("id_donhang");
                r[1] = rs.getString("tensanpham");
                r[2] = rs.getString("tenkhachhang");
                if (rs2.next()) {
                    r[3] = rs2.getString("tennhacungcap");
                }
                r[4] = rs.getInt("soluong");
                r[5] = rs.getDouble("gia");
                r[6] = rs.getDouble("tong");
                r[7] = rs.getDate("ngaythemvaogiohang");
                r[8] = rs.getDate("ngaynhan");
                r[9] = rs.getString("trangthai");
                model.addRow(r);
            }

            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNhaCungCap(JTable JT, String email) {
        try {
            String sql = "SELECT d.ID_DONHANG, d.ID_SANPHAM, d.TENSANPHAM, kh.ID_KHACHHANG, kh.TENKHACHHANG, kh.DIACHI, kh.SODIENTHOAI, d.GIA, d.SOLUONG, d.TONG, d.NGAYMUA, d.NGAYNHAN, d.TRANGTHAI "
                    + "FROM DONHANG d "
                    + "JOIN KHACHHANG kh ON d.ID_KHACHHANG = kh.ID_KHACHHANG "
                    + "JOIN SANPHAM s ON d.ID_SANPHAM = s.ID_SANPHAM "
                    + "JOIN NHACUNGCAP ncc ON ncc.ID_NHACUNGCAP = s.ID_NHACUNGCAP "
                    + "WHERE ncc.EMAIL = ? AND d.TRANGTHAI = 'Xác nhận' "
                    + "ORDER BY d.ID_DONHANG ASC";
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Đơn hàng");
            model.addColumn("ID sản phẩm");
            model.addColumn("Tên sản phẩm");
            model.addColumn("ID Khách hàng");
            model.addColumn("Tên khách hàng");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Tổng");
            model.addColumn("Ngày mua");
            model.addColumn("Ngày nhận");
            model.addColumn("Trạng thái");

            Object[] r;
            while (rs.next()) {
                r = new Object[13];
                r[0] = rs.getInt("ID_DONHANG");
                r[1] = rs.getInt("ID_SANPHAM");
                r[2] = rs.getString("TENSANPHAM");
                r[3] = rs.getInt("ID_KHACHHANG");
                r[4] = rs.getString("TENKHACHHANG");
                r[5] = rs.getString("DIACHI");
                r[6] = rs.getString("SODIENTHOAI");
                r[7] = rs.getInt("SOLUONG");
                r[8] = rs.getDouble("GIA");
                r[9] = rs.getDouble("TONG");
                r[10] = rs.getDate("NGAYMUA");
                r[11] = rs.getDate("NGAYNHAN");
                r[12] = rs.getString("TRANGTHAI");

                model.addRow(r);
            }

            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setTrangThaiVanChuyen(JTable JT, String email) {
        try {
            String sql = "SELECT d.ID_DONHANG, d.ID_SANPHAM, d.TENSANPHAM, kh.ID_KHACHHANG, kh.TENKHACHHANG, kh.DIACHI, kh.SODIENTHOAI, d.GIA, d.SOLUONG, d.TONG, d.NGAYMUA, d.NGAYNHAN, d.TRANGTHAI "
                    + "FROM DONHANG d "
                    + "JOIN KHACHHANG kh ON d.ID_KHACHHANG = kh.ID_KHACHHANG "
                    + "JOIN SANPHAM s ON d.ID_SANPHAM = s.ID_SANPHAM "
                    + "JOIN NHACUNGCAP ncc ON ncc.ID_NHACUNGCAP = s.ID_NHACUNGCAP "
                    + "WHERE ncc.EMAIL = ? AND d.TRANGTHAI = 'Đang vận chuyển' "
                    + "ORDER BY d.ID_DONHANG ASC";
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Đơn hàng");
            model.addColumn("ID sản phẩm");
            model.addColumn("Tên sản phẩm");
            model.addColumn("ID Khách hàng");
            model.addColumn("Tên khách hàng");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Số lượng");
            model.addColumn("Giá");
            model.addColumn("Tổng");
            model.addColumn("Ngày mua");
            model.addColumn("Ngày nhận");
            model.addColumn("Trạng thái");

            Object[] r;
            while (rs.next()) {
                r = new Object[13];
                r[0] = rs.getInt("ID_DONHANG");
                r[1] = rs.getInt("ID_SANPHAM");
                r[2] = rs.getString("TENSANPHAM");
                r[3] = rs.getInt("ID_KHACHHANG");
                r[4] = rs.getString("TENKHACHHANG");
                r[5] = rs.getString("DIACHI");
                r[6] = rs.getString("SODIENTHOAI");
                r[7] = rs.getInt("SOLUONG");
                r[8] = rs.getDouble("GIA");
                r[9] = rs.getDouble("TONG");
                r[10] = rs.getDate("NGAYMUA");
                r[11] = rs.getDate("NGAYNHAN");
                r[12] = rs.getString("TRANGTHAI");

                model.addRow(r);
            }

            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int setDaNhanHang(int id, Date ngaynhan) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE donhang SET trangthai='Đã nhận hàng', ngaynhan=? where id_donhang=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setDate(1, ngaynhan);
            statement.setInt(2, id);
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public boolean kiemTraIDKhongDuocThayDoi(DonHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
