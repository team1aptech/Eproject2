/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author uphoto
 */
public class loginScreen extends javax.swing.JFrame {

    checkEmpty check = new checkEmpty();
    public loginScreen() {
        initComponents();
        check.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLoginUser = new javax.swing.JLabel();
        ldbLoginPass = new javax.swing.JLabel();
        txtLoginUser = new javax.swing.JTextField();
        txtLoginPass = new javax.swing.JPasswordField();
        btnLoginLogin = new javax.swing.JButton();
        btnLoginExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblLoginUser.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginUser.setText("Username");

        ldbLoginPass.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        ldbLoginPass.setForeground(new java.awt.Color(255, 255, 255));
        ldbLoginPass.setText("Password");

        txtLoginPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginPassActionPerformed(evt);
            }
        });

        btnLoginLogin.setBackground(new java.awt.Color(153, 153, 153));
        btnLoginLogin.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnLoginLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLoginLogin.setBorderPainted(false);
        btnLoginLogin.setContentAreaFilled(false);
        btnLoginLogin.setOpaque(false);
        btnLoginLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginLoginMouseReleased(evt);
            }
        });

        btnLoginExit.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnLoginExit.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit2.png"))); // NOI18N
        btnLoginExit.setBorderPainted(false);
        btnLoginExit.setContentAreaFilled(false);
        btnLoginExit.setOpaque(false);
        btnLoginExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginExitMouseReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-icon-10.png"))); // NOI18N

        tittle.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("PHẦN MỀM QUẢN LÝ KHÁCH SẠN");
        tittle.setSize(new java.awt.Dimension(60, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ldbLoginPass)
                        .addGap(27, 27, 27)
                        .addComponent(txtLoginPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoginExit)
                    .addComponent(btnLoginLogin))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLoginPass, txtLoginUser});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLoginExit, btnLoginLogin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoginUser)
                            .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldbLoginPass)
                            .addComponent(txtLoginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoginLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoginExit)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginPassActionPerformed

    private void btnLoginExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_btnLoginExitMouseReleased

    private void btnLoginLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLoginMouseReleased
        if(btnLoginLogin.isEnabled()){
            try {
                if(User.checkPass(txtLoginUser.getText().trim(), txtLoginPass.getText().trim())){
                    JOptionPane.showMessageDialog(null, "Login Success");
                }else JOptionPane.showMessageDialog(null, "Login Faile");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginLoginMouseReleased

    class checkEmpty extends Thread{

        @Override
        public void run() {
            System.out.println("Thread started");
            while(true){
                try {
                    sleep(1);
                    if(txtLoginUser.getText().trim().isEmpty() || txtLoginPass.getText().trim().isEmpty()){
                        btnLoginLogin.setEnabled(false);
                        
                    }else btnLoginLogin.setEnabled(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
}
    
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
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginExit;
    private javax.swing.JButton btnLoginLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoginUser;
    private javax.swing.JLabel ldbLoginPass;
    private javax.swing.JLabel tittle;
    private javax.swing.JPasswordField txtLoginPass;
    private javax.swing.JTextField txtLoginUser;
    // End of variables declaration//GEN-END:variables
}
