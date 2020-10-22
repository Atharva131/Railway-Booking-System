
import javax.swing.JOptionPane;


public class payment extends javax.swing.JFrame {

int pricem; 
String user;
long aadhar;
    public payment() {
        initComponents();
    }
    
    public payment(String name1,int price1, long aadhar1) {
        initComponents();
        setSize(1000,600);
        pricem = price1;
        namelab.setText("Welcome " + name1);
        pricelab.setText("Final Amount: " + pricem + " INR");
        user = name1;
        aadhar = aadhar1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pricelab = new javax.swing.JLabel();
        cred = new javax.swing.JLabel();
        namelab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        netbank1 = new javax.swing.JLabel();
        cred1 = new javax.swing.JLabel();
        gpay1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(44, 44, 44));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 450, 61));

        pricelab.setBackground(new java.awt.Color(44, 44, 44));
        pricelab.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pricelab.setForeground(new java.awt.Color(255, 255, 255));
        pricelab.setOpaque(true);
        jPanel1.add(pricelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 350, 70));

        cred.setBackground(new java.awt.Color(204, 204, 204));
        cred.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cred.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cred.setText("Credit Card");
        cred.setOpaque(true);
        cred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                credMouseClicked(evt);
            }
        });
        jPanel1.add(cred, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 248, 59));

        namelab.setBackground(new java.awt.Color(44, 44, 44));
        namelab.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        namelab.setForeground(new java.awt.Color(255, 255, 255));
        namelab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelab.setOpaque(true);
        jPanel1.add(namelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 248, 59));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        netbank1.setBackground(new java.awt.Color(204, 204, 204));
        netbank1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        netbank1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        netbank1.setText("Net Banking");
        netbank1.setOpaque(true);
        netbank1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                netbank1MouseClicked(evt);
            }
        });
        jPanel1.add(netbank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 248, 59));

        cred1.setBackground(new java.awt.Color(204, 204, 204));
        cred1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cred1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cred1.setText("Credit Card");
        cred1.setOpaque(true);
        jPanel1.add(cred1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 248, 59));

        gpay1.setBackground(new java.awt.Color(204, 204, 204));
        gpay1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gpay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpay1.setText("Gpay");
        gpay1.setOpaque(true);
        gpay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpay1MouseClicked(evt);
            }
        });
        jPanel1.add(gpay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 248, 59));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          new Menu(user,aadhar).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void credMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credMouseClicked
        JOptionPane.showMessageDialog(null,"Payment Complete");
        new Menu(user,aadhar).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_credMouseClicked

    private void netbank1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_netbank1MouseClicked
          JOptionPane.showMessageDialog(null,"Payment Complete");
          new Menu(user,aadhar).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_netbank1MouseClicked

    private void gpay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpay1MouseClicked
        JOptionPane.showMessageDialog(null,"Payment Complete");
        new Menu(user,aadhar).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_gpay1MouseClicked

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cred;
    private javax.swing.JLabel cred1;
    private javax.swing.JLabel gpay1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel namelab;
    private javax.swing.JLabel netbank1;
    private javax.swing.JLabel pricelab;
    // End of variables declaration//GEN-END:variables
}
