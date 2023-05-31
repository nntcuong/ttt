/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import admin.GiaoDienQuanLyFrame;
import java.sql.Connection;
import connection.JDBCUtil;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.KhachHang;
import user.DangNhapFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class KhachHangDAO implements DAOInterface<KhachHang> {

    Connection connection = JDBCUtil.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    @Override

    public int khoiTaoID() {

        int r = 0;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select max(id_khachhang) from khachhang");
            while (rs.next()) {

                r = rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return r + 1;
    }

    @Override

    public boolean kiemTraEmailTonTai(KhachHang t) {
        try {
            ps = connection.prepareStatement("select * from khachhang where email=?");
            ps.setString(1, t.getEmail());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public int insert(KhachHang t) {
        int ketqua = 0;
        try {
            java.util.Date utilDate = t.getNgaySinh();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            Connection con = JDBCUtil.getConnection();

            String sql = "INSERT INTO khachhang (ID_khachhang, tenkhachhang, diachi, sodienthoai, email, matkhau, ngaysinh, ngaydangky) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());
            statement.setString(2, t.getTen());
            statement.setString(3, t.getDiaChi());
            statement.setString(4, t.getSdt());
            statement.setString(5, t.getEmail());
            statement.setString(6, t.getMatKhau());
            statement.setDate(7, t.getNgaySinh());
            statement.setDate(8, t.getNgayDangKy());

            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    public String[] selectInfor(int id) {
        String[] infor = new String[8];
        try {
            ps = connection.prepareStatement("select * from khachhang where ID_khachhang=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                infor[0] = rs.getString(1);
                infor[1] = rs.getString(2);
                infor[2] = rs.getString(3);
                infor[3] = rs.getString(4);
                infor[4] = rs.getString(5);
                infor[5] = rs.getString(6);
                infor[6] = rs.getString(7);
                infor[7] = rs.getString(8);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    @Override
    public int update(KhachHang t) {
        int ketqua = 0;
        try {
            java.util.Date utilDate = t.getNgaySinh();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE khachhang SET tenkhachhang = ?, diachi = ?, sodienthoai = ?, email = ?, matkhau = ?, ngaysinh = ?, ngaydangky = ? WHERE ID_khachhang = ?";

            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, t.getTen());
            statement.setString(2, t.getDiaChi());
            statement.setString(3, t.getSdt());
            statement.setString(4, t.getEmail());
            statement.setString(5, t.getMatKhau());
            statement.setDate(6, t.getNgaySinh());
            statement.setDate(7, t.getNgayDangKy());
            statement.setInt(8, t.getId());
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public boolean kiemTraEmailKhongDuocThayDoi(KhachHang t) {
        try {
            ps = connection.prepareStatement("select * from khachhang where email=?");
            ps.setString(1, t.getEmail());
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean kiemTraIDKhongDuocThayDoi(KhachHang t) {
        try {
            ps = connection.prepareStatement("select * from khachhang where id_khachhang=?");
            ps.setInt(1, t.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public int delete(KhachHang t) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "delete from khachhang where id_khachhang=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());

            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public void loadData(JTable JT) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khachhang ORDER BY id_khachhang ASC";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Họ và tên");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Email");
            model.addColumn("Mật khẩu");
            model.addColumn("Ngày sinh");
            model.addColumn("Ngày đăng ký");
            while (rs.next()) {
                Object[] r = new Object[8];
                r[0] = rs.getInt("id_khachhang");
                r[1] = rs.getString("tenkhachhang");
                r[2] = rs.getString("diachi");
                r[3] = rs.getString("sodienthoai");
                r[4] = rs.getString("email");
                r[5] = rs.getString("matkhau");
                r[6] = rs.getDate("ngaysinh");
                r[7] = rs.getDate("ngaydangky");

                model.addRow(r);
            }

            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getId(String e) {
        int id = 0;
        try {
            ps = connection.prepareStatement("select id_khachhang from khachhang where email=?");
            ps.setString(1, e);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public String getTen(String e) {
        String ten = "";
        try {
            ps = connection.prepareStatement("select tenkhachhang from khachhang where email=?");
            ps.setString(1, e);
            rs = ps.executeQuery();
            if (rs.next()) {
                ten = rs.getString(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ten;
    }

    @Override
    public void search(JTable JT) {
        JT.setModel(new DefaultTableModel(null, new Object[]{"ID", "Họ và tên", "Địa chỉ", "Số điện thoại", "Email", "Mật khẩu", "Ngày sinh", "Ngày đăng ký"}));
        loadData(JT);
    }

}
