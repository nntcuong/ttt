    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;

/**
 *
 * @author ACER
 */
public class KhachHang extends NguoiDung  {
    private Date ngaySinh;
    private Date ngayDangKy;
    public KhachHang(){
    
    }
    public KhachHang(int id, String ten,String diachi, String sdt, String email, String matkhau, Date ngaySinh,Date ngayDangKy) {
      
        super(id, ten, diachi, sdt, email, matkhau);
        this.ngaySinh=ngaySinh;
        this.ngayDangKy=ngayDangKy;
    }
   

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    
  
}
