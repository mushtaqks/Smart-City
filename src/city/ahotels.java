/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author admin
 */
public class ahotels extends javax.swing.JFrame {

    /**
     * Creates new form ahotels
     */
    public ahotels() {
        initComponents();
        fetch();
    }
    
     public void fetch(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/city","root","mush123");
            PreparedStatement ps = conn.prepareStatement("SELECT * from hotel;");
	    ResultSet rs  = (ResultSet) ps.executeQuery();
            
            table_hotel.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);    
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_hotel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_hotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "LOCATION", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_hotel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 425, 247));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\IMG\\4-star-hotel.png")); // NOI18N
        jLabel1.setText("HOTELS IN BANGLORE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 121));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NAME :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("LOCATION :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("AMOUNT :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 96, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 96, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 96, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 48, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\IMG\\beautiful-color-ui-gradients-backgrounds-roseanna.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/city","root","mush123");
				PreparedStatement ps = conn.prepareStatement("insert into hotel (name,location,amount) values (?,?,?);");
				ps.setString(1,jTextField1.getText());
				ps.setString (2,jTextField2.getText());
				ps.setString(3,jTextField3.getText());
				
				int zx = ps.executeUpdate();
				if(zx>0)
				{
					System.out.println("Sucessful");
				}else
				{
					System.out.println("Unsucessful");
				}
			
			String name = jTextField1.getText();
			String loc = jTextField2.getText();
			String amount = jTextField3.getText();
			
			if( name.isEmpty() || loc.isEmpty() || amount.isEmpty() )
			{
				JOptionPane.showMessageDialog(null, "Please fill all required fields","Submission error",JOptionPane.ERROR_MESSAGE);
								
				
			}
			else
			{
				jTextField1.setText(null);
                                jTextField2.setText(null);
                                jTextField3.setText(null);
                                JOptionPane.showMessageDialog(null, "Sucessfully updated","Login info",JOptionPane.PLAIN_MESSAGE);
                                
                                 PreparedStatement ps1 = conn.prepareStatement("SELECT * from hotel;");
                                 ResultSet rs1  = (ResultSet) ps1.executeQuery();
            
                                table_hotel.setModel(DbUtils.resultSetToTableModel(rs1));
                                
				
			}
            }
			catch(Exception e) {
				System.out.println(e);
			}
    }                                        

  /* private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/city","root","mush123");
				PreparedStatement ps = conn.prepareStatement("update hotel set name=?,location=?,amount=? where id = ?;");
				ps.setString(1,jTextField1.getText());
				ps.setString(2,jTextField2.getText());
                                ps.setString(3,jTextField3.getText());
                                ps.setString(4,jTextField3.getText());
           
				int zx = ps.executeUpdate();
				if(zx>0)
				{
					System.out.println("Sucessful");
				}else
				{
					System.out.println("Unsucessful");
				}
			
			String id = jTextField4.getText();
                        String name = jTextField1.getText();
                        String loc = jTextField2.getText();
                        String amt = jTextField3.getText();
			
			if( id.isEmpty() || name.isEmpty() || loc.isEmpty() || amt.isEmpty() )
			{
				JOptionPane.showMessageDialog(null, "Please fill all details","Submission error",JOptionPane.ERROR_MESSAGE);
								
				
			}
			else
			{
				jTextField1.setText(null);
                                JOptionPane.showMessageDialog(null, "Sucessfully updated","Login info",JOptionPane.PLAIN_MESSAGE);
                                
                                 PreparedStatement ps1 = conn.prepareStatement("SELECT * from hotel;");
                                 ResultSet rs1  = (ResultSet) ps1.executeQuery();
            
                                table_hotel.setModel(DbUtils.resultSetToTableModel(rs1));
                                
				
			}
            }
			catch(Exception e) {
				System.out.println(e);
			}
    }//GEN-LAST:event_jButton1ActionPerformed
*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new admin().setVisible(true);
    	this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/city","root","mush123");
				PreparedStatement ps = conn.prepareStatement("delete from hotel where id = ?;");
				ps.setString(1,jTextField5.getText());
				
				int zx = ps.executeUpdate();
				if(zx>0)
				{
					System.out.println("Sucessful");
				}else
				{
					System.out.println("Unsucessful");
				}
			
			String id = jTextField5.getText();
			
			if( id.isEmpty() )
			{
				JOptionPane.showMessageDialog(null, "Please fill ID","Submission error",JOptionPane.ERROR_MESSAGE);
								
				
			}
			else
			{
				jTextField1.setText(null);
                                JOptionPane.showMessageDialog(null, "Sucessfully updated","Login info",JOptionPane.PLAIN_MESSAGE);
                                
                                 PreparedStatement ps1 = conn.prepareStatement("SELECT * from hotel;");
                                 ResultSet rs1  = (ResultSet) ps1.executeQuery();
            
                                table_hotel.setModel(DbUtils.resultSetToTableModel(rs1));
                                
				
			}
            }
			catch(Exception e) {
				System.out.println(e);
			}
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/city","root","mush123");
				PreparedStatement ps = conn.prepareStatement("update hotel set name=?,location=?,amount=? where id = ?;");
                                ps.setString(1,jTextField1.getText());
				ps.setString(2,jTextField2.getText());
				ps.setString(3,jTextField3.getText());
                                ps.setString(4,jTextField4.getText());
           
				int zx = ps.executeUpdate();
				if(zx>0)
				{
					System.out.println("Sucessful");
				}else
				{
					System.out.println("Unsucessful");
				}
			
			String id = jTextField4.getText();
                        String name = jTextField1.getText();
                        String loc = jTextField2.getText();
                        String amt = jTextField3.getText();
			
			if( id.isEmpty() || name.isEmpty() || loc.isEmpty() || amt.isEmpty() )
			{
				JOptionPane.showMessageDialog(null, "Please fill all details","Submission error",JOptionPane.ERROR_MESSAGE);
								
				
			}
			else
			{
				jTextField1.setText(null);
                                JOptionPane.showMessageDialog(null, "Sucessfully updated","Login info",JOptionPane.PLAIN_MESSAGE);
                                
                                 PreparedStatement ps1 = conn.prepareStatement("SELECT * from hotel;");
                                 ResultSet rs1  = (ResultSet) ps1.executeQuery();
            
                                table_hotel.setModel(DbUtils.resultSetToTableModel(rs1));
                                
				
			}
            }
			catch(Exception e) {
				System.out.println(e);
			}
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
            java.util.logging.Logger.getLogger(ahotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ahotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ahotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ahotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ahotels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable table_hotel;
    // End of variables declaration//GEN-END:variables
}
