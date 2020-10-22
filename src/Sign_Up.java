import java.sql.*;
import javax.swing.JOptionPane;
import java.lang.*;
import diu.swe.habib.JavaToast.JToast;
import java.awt.Color;


public class Sign_Up extends javax.swing.JFrame {

    public Sign_Up() {
        initComponents();
        setSize(1000,600);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        surname = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 44, 44));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(44, 44, 44));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel1.setBackground(new java.awt.Color(44, 44, 44));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP PAGE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 320, 80));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 160, 38));

        surname.setBackground(new java.awt.Color(44, 44, 44));
        surname.setForeground(new java.awt.Color(255, 255, 255));
        surname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        surname.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 180, -1));

        cno.setBackground(new java.awt.Color(44, 44, 44));
        cno.setForeground(new java.awt.Color(255, 255, 255));
        cno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        cno.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 180, -1));

        ano.setBackground(new java.awt.Color(44, 44, 44));
        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        ano.setCaretColor(new java.awt.Color(255, 255, 255));
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });
        jPanel3.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        state.setBackground(new java.awt.Color(44, 44, 44));
        state.setForeground(new java.awt.Color(255, 255, 255));
        state.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        state.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, -1));

        email.setBackground(new java.awt.Color(44, 44, 44));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        email.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        dob.setBackground(new java.awt.Color(44, 44, 44));
        dob.setForeground(new java.awt.Color(255, 255, 255));
        dob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        dob.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 180, -1));

        city.setBackground(new java.awt.Color(44, 44, 44));
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        city.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 130, -1));

        pin.setBackground(new java.awt.Color(44, 44, 44));
        pin.setForeground(new java.awt.Color(255, 255, 255));
        pin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        pin.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, -1));

        name.setBackground(new java.awt.Color(44, 44, 44));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        street.setBackground(new java.awt.Color(44, 44, 44));
        street.setForeground(new java.awt.Color(255, 255, 255));
        street.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        street.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 120, -1));

        pwd.setBackground(new java.awt.Color(44, 44, 44));
        pwd.setForeground(new java.awt.Color(255, 255, 255));
        pwd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        pwd.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 180, -1));

        jLabel2.setBackground(new java.awt.Color(44, 44, 44));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Surname");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel3.setBackground(new java.awt.Color(44, 44, 44));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aadhar No. ");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 220, -1, -1));

        jLabel4.setBackground(new java.awt.Color(44, 44, 44));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact No.");
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, -1));

        jLabel5.setBackground(new java.awt.Color(44, 44, 44));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email ID");
        jLabel5.setToolTipText("");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, -1));

        jLabel6.setBackground(new java.awt.Color(44, 44, 44));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel7.setBackground(new java.awt.Color(44, 44, 44));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        jLabel7.setToolTipText("");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel8.setBackground(new java.awt.Color(44, 44, 44));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("State");
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel9.setBackground(new java.awt.Color(44, 44, 44));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City");
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel10.setBackground(new java.awt.Color(44, 44, 44));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Street");
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel11.setBackground(new java.awt.Color(44, 44, 44));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PIN Code");
        jLabel11.setToolTipText("");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        jLabel12.setBackground(new java.awt.Color(44, 44, 44));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("YYYY-MM-DD");
        jLabel12.setToolTipText("");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        jLabel14.setBackground(new java.awt.Color(44, 44, 44));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name");
        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel13.setBackground(new java.awt.Color(44, 44, 44));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");
        jLabel13.setToolTipText("");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 0, 810, 650);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 190, 650);

        setSize(new java.awt.Dimension(1019, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13"); 
            long ano1 = Long.parseLong(ano.getText());
            String name1 = name.getText();
            String surname1 = surname.getText();
            String email1 = email.getText();
            String dob1 = dob.getText();
            String street1 = street.getText();
            int pin1 = Integer.parseInt(pin.getText());
            String pwd1 = pwd.getText();
            String city1 = city.getText();
            String state1 = state.getText();
            long cno1 = Long.parseLong(cno.getText());
               
           CallableStatement cstmt = con.prepareCall("{call add_passenger(?, ? ,?, ?, ?, ?, ? ,?, ?, ?, ?, ?)}");
           cstmt.setLong(1, ano1);
           cstmt.setString(2,name1);
           cstmt.setString(3,surname1);
           cstmt.setString(4,email1);
           cstmt.setString(5,dob1);
           cstmt.setString(6,street1);
           cstmt.setInt(7, pin1);
           cstmt.setLong(8, cno1);
           cstmt.setString(9,pwd1);
           cstmt.setString(10,city1);
           cstmt.setString(11,state1);
           cstmt.registerOutParameter(12, Types.INTEGER);
           cstmt.executeUpdate();
           int status = cstmt.getInt(12);
           if (status == 1)
           {
                new JToast().makeToast(this, "Account Created",1);
                new First_page().setVisible(true);
                this.setVisible(false);
           }   
           else
           {
               new JToast().makeToast(this, "Incorrect Data",1);    
           }
        }
        catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new First_page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField pwd;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
