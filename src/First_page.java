import diu.swe.habib.JavaToast.JToast;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.*;

public class First_page extends javax.swing.JFrame {

    public First_page() {
        initComponents();
        setSize(1000,600); 
        
    }
    String user;
    long aadhar;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        pwd1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Viner Hand ITC", 1, 16)); // NOI18N
        jButton3.setText("Login as Admin");
        jButton3.setBorderPainted(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 180, 50));

        pwd1.setBackground(new java.awt.Color(44, 44, 44));
        pwd1.setForeground(new java.awt.Color(255, 255, 255));
        pwd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        pwd1.setCaretColor(new java.awt.Color(255, 255, 255));
        pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd1ActionPerformed(evt);
            }
        });
        jPanel1.add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 377, 38));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 70, 35));

        jLabel1.setBackground(new java.awt.Color(44, 44, 44));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RAILWAY SYSTEM");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 370, 80));

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 97, 40));

        email1.setBackground(new java.awt.Color(44, 44, 44));
        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        email1.setCaretColor(new java.awt.Color(255, 255, 255));
        email1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 377, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, 38));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jButton1.setText("Log In");
        jButton1.setBorder(null);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, 50));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jButton4.setText("Sign Up");
        jButton4.setBorderPainted(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 120, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(420, 0, 580, 570);

        labelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (2).jpeg"))); // NOI18N
        getContentPane().add(labelimg);
        labelimg.setBounds(0, 0, 420, 570);

        setSize(new java.awt.Dimension(1013, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13");
            
            //String sql1= "Select first_name,aadhar_number from passenger where email=?";
            //PreparedStatement obj1=con.prepareStatement(sql1);
            //obj1.setString(1,email1.getText());
           // ResultSet rs1=obj1.executeQuery();
            
            
            String sql2="Select first_name,aadhar_number from passenger where email=? and passenger_password=?; ";
            PreparedStatement obj2=con.prepareStatement(sql2);
            obj2.setString(1,email1.getText());
            obj2.setString(2,new String (pwd1.getPassword()));
            ResultSet rs2=obj2.executeQuery();
            

            if(rs2.next())
            {
                user = rs2.getString("first_name");
                aadhar = rs2.getLong("aadhar_number");
                new JToast().makeToast(this, "User Authenticated",1);
                new Menu(user, aadhar).setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                email1.setText("");
                pwd1.setText("");
                user = "";
                aadhar = 0;
                
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13");
            String sql="Select * from admin where email=? and admin_password=? ";
            PreparedStatement obj=con.prepareStatement(sql);
            obj.setString(1,email1.getText());
            obj.setString(2,new String (pwd1.getPassword()));

            ResultSet rs1=obj.executeQuery();
            if(rs1.next())
            {
                new JToast().makeToast(this, "Admin Authenticated",1);
                new admin().setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                email1.setText("");
                pwd1.setText("");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Sign_Up().setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelimg;
    private javax.swing.JPasswordField pwd1;
    // End of variables declaration//GEN-END:variables


}
