/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tour;

import database.DBconnect;
import java.awt.Label;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class tour_reception_in_2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form tour_reception_in_2
     */
     
     Connection con = null;
    PreparedStatement pst = null; 
     ResultSet rs = null ;
    public tour_reception_in_2() {
        initComponents();
          con = DBconnect.connect();
          tableload_booking();
              
     
          
    }
    
      String A_cost ;    
         String addtional_cost ;
          String payment ;
            float total_cost ; 
     public void tableload_booking(){
        
        String sql = " select  vehicle_id  ,in_date   , to_date ,customer_id  , drive_l    from vehicle_booking_date "  ;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
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

        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1050, 609));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "calculate payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(null);

        jTextField5.setText("0");
        jPanel5.add(jTextField5);
        jTextField5.setBounds(120, 120, 140, 22);
        jPanel5.add(jTextField6);
        jTextField6.setBounds(119, 45, 140, 22);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer id");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(18, 48, 78, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("00000");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(410, 50, 87, 22);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("payment");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(20, 150, 87, 16);

        jButton5.setBackground(new java.awt.Color(68, 145, 162));
        jButton5.setText("update");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(150, 200, 100, 25);

        jButton1.setBackground(new java.awt.Color(68, 145, 162));
        jButton1.setText("Show Cost");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(20, 200, 110, 25);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("package cost");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(310, 50, 90, 30);

        jButton3.setBackground(new java.awt.Color(68, 145, 162));
        jButton3.setText("Total Cost");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(290, 200, 130, 25);

        jTextField8.setText("0");
        jPanel5.add(jTextField8);
        jTextField8.setBounds(120, 80, 140, 22);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Additional km");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(20, 90, 87, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(410, 90, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("0");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(430, 130, 70, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Additional cost ");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(300, 90, 90, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Cost");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(320, 130, 70, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Discount");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(20, 120, 87, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "PAID" }));
        jPanel5.add(jComboBox1);
        jComboBox1.setBounds(120, 150, 140, 22);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 280, 540, 270);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 50, 75, 27);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(120, 50, 170, 30);

        jToggleButton1.setBackground(new java.awt.Color(68, 145, 162));
        jToggleButton1.setText("Reset");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jToggleButton1);
        jToggleButton1.setBounds(300, 110, 100, 30);

        jToggleButton2.setBackground(new java.awt.Color(68, 145, 162));
        jToggleButton2.setText("Sreach");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jToggleButton2);
        jToggleButton2.setBounds(20, 110, 119, 25);

        jToggleButton3.setBackground(new java.awt.Color(68, 145, 162));
        jToggleButton3.setText("Delete");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jToggleButton3);
        jToggleButton3.setBounds(160, 110, 119, 25);

        jToggleButton4.setBackground(new java.awt.Color(68, 145, 162));
        jToggleButton4.setText("Location Details");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jPanel3.add(jToggleButton4);
        jToggleButton4.setBounds(30, 160, 130, 30);

        jToggleButton5.setBackground(new java.awt.Color(68, 145, 162));
        jToggleButton5.setText("vehicle  Details ");
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseEntered(evt);
            }
        });
        jPanel3.add(jToggleButton5);
        jToggleButton5.setBounds(220, 160, 130, 30);

        jButton2.setBackground(new java.awt.Color(68, 145, 162));
        jButton2.setText("payment details");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(30, 210, 130, 30);

        jToggleButton6.setText("Print Bill");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton6);
        jToggleButton6.setBounds(220, 210, 130, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(590, 280, 410, 270);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Customer Bookin Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 1010, 190);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 10, 1030, 240);
        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(226, -14, 170, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked

        
          String Snumber= jTextField1.getText();
         String sql = " select id ,vehicle_id,in_date   , to_date ,customer_id  ,state   from vehicle_booking_date   where customer_id   like  '%"+Snumber+"%'"  ;
        
         try {
              pst = con.prepareStatement(sql);
             rs = pst.executeQuery();
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             
         } catch (SQLException ex) {
             Logger.getLogger(tour_package_manage_in.class.getName()).log(Level.SEVERE, null, ex);
         }


        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        tableload_booking();

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked

        
         int x =  JOptionPane.showConfirmDialog(null,"Do you want to delete  " );

        if (x==0 ) {
            try {
                String vehicle_id = jTextField1.getText();
                String delete_sql = "delete from it160_customer_selection_package_2 where customer__id ='"+vehicle_id+"' " ;
                pst = con.prepareStatement(delete_sql);
                pst.execute() ;
                tableload_booking();
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
        }

                if (x==0 ) {
            try {
                String vehicle_id = jTextField1.getText();
                String delete_sql = "delete from 160_customer_select_package_1 where 	customer_id ='"+vehicle_id+"' " ;
                pst = con.prepareStatement(delete_sql);
                pst.execute() ;
                tableload_booking();
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
        }
                
                        if (x==0 ) {
            try {
                String vehicle_id = jTextField1.getText();
                String delete_sql = "delete from vehicle_booking_date where customer_id	 ='"+vehicle_id+"' " ;
                pst = con.prepareStatement(delete_sql);
                pst.execute() ;
                tableload_booking();
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
        }
        
                        
                        tableload_booking();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked

         String customer_id =jTextField1.getText(); 
        String sql = " select  	package_id  ,customer_id , location_1 ,location_2 , location_3,location_4,location_5,location_6,location_7,location_8,location_9,location_10    from 160_customer_select_package_1 where customer_id ='"+customer_id+"'"  ;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jToggleButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MouseClicked

          String customer_id =jTextField1.getText(); 
        String sql = " select  	package_id  ,customer__id , vehicle_id , guider, A_cost ,addtional_cost,payment  from  it160_customer_selection_package_2 where customer__id ='"+customer_id+"'"  ;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5MouseClicked
      
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         String customer_id =jTextField6.getText();
     
              String sql = " select   A_cost ,addtional_cost,payment  from  it160_customer_selection_package_2 where customer__id ='"+customer_id+"'"  ;
     
            try{
    
                 Statement stmt = con.createStatement();
             rs = stmt.executeQuery(sql);
      
            
            while (rs.next()) {
         
             A_cost = rs.getString("A_cost");
         
            addtional_cost =rs.getString("addtional_cost");
           payment =rs.getString("payment");
  
            
            }
            
         }
            catch (SQLException ex) {
          //  System.out.println(ex);
        }
            
            
        
                float f_cost  = Float.parseFloat(A_cost);
                  float A_C  = Float.parseFloat(addtional_cost);
                  total_cost = f_cost + A_C ; 
                  
                    jLabel7.setText(String.valueOf(total_cost));
                    jLabel3.setText(String.valueOf(total_cost));
            
         if("PAID".equals(payment)){
                  JFrame parent = new JFrame();

            JOptionPane.showMessageDialog(parent, "payment already done ");        
            }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jToggleButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5MouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

          String customer_id =jTextField1.getText(); 
        String sql = " select  	package_id  ,customer__id ,  A_cost ,addtional_cost,payment  from  it160_customer_selection_package_2 where customer__id ='"+customer_id+"'"  ;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked
    String vehicle_number ;
    String vehicle_pre_cost ;  
    float km  ; 
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
             String customer_id =jTextField6.getText();
     
              String sql = " select   A_cost ,addtional_cost,payment,vehicle_id  from  it160_customer_selection_package_2 where customer__id ='"+customer_id+"'"  ;
     
            try{
    
                 Statement stmt = con.createStatement();
             rs = stmt.executeQuery(sql);
      
            
            while (rs.next()) {
         
             A_cost = rs.getString("A_cost");
         
            addtional_cost =rs.getString("addtional_cost");
           payment =rs.getString("payment");
           vehicle_number =rs.getString("vehicle_id");
  
            
            }
            
         }
            catch (SQLException ex) {
                    System.out.println(ex);
        }
            
      //************************************************************************************************   
              String sql2 = " select per_km_cost from  vehicle where vehicle_id ='"+vehicle_number+"'"  ;
     
            try{
    
                 Statement stmt = con.createStatement();
             rs = stmt.executeQuery(sql2);
      
            
            while (rs.next()) {
         
             vehicle_pre_cost = rs.getString("per_km_cost");
               //   System.out.println(vehicle_pre_cost);
            
            }
            
         }
            catch (SQLException ex) {
           System.out.println(ex);
        }
           float descount = Float.parseFloat (jTextField5.getText());
             float vehicle_c  = Float.parseFloat(vehicle_pre_cost);
                km = Float.parseFloat(jTextField8.getText());
                float f_cost  = Float.parseFloat(A_cost);
                  float A_C  = Float.parseFloat(addtional_cost);
                 
                  total_cost = f_cost + A_C  +(vehicle_c * km );
                 total_cost  = total_cost  - (total_cost *(descount/100));
                  jLabel2.setText(String.valueOf(vehicle_c * km));
                    jLabel7.setText(String.valueOf(f_cost + A_C ));
                    jLabel3.setText(String.valueOf(total_cost));
        
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        int x =  JOptionPane.showConfirmDialog(null,"Do you want to Update" );

        if (x==0 ) {

            try {
                String adii = jLabel2.getText();
                 String it160_Urate = jComboBox1.getSelectedItem().toString();
                    String customer_id =jTextField6.getText();
                String Update_sql = "update it160_customer_selection_package_2 set addtional_cost='"+ adii+"' ,payment='"+it160_Urate+"'  where   customer__id = '"+customer_id+"'";
                pst = con.prepareStatement(Update_sql);
                pst.execute() ;
                tableload_booking();
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
         String    A_cost_a = null ;
          String  addtional_cost_a  = null  ; 
           String payment_a  = null ; 
            String   vehicle_number_a  = null  ;
                      String sql = " select   A_cost ,addtional_cost,payment,vehicle_id  from  it160_customer_selection_package_2 where customer__id ='"+jTextField1.getText()+"'"  ;
     
            try{
    
                 Statement stmt = con.createStatement();
             rs = stmt.executeQuery(sql);
      
            
            while (rs.next()) {
         
             A_cost_a = rs.getString("A_cost");
         
           addtional_cost_a =rs.getString("addtional_cost");
          payment_a =rs.getString("payment");
          vehicle_number_a =rs.getString("vehicle_id");

            
            }
            
         }
            catch (SQLException ex) {
                    System.out.println(ex);
        }
            
            
          String  Array[];    
            Array = new String[20];  
                     String sqlq = " select   location_1,location_2,location_3,location_4,location_5, location_6, location_7 , location_8, location_9  from  160_customer_select_package_1 where customer_id ='"+jTextField1.getText()+"'"  ;
     
            try{
    
                 Statement stmt = con.createStatement();
             rs = stmt.executeQuery(sqlq);
      
            
            while (rs.next()) {
         
           Array[0]= rs.getString("location_1");    
           Array[1]= rs.getString("location_2");
           Array[2]= rs.getString("location_3");
           Array[3]= rs.getString("location_4");
           Array[4]= rs.getString("location_5");
           Array[5]= rs.getString("location_6");
           Array[6]= rs.getString("location_7");
           Array[7]= rs.getString("location_8");
           Array[8]= rs.getString("location_9");
            
            }
            
         }
            catch (SQLException ex) {
                    System.out.println(ex);
        }
              
          String  Array1[];    
            Array1 = new String[20];  
          int f = 0 ;  
        for(int i  = 0  ; i < 10 ; i++){
            
            if( Array[i] != null | !"".equals(Array[i]) |  !"null".equals(Array[i]) ){
                  
               Array1[f]   =Array[i]  ;
               f++ ;
             } 
            
        }

             float cost1 = Float.parseFloat(A_cost_a);
         float cost2 = Float.parseFloat(addtional_cost_a);
          float costp = cost1 +cost2 ; 
           String cccc = String.valueOf(costp);

        String mText="                                   The Terranova inn Tour Charges                                             \n"
            + "----------------------------------------------------------------------------------------------------------------------\n"
          //  + "Guest Name   : " +gname+ "\n"
            + "Guest No                 : " +jTextField1.getText()+ "\n"
 
            +"Estimated Charges        : Rs."+A_cost_a+"\n"
            +"Addtional Charges         : Rs."+addtional_cost_a+"\n"
            +"Vehicle  Charges           : "+vehicle_number_a+"\n"
            +"Select Loacations          :   \n"  
                   +"                    "+  Array1[0] +"\n"
                   +"                    "+  Array1[1] +"\n"
                   +"                    "+  Array1[2] +"\n"
                   +"                    "+  Array1[3] +"\n"
                   +"                    "+  Array1[4] +"\n"
                   +"                    "+  Array1[5] +"\n"
                   +"                    "+  Array1[6] +"\n"
                   +"                    "+  Array1[7] +"\n"
                   +"                    "+  Array1[8] +"\n"
                   +"                    "+  Array1[9] +"\n"
            + "                               --------------------------\n"
           +"Total Payment               Rs : "+cccc+"\n"              
            + "                              --------------------------\n"   
                     
            + "----------------------------------------------------------------------------------------------------------------------\n"
            +"                                                       THANK YOU                                                       \n"
            +"The Terranova Inn\n"
            +"23/B, Kattuwa Road,\n"
            +"Ettukala,\n"
            +"Negombo,\n"
            +"Sri Lanka.\n"
            +"Tel : +9477 847 5698\n\n"
            + "This is computer generated invoice no signature required";

                    jTextArea1.setText(mText);
    
        try {
                boolean complete=jTextArea1.print();
                
                if(complete){
                    JOptionPane.showMessageDialog(null, "done printing","information",JOptionPane.INFORMATION_MESSAGE);

                }
                else{
                    JOptionPane.showMessageDialog(null,"printing","printer",JOptionPane.ERROR_MESSAGE);
                }
                
        } catch (Exception e) {
        }
            


        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables
}