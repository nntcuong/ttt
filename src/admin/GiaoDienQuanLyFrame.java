/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package admin;

import javax.swing.JOptionPane;
import user.DangNhapFrame;

/**
 *
 * @author ACER
 */
public class GiaoDienQuanLyFrame extends javax.swing.JFrame {

    /** Creates new form GiaoDienQuanLyFrame */
    public GiaoDienQuanLyFrame() {
        initComponents();
        init();
    }
    int xx,yy;
    private void init() {
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelDanhMuc = new javax.swing.JLabel();
        jLabelSanPham = new javax.swing.JLabel();
        jLabelNguoiDung = new javax.swing.JLabel();
        jLabelNhaCungCap = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel1.setText("Đăng xuất");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1280, 30, 120, 40);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1380, 0, 18, 27);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping (4).png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 0, 310, 140);

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel2.add(jLabelEmail);
        jLabelEmail.setBounds(1190, 80, 210, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 140));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDanhMuc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabelDanhMuc.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/categories (4).png"))); // NOI18N
        jLabelDanhMuc.setText("     Danh mục sản phẩm");
        jLabelDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDanhMucMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 50));

        jLabelSanPham.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabelSanPham.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-product-40.png"))); // NOI18N
        jLabelSanPham.setText("    Sản phẩm");
        jLabelSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSanPhamMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 50));

        jLabelNguoiDung.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabelNguoiDung.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile (3).png"))); // NOI18N
        jLabelNguoiDung.setText("    Người dùng");
        jLabelNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNguoiDungMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 50));

        jLabelNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNhaCungCap.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/supplier.png"))); // NOI18N
        jLabelNhaCungCap.setText("    Nhà cung cấp");
        jLabelNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNhaCungCapMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 222, 230, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus (1).png"))); // NOI18N
        jLabel8.setText("    Thêm nhà cung cấp");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 272, 230, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel10.setText("Đăng xuất");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10);
        jLabel10.setBounds(930, 30, 120, 40);

        jLabel11.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11);
        jLabel11.setBounds(1030, 0, 18, 27);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping (4).png"))); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 0, 310, 140);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 50));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setToolTipText("");
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 10, 300));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/order (1).png"))); // NOI18N
        jLabel2.setText("    Quản lý đơn hàng");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1410, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        int x=JOptionPane.showConfirmDialog(this, "Xác nhận đăng xuất","Đăng xuất",JOptionPane.YES_NO_CANCEL_OPTION);
        if(x==0){
            new DangNhapFrame().setVisible(true);
            this.dispose();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabelDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDanhMucMouseClicked

        DanhMucSanPhamFrame danhMucSanPhamFrame=new DanhMucSanPhamFrame();
        danhMucSanPhamFrame.setVisible(true);
        danhMucSanPhamFrame.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelDanhMucMouseClicked

    private void jLabelSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSanPhamMouseClicked

        QuanLySanPhamFrame quanLySanPhamFrame=new QuanLySanPhamFrame();
        quanLySanPhamFrame.setVisible(true);
        quanLySanPhamFrame.pack();
        
        
    }//GEN-LAST:event_jLabelSanPhamMouseClicked

    private void jLabelNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNguoiDungMouseClicked
        
        QuanLyNguoiDungFrame quanLyNguoiDungFrame=new QuanLyNguoiDungFrame();
        quanLyNguoiDungFrame.setVisible(true);
        quanLyNguoiDungFrame.pack();
    }//GEN-LAST:event_jLabelNguoiDungMouseClicked

    private void jLabelNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNhaCungCapMouseClicked
        // TODO add your handling code here:
        QuanLyNhaCungCapFrame quanLyNhaCungCapFrame=new QuanLyNhaCungCapFrame();
        quanLyNhaCungCapFrame.setVisible(true);
        quanLyNhaCungCapFrame.pack();
    }//GEN-LAST:event_jLabelNhaCungCapMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        ThemNhaCungCapFrame themNhaCungCapFrame=new ThemNhaCungCapFrame();
        themNhaCungCapFrame.setVisible(true);
        themNhaCungCapFrame.pack();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x=evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        QuanLyDonHangFrame qldhf = new QuanLyDonHangFrame();
        qldhf.setVisible(true);
        qldhf.pack();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDienQuanLyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienQuanLyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelDanhMuc;
    public static javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNguoiDung;
    private javax.swing.JLabel jLabelNhaCungCap;
    private javax.swing.JLabel jLabelSanPham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

    

}