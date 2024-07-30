/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Admin;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author tranh
 */
public class frmMain extends javax.swing.JFrame {

    private String TenDN, HoTen, AnhBia;

    public String getHoTen() {
        return HoTen;
    }

    public String getAnhBia() {
        return AnhBia;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setAnhBia(String AnhBia) {
        this.AnhBia = AnhBia;
    }

    Color DefaultColor, ClickeColor;

    public frmMain() {
        initComponents();
        DefaultColor = new Color(240, 240, 240);
        ClickeColor = new Color(0, 102, 51);

        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        EmptyBorder border = new EmptyBorder(20, 20, 20, 20);
        jDesktopPane.setBorder(border);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTrangChu = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblLoaiSanPham = new javax.swing.JLabel();
        lblNSX = new javax.swing.JLabel();
        lblPhieuNhap = new javax.swing.JLabel();
        lblDonHang = new javax.swing.JLabel();
        lblTaiKhoan1 = new javax.swing.JLabel();
        lblTenMucChon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenDM = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setText("TenDN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 130));

        lblTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setText("Trang Chủ");
        lblTrangChu.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
        });
        jPanel1.add(lblTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 50));

        lblTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan.setText("Tài Khoản");
        lblTaiKhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoanMouseClicked(evt);
            }
        });
        jPanel1.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 260, 50));

        lblSanPham.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });
        jPanel1.add(lblSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 50));

        lblLoaiSanPham.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblLoaiSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblLoaiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoaiSanPham.setText("Loại Sản Phẩm");
        lblLoaiSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblLoaiSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoaiSanPhamMouseClicked(evt);
            }
        });
        jPanel1.add(lblLoaiSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 50));

        lblNSX.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblNSX.setForeground(new java.awt.Color(255, 255, 255));
        lblNSX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSX.setText("Nhà Sản Xuất");
        lblNSX.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblNSX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNSXMouseClicked(evt);
            }
        });
        jPanel1.add(lblNSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 50));

        lblPhieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhieuNhap.setText("Phiếu Nhập");
        lblPhieuNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPhieuNhapMouseClicked(evt);
            }
        });
        jPanel1.add(lblPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 50));

        lblDonHang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setText("Đơn Hàng");
        lblDonHang.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDonHangMouseClicked(evt);
            }
        });
        jPanel1.add(lblDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 260, 50));

        lblTaiKhoan1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTaiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan1.setText("Đăng Xuất");
        lblTaiKhoan1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblTaiKhoan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTaiKhoan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoan1MouseClicked(evt);
            }
        });
        jPanel1.add(lblTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 260, 50));

        lblTenMucChon.setBackground(new java.awt.Color(255, 255, 255));
        lblTenMucChon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("TenND");

        lblTenDM.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTenDM.setForeground(new java.awt.Color(0, 102, 51));
        lblTenDM.setText("Tên mục chọn");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout lblTenMucChonLayout = new javax.swing.GroupLayout(lblTenMucChon);
        lblTenMucChon.setLayout(lblTenMucChonLayout);
        lblTenMucChonLayout.setHorizontalGroup(
            lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTenMucChonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTenDM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
        );
        lblTenMucChonLayout.setVerticalGroup(
            lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTenMucChonLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTenDM)
                        .addComponent(jLabel1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenMucChon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblTenMucChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        lblTrangChu.setBackground(ClickeColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblTenDM.setText(lblTaiKhoan.getText());
        frmTrangChu asp = new frmTrangChu();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);

    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void lblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoanMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(ClickeColor);
        lblTenDM.setText(lblTaiKhoan.getText());
        frmTaiKhoan asp = new frmTaiKhoan();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_lblTaiKhoanMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(ClickeColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblTenDM.setText(lblSanPham.getText());
        frmSanPham asp = new frmSanPham();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoaiSanPhamMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblLoaiSanPham.setBackground(ClickeColor);
        lblTenDM.setText(lblLoaiSanPham.getText());
        frmLoaiSanPham asp = new frmLoaiSanPham();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);

    }//GEN-LAST:event_lblLoaiSanPhamMouseClicked

    private void lblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNSXMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblLoaiSanPham.setBackground(DefaultColor);
        lblNSX.setBackground(ClickeColor);
        lblTenDM.setText(lblNSX.getText());
        frmNSX asp = new frmNSX();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_lblNSXMouseClicked

    private void lblPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhieuNhapMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblLoaiSanPham.setBackground(DefaultColor);
        lblNSX.setBackground(DefaultColor);
        lblPhieuNhap.setBackground(ClickeColor);
        lblTenDM.setText(lblPhieuNhap.getText());
        frmPhieuNhap asp = new frmPhieuNhap();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_lblPhieuNhapMouseClicked

    private void lblDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDonHangMouseClicked
        lblTrangChu.setBackground(DefaultColor);
        lblSanPham.setBackground(DefaultColor);
        lblTaiKhoan.setBackground(DefaultColor);
        lblLoaiSanPham.setBackground(DefaultColor);
        lblNSX.setBackground(DefaultColor);
        lblPhieuNhap.setBackground(DefaultColor);
        lblDonHang.setBackground(ClickeColor);
        lblTenDM.setText(lblPhieuNhap.getText());
        frmDonHang asp = new frmDonHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_lblDonHangMouseClicked

    private void lblTaiKhoan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoan1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTaiKhoan1MouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblLoaiSanPham;
    private javax.swing.JLabel lblNSX;
    private javax.swing.JLabel lblPhieuNhap;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTaiKhoan1;
    private javax.swing.JLabel lblTenDM;
    private javax.swing.JPanel lblTenMucChon;
    private javax.swing.JLabel lblTrangChu;
    // End of variables declaration//GEN-END:variables
}
