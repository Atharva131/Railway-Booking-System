
import diu.swe.habib.JavaToast.JToast;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class view_train extends javax.swing.JFrame {

    /**
     * Creates new form view_train
     */
    public view_train() {
        initComponents();
        setSize(1000,600);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        id1 = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("View");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 80, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        table1.setBackground(new java.awt.Color(44, 44, 44));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train ID", "Train Name"
            }
        ));
        table1.setSelectionBackground(new java.awt.Color(255, 0, 0));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 460, 213));

        jLabel3.setBackground(new java.awt.Color(44, 44, 44));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Train Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 78, -1));

        jLabel2.setBackground(new java.awt.Color(44, 44, 44));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Train ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 66, -1));

        jLabel4.setBackground(new java.awt.Color(44, 44, 44));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Train ID to delete corrosponding entry");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 280, 36));

        id2.setBackground(new java.awt.Color(44, 44, 44));
        id2.setForeground(new java.awt.Color(255, 255, 255));
        id2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        id2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 84, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Delete Entry");
        jButton4.setBorderPainted(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 140, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Add Train");
        jButton3.setBorderPainted(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 139, -1));

        id1.setBackground(new java.awt.Color(44, 44, 44));
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        id1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 84, -1));

        name.setBackground(new java.awt.Color(44, 44, 44));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 84, -1));

        jLabel1.setBackground(new java.awt.Color(44, 44, 44));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Train Table");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 460, 61));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13"); 
            Statement stmt = con.createStatement();
            String query = "Select * from train;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("train_id");
                String name = rs.getString("train_name");
               
                model.addRow(new Object[]{id, name});
            }            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13"); 
             Statement stmt = (Statement)con.createStatement();
            int id = Integer.parseInt(id1.getText());
            String name1 = name.getText();
            stmt.executeUpdate("insert into train values('"+id+"','"+name1+"')");
        }
                catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }

        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
        {
            for(int i=0;i<rows;i++)
            {
                model.removeRow(0);
            }
        }
        id1.setText("");
        name.setText("");
        id2.setText("");
         new JToast().makeToast(this, "Value Inserted",1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13"); 
             Statement stmt = (Statement)con.createStatement();
            int id3 = Integer.parseInt(id2.getText());
            stmt.executeUpdate("delete from train where train_id = '"+id3+"'");
        }
                catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }

        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
        {
            for(int i=0;i<rows;i++)
            {
                model.removeRow(0);
            }
        } 
        new JToast().makeToast(this, "Value Deleted",1);
        id1.setText("");
        name.setText("");
        id2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(view_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_train().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id1;
    private javax.swing.JTextField id2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
