
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class login_staff extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login_staff() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stafflogin_id = new javax.swing.JTextField();
        stafflogin_password = new javax.swing.JPasswordField();
        forgot_btn = new javax.swing.JLabel();
        shutdown_btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        login_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 543));
        setMinimumSize(new java.awt.Dimension(480, 543));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(228, 68, 33));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 543));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 543));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/logingif.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff Login for MTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 196, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff ID no.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 253, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 323, -1, -1));

        stafflogin_id.setBackground(new java.awt.Color(228, 68, 33));
        stafflogin_id.setForeground(new java.awt.Color(255, 255, 255));
        stafflogin_id.setText("enter your given staff ID");
        stafflogin_id.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(204, 51, 0)));
        stafflogin_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btns_click(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btns_exit(evt);
            }
        });
        jPanel1.add(stafflogin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 279, 360, 26));

        stafflogin_password.setBackground(new java.awt.Color(228, 68, 33));
        stafflogin_password.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        stafflogin_password.setForeground(new java.awt.Color(255, 255, 255));
        stafflogin_password.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(204, 51, 0)));
        jPanel1.add(stafflogin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 349, 360, 24));

        forgot_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forgot_btn.setForeground(new java.awt.Color(255, 255, 255));
        forgot_btn.setText("Forgot password?");
        forgot_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        forgot_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btns_exit(evt);
            }
        });
        jPanel1.add(forgot_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 379, -1, -1));

        shutdown_btn.setBackground(new java.awt.Color(255, 153, 0));
        shutdown_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btns_exit(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Shut Down System");

        javax.swing.GroupLayout shutdown_btnLayout = new javax.swing.GroupLayout(shutdown_btn);
        shutdown_btn.setLayout(shutdown_btnLayout);
        shutdown_btnLayout.setHorizontalGroup(
            shutdown_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shutdown_btnLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
        );
        shutdown_btnLayout.setVerticalGroup(
            shutdown_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(shutdown_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 160, 20));

        login_btn.setBackground(new java.awt.Color(228, 68, 33));
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btns_exit(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Log in");

        javax.swing.GroupLayout login_btnLayout = new javax.swing.GroupLayout(login_btn);
        login_btn.setLayout(login_btnLayout);
        login_btnLayout.setHorizontalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_btnLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        login_btnLayout.setVerticalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btns_enter
        // login_staff buttons hover in
        if(evt.getSource()==login_btn)
            login_btn.setBackground(new java.awt.Color(204,51,0));
        if(evt.getSource()==shutdown_btn)
            shutdown_btn.setBackground(new java.awt.Color(255,102,0));
        //lag if ang forgot button iswitch to italics huhu
      
    }//GEN-LAST:event_login_btns_enter

    private void login_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btns_exit
        // login_staff buttons hover out
        if(evt.getSource()==login_btn)
            login_btn.setBackground(new java.awt.Color(228,68,33));
        if(evt.getSource()==shutdown_btn)
            shutdown_btn.setBackground(new java.awt.Color(255,153,0));
        
        String login_staffid = stafflogin_id.getText();
        if(evt.getSource()==stafflogin_id){
            stafflogin_id.setEditable(false);
       
        if (login_staffid.trim().equals("")){
                stafflogin_id.setText("enter your given staff ID");
            }
        }

    }//GEN-LAST:event_login_btns_exit

    private void login_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btns_click
        // login_staff buttons on click
        if(evt.getSource()==shutdown_btn)
            System.exit(0);
        
        String login_staffid = stafflogin_id.getText();
        if(evt.getSource()==stafflogin_id){
            stafflogin_id.setEditable(true);
        if (login_staffid != null){
                stafflogin_id.setText(login_staffid);
        } 
        if (login_staffid.trim().equals("enter your given staff ID")){
                stafflogin_id.setText("");
        }
            
        }
        
        if(evt.getSource()==login_btn)
            
             try {
          

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String sql = "Select * from staff_accounts where staff_id=? and password=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,stafflogin_id.getText());
            pst.setString(2,stafflogin_password.getText());
            ResultSet rs=pst.executeQuery();
            
            if (rs.next()){
                
                new staff_space().setVisible(true);
                dispose();

            }
            
            else
            
            new staff_error_login().setVisible(true);
            stafflogin_password.setText("");
            

        }
        catch (Exception e)
        {
            new staff_error_login().setVisible(true);
            stafflogin_password.setText("");
        }
    }//GEN-LAST:event_login_btns_click

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
            java.util.logging.Logger.getLogger(login_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel login_btn;
    private javax.swing.JPanel shutdown_btn;
    private javax.swing.JTextField stafflogin_id;
    private javax.swing.JPasswordField stafflogin_password;
    // End of variables declaration//GEN-END:variables
}
