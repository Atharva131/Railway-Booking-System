import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Book_Page extends javax.swing.JFrame {
long aadhar;   
String user;
int amount;

    public Book_Page(String name1,long aadhar1) {
        initComponents();
        setSize(1000,600);
         aadhar = aadhar1;
         name.setText("Welcome " + name1);
        user = name1;
    }

   public Book_Page() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        qty = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        source = new javax.swing.JLabel();
        source1 = new javax.swing.JComboBox<>();
        dest = new javax.swing.JLabel();
        dest1 = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        journey = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setText("Clear Table");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 100, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Book Now");
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel1.setBackground(new java.awt.Color(44, 44, 44));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Ticket");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 305, 60));

        r1.setBackground(new java.awt.Color(44, 44, 44));
        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(204, 204, 204));
        r1.setText("General");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        r2.setBackground(new java.awt.Color(44, 44, 44));
        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(204, 204, 204));
        r2.setText("AC");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        qty.setBackground(new java.awt.Color(204, 204, 204));
        qty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 92, -1));

        jLabel2.setBackground(new java.awt.Color(44, 44, 44));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 113, -1));

        table1.setBackground(new java.awt.Color(44, 44, 44));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Journey ID", "Train_ID", "Train Name", "Source City", "Destination City", "Departure", "Arrival"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(255, 0, 51));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 690, 229));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 84, 35));

        source.setBackground(new java.awt.Color(44, 44, 44));
        source.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        source.setForeground(new java.awt.Color(255, 255, 255));
        source.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        source.setText("Source");
        source.setOpaque(true);
        jPanel1.add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 76, 28));

        source1.setBackground(new java.awt.Color(204, 204, 204));
        source1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kolkata", "Delhi", "Mumbai", "Chennai", " " }));
        source1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                source1ActionPerformed(evt);
            }
        });
        jPanel1.add(source1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        dest.setBackground(new java.awt.Color(44, 44, 44));
        dest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dest.setForeground(new java.awt.Color(255, 255, 255));
        dest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dest.setText("Destination");
        dest.setOpaque(true);
        jPanel1.add(dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 80, 28));

        dest1.setBackground(new java.awt.Color(204, 204, 204));
        dest1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Kolkata", "Mumbai", "Chennai" }));
        dest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dest1ActionPerformed(evt);
            }
        });
        jPanel1.add(dest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 98, -1));

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setText("SEARCH");
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search.setOpaque(true);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 100, 40));

        jLabel7.setBackground(new java.awt.Color(44, 44, 44));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Class");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 113, -1));

        jLabel8.setBackground(new java.awt.Color(44, 44, 44));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Journey ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 113, -1));

        journey.setBackground(new java.awt.Color(44, 44, 44));
        journey.setForeground(new java.awt.Color(255, 255, 255));
        journey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        journey.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        journey.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(journey, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 127, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 600));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setOpaque(true);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 179, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new Menu(user,aadhar).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void source1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_source1ActionPerformed
        String source_city;
                source_city= source1.getSelectedItem().toString();
    }//GEN-LAST:event_source1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
   
        int rows = model.getRowCount();
        if(rows>0)
        {
            for(int i=0;i<rows;i++)
            {
                model.removeRow(0);
            }
        }
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13"); 
            Statement stmt = con.createStatement();
            String query = "select\n" +
            "journey_id,\n" +
            "train_id,\n" +
            "(SELECT train_name FROM train WHERE j.train_id=train_id) AS 'Train',\n" +
            "source_name,\n" +
            "destination_name,\n" +
            "departure,\n" +
            "arrival\n" +
            "from journey j where source_name='"+source1.getSelectedItem().toString()+
                    "' and destination_name='"+dest1.getSelectedItem().toString()+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int jid = rs.getInt("journey_id");
                int tid = rs.getInt("train_id");
                String tname = rs.getString("Train");
                String sname = rs.getString("source_name");
                String dname = rs.getString("destination_name");
                String ddate = rs.getString("departure");
                String adate = rs.getString("arrival");
                model.addRow(new Object[]{jid,tid,tname,sname,dname,ddate,adate});
            }            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
  
    }//GEN-LAST:event_searchActionPerformed

    private void dest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dest1ActionPerformed
       String dest_city = dest1.getSelectedItem().toString();
    }//GEN-LAST:event_dest1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       DefaultTableModel model = (DefaultTableModel)table1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
        {
            for(int i=0;i<rows;i++)
            {
                model.removeRow(0);
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String classn = "general";
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "atharva13");         
            int jid1 = Integer.parseInt(journey.getText());
            int qty1 = Integer.parseInt((String)qty.getSelectedItem());
            if(r1.isSelected())
            {
                classn = "general";
            }
            else
            {
                classn = "AC";
            }
            
            /*Statement stmt = con.createStatement();
            String query = "int amt = select get_fare('"+classn+"',(select train_id from journey where journey_id = '"+jid1+"'),'"+ qty1+"')";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                amount = rs.getInt("amt");
            }    */
            CallableStatement cstmt2 = con.prepareCall("call final_amount(?,?,?,?)"); 
           cstmt2.setString(1,classn);
           cstmt2.setInt(2, jid1);
           cstmt2.setInt(3, qty1);
           cstmt2.registerOutParameter(4, Types.INTEGER);
           cstmt2.executeUpdate();
            amount = cstmt2.getInt(4);
            
            
           CallableStatement cstmt = con.prepareCall("{call booking_ticket(?, ? ,?, ?, ? )}");
           cstmt.setLong(1,aadhar);
           cstmt.setString(2,classn);
           cstmt.setInt(3, jid1);
           cstmt.setInt(4, qty1);
           cstmt.registerOutParameter(5, Types.INTEGER);
           cstmt.executeUpdate();
           String state = cstmt.getString(5);
           if(state == "1")
           {
               JOptionPane.showMessageDialog(null,"Insufficient Seats");
           }    
           else 
           {    
               //amount
               JOptionPane.showMessageDialog(null,"Booking Confirmed");
                new payment(user,amount, aadhar).setVisible(true);
                this.setVisible(false);
           }
        }
         
        catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         } 
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Book_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dest;
    private javax.swing.JComboBox<String> dest1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField journey;
    private javax.swing.JLabel name;
    private javax.swing.JComboBox<String> qty;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JButton search;
    private javax.swing.JLabel source;
    private javax.swing.JComboBox<String> source1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
