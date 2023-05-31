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
public class DonHang {
    private int id;
    private String sanpham;
    private String tenkhachhang;
    private double gia;
    private int soluong;
    private double tong;
    private Date ngaymua;
    private Date ngaynhan;
    private String trangthai;
    private int id_sp;
    private int id_kh;

    public DonHang(int id, String sanpham, String tenkhachhang, double gia, int soluong, double tong, Date ngaymua, Date ngaynhan, String trangthai, int id_sp, int id_kh) {
        this.id = id;
        this.sanpham = sanpham;
        this.tenkhachhang = tenkhachhang;
        this.gia = gia;
        this.soluong = soluong;
        this.tong = tong;
        this.ngaymua = ngaymua;
        this.ngaynhan = ngaynhan;
        this.trangthai = trangthai;
        this.id_sp = id_sp;
        this.id_kh = id_kh;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getId_kh() {
        return id_kh;
    }

    public void setId_kh(int id_kh) {
        this.id_kh = id_kh;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }
    
    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }
    
          
}
