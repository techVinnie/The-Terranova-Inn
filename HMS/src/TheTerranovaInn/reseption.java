/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheTerranovaInn;



import checkout.*;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import tour.tour_customer_select_package_2;
import tour.*;
import Reservation.*;
import Food.*;
import Employee.*;
import Event.*;
import Services.*;
import com.mysql.jdbc.Connection;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Akila Sachin
 */
public class reseption extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst = null;
    ResultSet rst=null;
    String room;
    String descr;

    public void clock(){
        
        Thread tclock=new Thread()
        {
             public void run(){
                try {
                        for(;;){
                            
                             DateFormat df = new SimpleDateFormat("hh:mm:ss");
                             Date d=new Date();
                             String s=df.format(d);
                             clock.setText(s);    
                             
                             DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
                             String s1=df1.format(d);
                             date.setText(s1); 
                    
                             sleep(1000);
                    
                        }
                } catch (Exception e) {
                    e.printStackTrace();;
                }
            }
        };
        
        tclock.start();
        
    }
      
      public void not(){
        
        Thread not=new Thread()
        {
             public void run(){
                try {
                        for(;;){
                            servicetable();

                             sleep(10000);
                    
                        }
                } catch (Exception e) {
                    e.printStackTrace();;
                }
            }
        };
        
        not.start();
        
    }
    public void food(){
        try {
              String que="Select roomNo as 'Room', foodName as 'Food', qty as 'Qty' from reqfoodlist";
            pst=con.prepareStatement(que);
            rst=pst.executeQuery();

                        jTable1.setModel(DbUtils.resultSetToTableModel(rst));

             
        } catch (Exception e) {
            System.out.println(e);
        }  
    }
    
        public void servicetable(){
        try {
              String que="Select serviceId as 'SID' , room as 'Room', serName as 'Service Name', comment as 'Comment' from services";
            pst=con.prepareStatement(que);
            rst=pst.executeQuery();

                        jTable2.setModel(DbUtils.resultSetToTableModel(rst));

             
        } catch (Exception e) {
            System.out.println(e);
        }  
    }
    /**
     * Creates new form main
     */
    public reseption() {
        initComponents();
        
        
         Toolkit tk=Toolkit.getDefaultToolkit();
            int xsize=(int) tk.getScreenSize().getWidth();
            int ysize=(int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
       
        
        clock();
        not();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(68, 98, 162));
        setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(47, 71, 123));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(76, 123, 217));
        jTextField1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Notifications");
        jTextField1.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("to Accept the Request");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Select a Request and click accept button");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No", "Food Name", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Room No", "Service Name", "Comment", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1057, 90, 300, 750);

        jPanel1.setLayout(null);

        date.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        jPanel1.add(date);
        date.setBounds(830, 20, 230, 70);

        clock.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        jPanel1.add(clock);
        clock.setBounds(60, 20, 470, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/title bar1.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 91);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 90);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 89, 1060, 750);

        jMenuBar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu5.setText("Guest Reservation");

        jMenuItem1.setText("Check In");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem9.setText("Check Out");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem4.setText("Room Details");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        jMenu8.setText("Tour Management");

        jMenuItem2.setText("Customer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem6.setText("summery");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuBar2.add(jMenu8);

        jMenu6.setText("Food & Beverages");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem14.setText("Request Food");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Other Request Item");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem17.setText("Orders");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuBar2.add(jMenu6);

        jMenu9.setText("Employee Management");

        jMenuItem24.setText("Attendance");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem24);

        jMenuBar2.add(jMenu9);

        jMenu10.setText("Services");

        jMenuItem25.setText("Room Defects & Repairs");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem25);

        jMenuItem26.setText("Room Arrangement");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem26);

        jMenuItem27.setText("Guest Security Management");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem27);

        jMenuItem28.setText("Laundry Service");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem28);

        jMenuBar2.add(jMenu10);

        jMenu11.setText(" Event Management");

        jMenuItem30.setText("Registration");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem30);

        jMenuItem31.setText("Location");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem31);

        jMenuItem32.setText("Menu");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem32);

        jMenuItem33.setText("Extra Decorations");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem33);

        jMenuItem34.setText("Upcoming Events");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem34);

        jMenuItem38.setText("Reserve Ticket");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem38);

        jMenuItem39.setText("Final Payment");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem39);

        jMenuBar2.add(jMenu11);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        tour_customer_select_package_2 c=new tour_customer_select_package_2();
        c.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        tour_reception_in reception = new tour_reception_in();
        jDesktopPane1.add(reception);
        reception.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        RequestFood r = new RequestFood();
        jDesktopPane1.add(r);
        r.show();

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Delivery d = new Delivery();
        jDesktopPane1.add(d);
        d.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Orders1 o= new Orders1();
        jDesktopPane1.add(o);
        o.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Attendance at= new Attendance();
        jDesktopPane1.add(at);
        at.show();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        DefectsInN di= new DefectsInN();
        jDesktopPane1.add(di);
        di.show();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Room_ArrIn ra= new Room_ArrIn();
        jDesktopPane1.add(ra);
        ra.show();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        SecurityIn si= new SecurityIn();
        jDesktopPane1.add(si);
        si.show();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        LaundryInN li= new LaundryInN();
        jDesktopPane1.add(li);
        li.show();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        reg1 re= new reg1();
        jDesktopPane1.add(re);
        re.show();

    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Location1 lo= new Location1();
        lo.setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        usualMenu um= new usualMenu();
        um.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        ExtraDeco ed= new ExtraDeco();
        jDesktopPane1.add(ed);
        ed.show();
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Upcomings uc= new Upcomings();
        uc.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        ReserveTicket sm= new ReserveTicket();
        jDesktopPane1.add(sm);
        sm.show();
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        Payment p=new Payment();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        CheckOut co= new CheckOut();
        jDesktopPane1.add(co);
        co.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Room_Details obj=new Room_Details();
        jDesktopPane1.add(obj).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        Check_In r1=new Check_In();
        jDesktopPane1.add(r1).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r= jTable1.getSelectedRow();
                String roomn=jTable1.getValueAt(r,0).toString();
                String foodn=jTable1.getValueAt(r,1).toString();
                String Qty=jTable1.getValueAt(r,2).toString();
        
                showMessageDialog(null, "RoomNo   : "+roomn+"\n"
                                      + "Food Name: "+foodn+"\n"
                                      + "Qty      : "+Qty);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        
        int r= jTable2.getSelectedRow();
                String roomn=jTable2.getValueAt(r,1).toString();
                String sern=jTable2.getValueAt(r,2).toString();
                String cmnt=jTable2.getValueAt(r,3).toString();
                String sid=jTable2.getValueAt(r,0).toString();
                
                String[] buttons = { "Accept", "Cancel"};
                
                int rc = JOptionPane.showOptionDialog(null, "RoomNo   : "+roomn+"\n"
                                      + "Service Name: "+sern+"\n"
                                      + "Comment      : "+cmnt, "Service Info",
                                    JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                
                if(rc==0){
                    try {
                            String que="delete from services where serviceId=?";
                            pst=con.prepareStatement(que);
                            pst.setString(1, sid);
                            pst.execute();
                            
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,"Error Deleting mobile service"+e,"Error",JOptionPane.INFORMATION_MESSAGE);
                    }

                }    
    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * @param args the command line argumentsjDesktopPane1.removeAll();
       
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
            java.util.logging.Logger.getLogger(reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reseption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clock;
    private javax.swing.JLabel date;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
