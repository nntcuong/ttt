/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import dao.DanhMucDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DanhMuc;
import model.KhachHang;
import model.NhaCungCap;
import user.DangNhapFrame;

/**
 *
 * @author ACER
 */
public class DanhMucSanPhamFrame extends javax.swing.JFrame {

    /**
     * Creates new form DanhMucSanPhamFrame
     */
    DanhMucDAO dmDAO=new DanhMucDAO();
 //  DanhMuc dm=new DanhMuc();
    DefaultTableModel model=new DefaultTableModel();
    public DanhMucSanPhamFrame() {
        initComponents();
        dmDAO.loadData(jTableDanhMuc);
        init();
    }
    private void init(){
    
        jTextFieldID.setText(String.valueOf(dmDAO.khoiTaoID()));
    }
    int xx,yy;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     private  boolean kiemTraKhongRong(){
    
        if(jTextFieldTen.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Nhập tên danh mục !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(jTextPaneMoTa.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Nhập mô tả !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void clear() {
        jTextFieldID.setText(String.valueOf(dmDAO.khoiTaoID()));
        jTextFieldTimKiem.setText("");
        jTextPaneMoTa.setText("");
        jTextFieldTen.setText("");
        jTableDanhMuc.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDanhMuc = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jTextFieldTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelTaiTrang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneMoTa = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 640));
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

        jLabel1.setText("____________________________________________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 870, -1));

        jTableDanhMuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Danh mục", "Tên danh mục", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhMucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDanhMuc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 840, 320));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Danh mục sản phẩm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 230, -1));

        jTextFieldID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldID.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 350, -1));

        jTextFieldTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel1.add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 350, -1));

        jTextFieldTen.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel1.add(jTextFieldTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 350, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("ID ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 30, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("Tên loại danh mục");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 120, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Mô tả");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 50, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 130, 40));

        jLabel11.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Lưu");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 90, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Cập nhật");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, -1, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Xóa");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 90, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/categories.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 70, -1));

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
        jPanel1.add(jLabelTaiTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jScrollPane2.setViewportView(jTextPaneMoTa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 350, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        setVisible(false);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x=evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabelTaiTrangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseClicked
        clear();
    }//GEN-LAST:event_jLabelTaiTrangMouseClicked

    private void jLabelTaiTrangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseEntered
        jLabelTaiTrang.setText("Tải lại trang");
    }//GEN-LAST:event_jLabelTaiTrangMouseEntered

    private void jLabelTaiTrangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaiTrangMouseExited
        jLabelTaiTrang.setText("");
    }//GEN-LAST:event_jLabelTaiTrangMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (kiemTraKhongRong()) {
            int id = Integer.parseInt(jTextFieldID.getText());
            String ten = jTextFieldTen.getText();
            String mota = jTextPaneMoTa.getText();
         

            DanhMuc dm=new DanhMuc(id, ten, mota);
            if (!dmDAO.kiemTraDanhMuclTonTai((DanhMuc) dm)) {
           
                    dmDAO.insert((DanhMuc) dm);
                    //new DangNhapFrame().setVisible(true);
                    DanhMucSanPhamFrame dmF=new DanhMucSanPhamFrame();
                    dmF.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Thêm thành thành công ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
               
            } else {
                JOptionPane.showMessageDialog(this, "Tên danh mục đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhMucMouseClicked
        
        
        model=(DefaultTableModel) jTableDanhMuc.getModel();
        int r=jTableDanhMuc.getSelectedRow();
        jTextFieldID.setText(model.getValueAt(r, 0).toString());
        jTextFieldTen.setText(model.getValueAt(r, 1).toString());
        jTextPaneMoTa.setText(model.getValueAt(r, 2).toString());
        
    }//GEN-LAST:event_jTableDanhMucMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int id = Integer.parseInt(jTextFieldID.getText());
        String ten = jTextFieldTen.getText();
        String mota = jTextPaneMoTa.getText();
        
        DanhMuc dm=new DanhMuc(id, ten, mota);
        int a = JOptionPane.showConfirmDialog(null, " Xác nhận xóa danh mục sản phẩm", "Thông báo", JOptionPane.OK_CANCEL_OPTION, 0);
        if (a == JOptionPane.OK_OPTION) {

            dmDAO.delete((DanhMuc) dm);
            JOptionPane.showMessageDialog(null, " Danh mục đã được xóa");
            DanhMucSanPhamFrame dmFrame = new DanhMucSanPhamFrame();
            dmFrame.setVisible(true);
            dmFrame.pack();

            this.dispose();

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (kiemTraKhongRong()) {

            int id = Integer.parseInt(jTextFieldID.getText());
            String ten = jTextFieldTen.getText();
            String mota = jTextPaneMoTa.getText();
            DanhMuc dm = new DanhMuc(id, ten, mota);
            if (!dmDAO.kiemTraIDKhongDuocThayDoi((DanhMuc) dm)) {
                dmDAO.update((DanhMuc) dm);
                DanhMucSanPhamFrame dmFrame = new DanhMucSanPhamFrame();
                dmFrame.setVisible(true);
                dmFrame.pack();
                this.dispose();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không được thay đổi ID ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldIDKeyTyped

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
            java.util.logging.Logger.getLogger(DanhMucSanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhMucSanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhMucSanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhMucSanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhMucSanPhamFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTaiTrang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDanhMuc;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldTen;
    private javax.swing.JTextField jTextFieldTimKiem;
    private javax.swing.JTextPane jTextPaneMoTa;
    // End of variables declaration//GEN-END:variables
}
