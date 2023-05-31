/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import dao.DonHangDAO;
import dao.SanPhamDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class QuanLyDonHangFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChonNhaCungCapFrame
     */
    DefaultTableModel model = new DefaultTableModel();
    public QuanLyDonHangFrame() {
        initComponents();
        init();
    }
    String nhacungcap[];
    int xx,yy;
    SanPhamDAO spDAO=new SanPhamDAO();
    DonHangDAO dhDAO=new DonHangDAO();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDH = new javax.swing.JTable();
        jTextFieldIDKH = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTK = new javax.swing.JTextField();
        jTextFieldIDDonHang = new javax.swing.JTextField();
        jTextFieldSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldGia = new javax.swing.JTextField();
        jTextFieldTenKH = new javax.swing.JTextField();
        jTextFieldSL = new javax.swing.JTextField();
        jTextFieldTrangThai = new javax.swing.JTextField();
        jTextFieldNCC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldIDNCC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabelTaiTrang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Đơn hàng", "ID Sản phẩm", "Tên sản phẩm", "ID Khách hàng", "Tên khách hàng", "ID Nhà cung cấp", "Tên nhà cung cấp", "Giá", "Số lượng", "Tổng", "Ngày mua", "Ngày nhận", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1490, 430));

        jTextFieldIDKH.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldIDKH.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldIDKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKHKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldIDKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 160, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Tìm kiếm");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 610, 130, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Xác nhận");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 110, 30));

        jLabel12.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 0, 40, -1));

        jTextFieldTK.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel1.add(jTextFieldTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 540, 180, -1));

        jTextFieldIDDonHang.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldIDDonHang.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldIDDonHang.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldIDDonHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDDonHangKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldIDDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 160, -1));

        jTextFieldSanPham.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSanPham.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSanPhamKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Sản phẩm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Khách hàng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ID Đơn hàng");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 100, -1));

        jTextFieldTong.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTong.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldTong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTongKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 160, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Trạng thái");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 100, -1));

        jTextFieldGia.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldGia.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldGiaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 160, -1));

        jTextFieldTenKH.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTenKH.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTenKHKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 160, -1));

        jTextFieldSL.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSL.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldSL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSLKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 160, -1));

        jTextFieldTrangThai.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTrangThai.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldTrangThai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTrangThaiKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 160, -1));

        jTextFieldNCC.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNCC.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldNCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNCCKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nhà cung cấp");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 100, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ID Khách hàng");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 100, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Giá");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 100, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Tổng");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 100, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Sô lượng");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 100, -1));

        jTextFieldIDNCC.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldIDNCC.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldIDNCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDNCCKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldIDNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 160, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("ID Nhà cung cấp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 120, -1));

        jLabelTaiTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTaiTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reload.png"))); // NOI18N
        jLabelTaiTrang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTaiTrang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaiTrangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTaiTrangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTaiTrangMouseExited(evt);
            }
        });
        jPanel1.add(jLabelTaiTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init(){
    
       
        dhDAO.loadData(jTableDH);

    }

    public void loadEmptyTable(JTable table) {

        model = new DefaultTableModel();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    private void clear() {
        jTextFieldIDDonHang.setText("");
        jTextFieldSanPham.setText("");
        jTextFieldIDKH.setText("");
        jTextFieldTenKH.setText("");
  
        jTextFieldGia.setText("");
        jTextFieldSL.setText("");
        jTextFieldTong.setText("");
        jTextFieldIDNCC.setText("");
        jTextFieldNCC.setText("");
        jTextFieldTrangThai.setText("");
    }
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x=evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int select = jTableDH.getSelectedRow();
        model = (DefaultTableModel) jTableDH.getModel();
        String trangthai= jTextFieldTrangThai.getText().toString(); 
        if (select == -1) {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if(trangthai.equals("Chờ")) {
            try {
                int id = Integer.parseInt(model.getValueAt(select, 0).toString());
                dhDAO.updateXacNhan(id);
                dhDAO.loadData(jTableDH);
                JOptionPane.showMessageDialog(this, "Xác nhận thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Lỗi chuyển đổi dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            
                JOptionPane.showMessageDialog(this, "Trạng thái không phù hợp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTableDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDHMouseClicked
        model = (DefaultTableModel) jTableDH.getModel();
        int r = jTableDH.getSelectedRow();
        jTextFieldIDDonHang.setText(model.getValueAt(r, 0).toString());
        jTextFieldSanPham.setText(model.getValueAt(r, 1).toString());
        jTextFieldIDKH.setText(model.getValueAt(r, 2).toString());
        jTextFieldTenKH.setText(model.getValueAt(r, 3).toString());
        jTextFieldGia.setText(model.getValueAt(r, 7).toString());
        jTextFieldSL.setText(model.getValueAt(r, 8).toString());
        jTextFieldTong.setText(model.getValueAt(r, 9).toString());
        jTextFieldIDNCC.setText(model.getValueAt(r, 5).toString());
        jTextFieldNCC.setText(model.getValueAt(r, 6).toString());
        jTextFieldTrangThai.setText(model.getValueAt(r, 12).toString());
    }//GEN-LAST:event_jTableDHMouseClicked

    private void jLabelTaiTrangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseClicked
        clear();
    }//GEN-LAST:event_jLabelTaiTrangMouseClicked

    private void jLabelTaiTrangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseEntered
        jLabelTaiTrang.setText("Tải lại trang");
    }//GEN-LAST:event_jLabelTaiTrangMouseEntered

    private void jLabelTaiTrangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseExited
        jLabelTaiTrang.setText("");
    }//GEN-LAST:event_jLabelTaiTrangMouseExited

    private void jTextFieldIDDonHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDDonHangKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldIDDonHangKeyTyped

    private void jTextFieldSanPhamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSanPhamKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldSanPhamKeyTyped

    private void jTextFieldIDKHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKHKeyTyped
       evt.consume();
    }//GEN-LAST:event_jTextFieldIDKHKeyTyped

    private void jTextFieldTenKHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTenKHKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldTenKHKeyTyped

    private void jTextFieldIDNCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDNCCKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldIDNCCKeyTyped

    private void jTextFieldNCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNCCKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldNCCKeyTyped

    private void jTextFieldGiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGiaKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldGiaKeyTyped

    private void jTextFieldSLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSLKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldSLKeyTyped

    private void jTextFieldTongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTongKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldTongKeyTyped

    private void jTextFieldTrangThaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTrangThaiKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldTrangThaiKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDonHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDonHangFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTaiTrang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDH;
    private javax.swing.JTextField jTextFieldGia;
    private javax.swing.JTextField jTextFieldIDDonHang;
    private javax.swing.JTextField jTextFieldIDKH;
    private javax.swing.JTextField jTextFieldIDNCC;
    private javax.swing.JTextField jTextFieldNCC;
    private javax.swing.JTextField jTextFieldSL;
    private javax.swing.JTextField jTextFieldSanPham;
    private javax.swing.JTextField jTextFieldTK;
    private javax.swing.JTextField jTextFieldTenKH;
    private javax.swing.JTextField jTextFieldTong;
    private javax.swing.JTextField jTextFieldTrangThai;
    // End of variables declaration//GEN-END:variables
}
