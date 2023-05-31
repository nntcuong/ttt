/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;
import model.NhaCungCap;
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
public class NhaCungCapDAO implements DAOInterface<NhaCungCap> {

    Connection connection = JDBCUtil.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    @Override
    public int khoiTaoID() {

        int r = 0;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("select max(id_nhacungcap) from nhacungcap");
            while (rs.next()) {

                r = rs.getInt(1);
            }
            //  JDBCUtil.closeConnection(connection);
        } catch (Exception e) {
            Logger.getLogger(DonHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return r + 1;
    }

    @Override
    public int insert(NhaCungCap t) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "INSERT INTO nhacungcap (ID_nhacungcap, tennhacungcap, diachi, sodienthoai, email, matkhau) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());
            statement.setString(2, t.getTen());
            statement.setString(3, t.getDiaChi());
            statement.setString(4, t.getSdt());
            statement.setString(5, t.getEmail());
            statement.setString(6, t.getMatKhau());
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            // JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int update(NhaCungCap t) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE nhacungcap SET tennhacungcap = ?, diachi = ?, sodienthoai = ?, email = ?, matkhau = ? WHERE ID_nhacungcap = ?";

            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, t.getTen());
            statement.setString(2, t.getDiaChi());
            statement.setString(3, t.getSdt());
            statement.setString(4, t.getEmail());
            statement.setString(5, t.getMatKhau());

            statement.setInt(6, t.getId());
            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            //   JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public boolean kiemTraEmailTonTai(NhaCungCap t) {
        try {
            ps = connection.prepareStatement("select * from nhacungcap where email=?");
            ps.setString(1, t.getEmail());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            //JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean kiemTraTenTonTai(NhaCungCap t) {
        try {
            ps = connection.prepareStatement("select * from nhacungcap where tennhacungcap= ?");
            ps.setString(1, t.getTen());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            //JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean kiemTraEmailKhongDuocThayDoi(NhaCungCap t) {
        try {
            ps = connection.prepareStatement("select * from nhacungcap where email=?");
            ps.setString(1, t.getEmail());
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
            //  JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean kiemTraIDKhongDuocThayDoi(NhaCungCap t) {
        try {
            ps = connection.prepareStatement("select * from nhacungcap where id_nhacungcap=?");
            ps.setInt(1, t.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
            // JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public String[] selectInfor(int id) {
        String[] infor = new String[6];
        try {
            ps = connection.prepareStatement("select * from nhacungcap where ID_nhacungcap=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                infor[0] = rs.getString(1);
                infor[1] = rs.getString(2);
                infor[2] = rs.getString(3);
                infor[3] = rs.getString(4);
                infor[4] = rs.getString(5);
                infor[5] = rs.getString(6);

            }
            //JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    @Override
    public int delete(NhaCungCap t) {
        int ketqua = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "delete from nhacungcap where id_nhacungcap=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, t.getId());

            ketqua = statement.executeUpdate();
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketqua + " dòng bị thay đổi");

            //  JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public void loadData(JTable JT) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM nhacungcap ORDER BY id_nhacungcap ASC";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Tên nhà cung cấp");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Email");
            model.addColumn("Mật khẩu");
            while (rs.next()) {
                Object[] r = new Object[8];
                r[0] = rs.getInt("id_nhacungcap");
                r[1] = rs.getString("tennhacungcap");
                r[2] = rs.getString("diachi");
                r[3] = rs.getString("sodienthoai");
                r[4] = rs.getString("email");
                r[5] = rs.getString("matkhau");
                model.addRow(r);
            }

            //  JDBCUtil.closeConnection(con);
            JT.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getTen(String e) {
        String ten = "";
        try {
            ps = connection.prepareStatement("select tennhacungcap from nhacungcap where email=?");
            ps.setString(1, e);
            rs = ps.executeQuery();
            if (rs.next()) {
                ten = rs.getString(1);

            }
            //JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ten;
    }

    @Override
    public int getId(String e) {
        int id = 0;
        try {
            ps = connection.prepareStatement("select id_nhacungcap from nhacungcap where tennhacungcap=?");
            ps.setString(1, e);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);

            }
            //JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public void search(JTable JT) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
