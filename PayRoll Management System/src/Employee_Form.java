
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yashs
 */
public class Employee_Form extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Form
     */
    Connection con;
    PreparedStatement ps;
    public Employee_Form() {
        initComponents();
        
         setTitle("Payroll Management System");
        getContentPane().setBackground(Color.yellow);
        empid.setEditable(false);
    
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollmangement","root","");
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null,ee);
            
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        role1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        depart = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        basicsal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        d2 = new com.toedter.calendar.JDateChooser();
        Fname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        main = new javax.swing.JButton();
        d1 = new com.toedter.calendar.JDateChooser();
        emeMobile = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        parmanentaddress = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Payroll Management System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Please fill the details below :-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Emp- Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 30));
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Basic Salary");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 90, 30));
        getContentPane().add(role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 60, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Date of Joining");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 100, 30));
        getContentPane().add(basicsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Role");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 90, 30));

        d2.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 210, 30));
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 210, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("F. Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 90, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Depart");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 30));

        back.setBackground(new java.awt.Color(255, 102, 0));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 102));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 220, 30));

        clear.setBackground(new java.awt.Color(255, 102, 0));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 102));
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, 30));

        add.setBackground(new java.awt.Color(255, 102, 0));
        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 102));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 220, 30));

        main.setBackground(new java.awt.Color(255, 102, 0));
        main.setForeground(new java.awt.Color(0, 0, 102));
        main.setText("Main Menu");
        main.setBorder(null);
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 90, 30));

        d1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, 30));
        getContentPane().add(emeMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 210, 30));
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Eme Mobile");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 90, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Mobile");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 30));
        getContentPane().add(parmanentaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 210, 30));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Parmanent Add");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 110, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Add Employee");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 660, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String dob=((JTextField)d1.getDateEditor().getUiComponent()).getText();
        String doa=((JTextField)d2.getDateEditor().getUiComponent()).getText();
        
         if(name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"NAME IS MANDATORY");
        }
         
         if(Fname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"FATHER NAME IS MANDATORY");
        }

          if(mobile.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"CONTACT NUMBER IS MANDATORY");
        }
          
          if(emeMobile.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"EMERGENCY CONTACT NUMBER IS MANDATORY");
        }
          
          if(address.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"ADDRESS IS MANDATORY");
        }
          
          if(parmanentaddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"PERMANENT ADDRESS IS MANDATORY");
        }
          
          if(depart.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"DEPARTMENT IS MANDATORY");
        }
          
          if(role1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"ROLE IS MANDATORY");
        }
           if(doa.equals(""))
        {
            JOptionPane.showMessageDialog(null,"DATE OF JOINING IS MANDATORY");
        }
        if(dob.equals(""))
        {
            JOptionPane.showMessageDialog(null,"DATE OF BIRTH IS MANDATORY");
        }
        
        if(basicsal.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"BASIC SALARY IS MANDATORY");
        }
          
        try
        {
            //CONVERT STRING INTO DATE.UTIL
            Date doa1=new SimpleDateFormat("yyyy-MM-dd").parse(doa);
            //CONVERT DATE.UTIL TO DATE.SQL
            java.sql.Date doa2= new java.sql.Date(doa1.getTime());

            Date dob1=new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            java.sql.Date dob2= new java.sql.Date(dob1.getTime());
            //doa and dob me string nahi date hi bhjni hai db me
            ps=con.prepareStatement("INSERT INTO employeedetails (name, dob, fname, address, permanent_address, mobile, eme_mobile, department, role, basic_salary, date_of_joining)"
                    +"values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,name.getText());
            ps.setDate(2,dob2);
            ps.setString(3,Fname.getText());
            ps.setString(4,address.getText());
            ps.setString(5,parmanentaddress.getText());
            ps.setString(6,mobile.getText());
            ps.setString(7,emeMobile.getText());
            ps.setString(8,depart.getText());
            ps.setString(9,role1.getText());
            ps.setInt(10,Integer.parseInt(basicsal.getText()));
            ps.setDate(11,doa2);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY");
            ps=con.prepareStatement("select empid from employeedetails where name=? and fname=?");
            ps.setString(1,name.getText());
            ps.setString(2,Fname.getText());
            ResultSet rs1=ps.executeQuery();
            int empid=0;
            if(rs1.next())
            {
                empid=rs1.getInt(1);
            }
            JOptionPane.showMessageDialog(null,"YOUR EMPLOYEE ID IS : "+empid);
            name.setText("");d1.setCalendar(null);Fname.setText("");depart.setText("");role1.setText("");
            d2.setCalendar(null);address.setText("");parmanentaddress.setText("");mobile.setText("");emeMobile.setText("");
            basicsal.setText("");
            
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null,ee+"INVALID ENTRY, PLEASE ENTER AGAIN");
            System.out.println(ee);
        }
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        this.setVisible(false);
        new Employee_info().setVisible(true);
    }//GEN-LAST:event_mainActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      name.setText("");d1.setCalendar(null);Fname.setText("");depart.setText("");role1.setText("");
            d2.setCalendar(null);address.setText("");parmanentaddress.setText("");mobile.setText("");emeMobile.setText("");
            basicsal.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new Employee_info().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField basicsal;
    private javax.swing.JButton clear;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField emeMobile;
    private javax.swing.JTextField empid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton main;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField parmanentaddress;
    private javax.swing.JTextField role1;
    // End of variables declaration//GEN-END:variables
}