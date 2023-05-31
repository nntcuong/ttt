/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public interface HangHoaDAOInterface<T> {

    public int insert(T t);

    public int update(T t);

    public int delete(T t);

    public void loadData(JTable JT);

    public boolean kiemTraIDKhongDuocThayDoi(T t);
}
