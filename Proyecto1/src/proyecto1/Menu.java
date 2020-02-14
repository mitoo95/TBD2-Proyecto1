/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1;

import java.sql.*;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    Connection conexion;
    conexionClass cc = new conexionClass();
    
    /** Creates new form Menu */
    public Menu(Connection conn) {
        initComponents();
        this.conexion = conn;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        createPanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tbl_nametxt = new javax.swing.JTextField();
        val1txt = new javax.swing.JTextField();
        val2txt = new javax.swing.JTextField();
        createTablebtn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        Tabletxta = new javax.swing.JTextArea();
        val3txt = new javax.swing.JTextField();
        val4txt = new javax.swing.JTextField();
        val5txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        createIndextxt = new javax.swing.JTextField();
        createIndexTabletxt = new javax.swing.JTextField();
        createIndexbtn = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        createIndextxta = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        createProcedureName = new javax.swing.JTextField();
        createProcedureType = new javax.swing.JTextField();
        createProcedureStmt = new javax.swing.JTextField();
        jScrollPane18 = new javax.swing.JScrollPane();
        createProceduretxta = new javax.swing.JTextArea();
        createProcedurebtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        createTriggerName = new javax.swing.JTextField();
        createTriggerTableName = new javax.swing.JTextField();
        createTriggerType = new javax.swing.JTextField();
        createTriggerStmt = new javax.swing.JTextField();
        createTriggerbtn = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        createTriggertxta = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        createUsertxta = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        createUserName = new javax.swing.JTextField();
        createUserbtn = new javax.swing.JButton();
        createUserPass = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        createDatabaseName = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        createDatabasetxta = new javax.swing.JTextArea();
        createDatabasebtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        createViewName = new javax.swing.JTextField();
        createViewbtn = new javax.swing.JButton();
        createViewStatement = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        createViewtxta = new javax.swing.JTextArea();
        showPanel = new javax.swing.JPanel();
        AllTablesbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showtxt = new javax.swing.JTextArea();
        AllIndexesbtn = new javax.swing.JButton();
        AllProceduresbtn = new javax.swing.JButton();
        AllTriggersbtn = new javax.swing.JButton();
        AllDatabasesbtn = new javax.swing.JButton();
        AllUsersbtn = new javax.swing.JButton();
        AllViewsbtn = new javax.swing.JButton();
        modifyPanel = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        deletePanel = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteTablebtn = new javax.swing.JButton();
        deleteTabletxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        deleteTabletxta = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deleteIndextxt = new javax.swing.JTextField();
        deleteIndexbtn = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        deleteIndextxta = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deleteProceduretxt = new javax.swing.JTextField();
        deleteProcedurebtn = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        deleteProceduretxta = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deleteTriggertxt = new javax.swing.JTextField();
        deleteTriggersbtn = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        deleteTriggertxta = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deleteUsertxt = new javax.swing.JTextField();
        deleteUsersbtn = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        deleteUsertxta = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deleteDBtxt = new javax.swing.JTextField();
        deleteDBbtn = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        deleteDBtxta = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        deleteViewtxt = new javax.swing.JTextField();
        deleteViewbtn = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        deleteViewtxta = new javax.swing.JTextArea();
        DDLPanel = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableDDL = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        IndexDDL = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ProcedureDDL = new javax.swing.JTextArea();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TriggerDDL = new javax.swing.JTextArea();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        UserDDL = new javax.swing.JTextArea();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        DBDDL = new javax.swing.JTextArea();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ViewsDDL = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createTablebtn.setText("Create");
        createTablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTablebtnActionPerformed(evt);
            }
        });

        Tabletxta.setEditable(false);
        Tabletxta.setColumns(20);
        Tabletxta.setRows(5);
        jScrollPane10.setViewportView(Tabletxta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(val2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(val1txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(tbl_nametxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(val3txt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(val4txt)
                            .addComponent(val5txt))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(createTablebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbl_nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(val1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(val5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(createTablebtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tables", jPanel1);

        jLabel8.setText("Index Name");

        jLabel9.setText("Table Name");

        createIndexbtn.setText("Create");
        createIndexbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createIndexbtnActionPerformed(evt);
            }
        });

        createIndextxta.setEditable(false);
        createIndextxta.setColumns(20);
        createIndextxta.setRows(5);
        jScrollPane17.setViewportView(createIndextxta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createIndexbtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createIndextxt)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(createIndexTabletxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(createIndextxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(createIndexTabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(createIndexbtn)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Indexes", jPanel2);

        jLabel10.setText("Procedure Name");

        jLabel11.setText("Procedure Type");

        jLabel12.setText("Procedure Statement");

        createProceduretxta.setEditable(false);
        createProceduretxta.setColumns(20);
        createProceduretxta.setRows(5);
        jScrollPane18.setViewportView(createProceduretxta);

        createProcedurebtn.setText("Create");
        createProcedurebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProcedurebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createProcedureStmt)
                            .addComponent(createProcedureType)
                            .addComponent(createProcedureName)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(createProcedurebtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(createProcedureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(createProcedureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(createProcedureStmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(createProcedurebtn)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Procedures", jPanel3);

        jLabel13.setText("Trigger Name");

        jLabel14.setText("Table Name");

        jLabel15.setText("Trigger Type");

        jLabel16.setText("Trigger Statement");

        createTriggerbtn.setText("Create");
        createTriggerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTriggerbtnActionPerformed(evt);
            }
        });

        createTriggertxta.setEditable(false);
        createTriggertxta.setColumns(20);
        createTriggertxta.setRows(5);
        jScrollPane19.setViewportView(createTriggertxta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(createTriggerTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createTriggerName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createTriggerType)
                                    .addComponent(createTriggerStmt)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(createTriggerbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTriggerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTriggerTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTriggerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTriggerStmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createTriggerbtn)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Triggers", jPanel4);

        createUsertxta.setEditable(false);
        createUsertxta.setColumns(20);
        createUsertxta.setRows(5);
        jScrollPane20.setViewportView(createUsertxta);

        jLabel17.setText("Username");

        jLabel18.setText("Password");

        createUserbtn.setText("Create");
        createUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(createUserName)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createUserbtn)
                    .addComponent(createUserPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane20)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(createUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(createUserbtn)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Users", jPanel5);

        jLabel19.setText("Database Name");

        createDatabasetxta.setEditable(false);
        createDatabasetxta.setColumns(20);
        createDatabasetxta.setRows(5);
        jScrollPane21.setViewportView(createDatabasetxta);

        createDatabasebtn.setText("Create");
        createDatabasebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDatabasebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createDatabaseName)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(createDatabasebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(createDatabaseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createDatabasebtn)
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Databases", jPanel6);

        jLabel20.setText("View Name");

        jLabel21.setText("View Statement");

        createViewbtn.setText("Create");
        createViewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createViewbtnActionPerformed(evt);
            }
        });

        createViewtxta.setEditable(false);
        createViewtxta.setColumns(20);
        createViewtxta.setRows(5);
        jScrollPane22.setViewportView(createViewtxta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createViewbtn)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createViewName)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(createViewStatement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(createViewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(createViewStatement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(createViewbtn)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Views", jPanel7);

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Create", createPanel);

        AllTablesbtn.setText("Show All Tables");
        AllTablesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllTablesbtnActionPerformed(evt);
            }
        });

        showtxt.setEditable(false);
        showtxt.setColumns(20);
        showtxt.setRows(5);
        jScrollPane1.setViewportView(showtxt);

        AllIndexesbtn.setText("Show All Indexes");
        AllIndexesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllIndexesbtnActionPerformed(evt);
            }
        });

        AllProceduresbtn.setText("Show All Procedures");
        AllProceduresbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllProceduresbtnActionPerformed(evt);
            }
        });

        AllTriggersbtn.setText("Show All Triggers");
        AllTriggersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllTriggersbtnActionPerformed(evt);
            }
        });

        AllDatabasesbtn.setText("Show All Databases");
        AllDatabasesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllDatabasesbtnActionPerformed(evt);
            }
        });

        AllUsersbtn.setText("Show All Users");
        AllUsersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllUsersbtnActionPerformed(evt);
            }
        });

        AllViewsbtn.setText("Show All Views");
        AllViewsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllViewsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AllTablesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllProceduresbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllUsersbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllViewsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AllIndexesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllTriggersbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllDatabasesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(showPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllTablesbtn)
                    .addComponent(AllIndexesbtn))
                .addGap(71, 71, 71)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllTriggersbtn)
                    .addComponent(AllProceduresbtn))
                .addGap(84, 84, 84)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllUsersbtn)
                    .addComponent(AllDatabasesbtn))
                .addGap(69, 69, 69)
                .addComponent(AllViewsbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Show", showPanel);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Tables", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Indexes", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Procedures", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Triggers", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Users", jPanel12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Databases", jPanel13);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Views", jPanel14);

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modify", modifyPanel);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Table Name");

        deleteTablebtn.setText("Delete");
        deleteTablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTablebtnActionPerformed(evt);
            }
        });

        deleteTabletxta.setEditable(false);
        deleteTabletxta.setColumns(20);
        deleteTabletxta.setRows(5);
        jScrollPane2.setViewportView(deleteTabletxta);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(deleteTabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteTablebtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteTablebtn)
                    .addComponent(deleteTabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Tables", jPanel15);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Index Name");

        deleteIndexbtn.setText("Delete");
        deleteIndexbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIndexbtnActionPerformed(evt);
            }
        });

        deleteIndextxta.setEditable(false);
        deleteIndextxta.setColumns(20);
        deleteIndextxta.setRows(5);
        jScrollPane11.setViewportView(deleteIndextxta);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteIndextxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(deleteIndexbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteIndextxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteIndexbtn))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Indexes", jPanel16);

        jLabel3.setText("Procedure");

        deleteProcedurebtn.setText("Delete");
        deleteProcedurebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProcedurebtnActionPerformed(evt);
            }
        });

        deleteProceduretxta.setEditable(false);
        deleteProceduretxta.setColumns(20);
        deleteProceduretxta.setRows(5);
        jScrollPane12.setViewportView(deleteProceduretxta);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(deleteProceduretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deleteProcedurebtn))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProceduretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProcedurebtn))
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Procedures", jPanel17);

        jLabel4.setText("Triggers");

        deleteTriggersbtn.setText("Delete");
        deleteTriggersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTriggersbtnActionPerformed(evt);
            }
        });

        deleteTriggertxta.setEditable(false);
        deleteTriggertxta.setColumns(20);
        deleteTriggertxta.setRows(5);
        jScrollPane13.setViewportView(deleteTriggertxta);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteTriggertxt)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(deleteTriggersbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteTriggertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTriggersbtn))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Triggers", jPanel18);

        jLabel5.setText("Users/Login");

        deleteUsersbtn.setText("Delete");
        deleteUsersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsersbtnActionPerformed(evt);
            }
        });

        deleteUsertxta.setEditable(false);
        deleteUsertxta.setColumns(20);
        deleteUsertxta.setRows(5);
        jScrollPane14.setViewportView(deleteUsertxta);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteUsertxt)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(deleteUsersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUsertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUsersbtn))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Users", jPanel19);

        jLabel6.setText("Database");

        deleteDBbtn.setText("Delete");
        deleteDBbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDBbtnActionPerformed(evt);
            }
        });

        deleteDBtxta.setEditable(false);
        deleteDBtxta.setColumns(20);
        deleteDBtxta.setRows(5);
        jScrollPane15.setViewportView(deleteDBtxta);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(deleteDBtxt))
                .addGap(26, 26, 26)
                .addComponent(deleteDBbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteDBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDBbtn))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Databases", jPanel20);

        jLabel7.setText("View");

        deleteViewbtn.setText("Delete");
        deleteViewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteViewbtnActionPerformed(evt);
            }
        });

        deleteViewtxta.setEditable(false);
        deleteViewtxta.setColumns(20);
        deleteViewtxta.setRows(5);
        jScrollPane16.setViewportView(deleteViewtxta);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteViewtxt)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(deleteViewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteViewtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteViewbtn))
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Views", jPanel21);

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Delete", deletePanel);

        TableDDL.setEditable(false);
        TableDDL.setColumns(20);
        TableDDL.setRows(5);
        jScrollPane3.setViewportView(TableDDL);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Tables", jPanel22);

        IndexDDL.setEditable(false);
        IndexDDL.setColumns(20);
        IndexDDL.setRows(5);
        jScrollPane4.setViewportView(IndexDDL);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Indexes", jPanel23);

        ProcedureDDL.setEditable(false);
        ProcedureDDL.setColumns(20);
        ProcedureDDL.setRows(5);
        jScrollPane5.setViewportView(ProcedureDDL);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Procedures", jPanel24);

        TriggerDDL.setEditable(false);
        TriggerDDL.setColumns(20);
        TriggerDDL.setRows(5);
        jScrollPane6.setViewportView(TriggerDDL);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Triggers", jPanel25);

        UserDDL.setEditable(false);
        UserDDL.setColumns(20);
        UserDDL.setRows(5);
        jScrollPane7.setViewportView(UserDDL);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Users", jPanel26);

        DBDDL.setEditable(false);
        DBDDL.setColumns(20);
        DBDDL.setRows(5);
        jScrollPane8.setViewportView(DBDDL);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Databases", jPanel27);

        ViewsDDL.setEditable(false);
        ViewsDDL.setColumns(20);
        ViewsDDL.setRows(5);
        jScrollPane9.setViewportView(ViewsDDL);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Views", jPanel28);

        javax.swing.GroupLayout DDLPanelLayout = new javax.swing.GroupLayout(DDLPanel);
        DDLPanel.setLayout(DDLPanelLayout);
        DDLPanelLayout.setHorizontalGroup(
            DDLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDLPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        DDLPanelLayout.setVerticalGroup(
            DDLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDLPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DDL", DDLPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AllTablesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllTablesbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showTables());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllTablesbtnActionPerformed

    private void AllIndexesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllIndexesbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showIndexes());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n" + rs.getString(2) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllIndexesbtnActionPerformed

    private void AllProceduresbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllProceduresbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showStoredProcedures());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllProceduresbtnActionPerformed

    private void AllTriggersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllTriggersbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showTriggers());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllTriggersbtnActionPerformed

    private void AllUsersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllUsersbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showUsers());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllUsersbtnActionPerformed

    private void AllDatabasesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllDatabasesbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showDatabases());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllDatabasesbtnActionPerformed

    private void AllViewsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllViewsbtnActionPerformed
        showtxt.setText("");
        try{
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(cc.showViews());
            while(rs.next()){
                showtxt.append(rs.getString(1) + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AllViewsbtnActionPerformed

    private void deleteTablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTablebtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropTable(deleteTabletxt.getText()));
            stmt.close();
            conexion.commit();
            deleteTabletxta.setText(cc.dropTable(deleteTabletxt.getText()));
            TableDDL.append(deleteTabletxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Table does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteTablebtnActionPerformed

    private void createTablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTablebtnActionPerformed
        String tbl_name = tbl_nametxt.getText();
        if(!tbl_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createTable(tbl_nametxt.getText(), val1txt.getText(), val2txt.getText(), val3txt.getText(), val4txt.getText(), val5txt.getText()));
                stmt.close();
                conexion.commit();
                Tabletxta.setText(cc.createTable(tbl_nametxt.getText(), val1txt.getText(), val2txt.getText(), val3txt.getText(), val4txt.getText(), val5txt.getText()));
                TableDDL.append(Tabletxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on table name");
        }
        
    }//GEN-LAST:event_createTablebtnActionPerformed

    private void deleteIndexbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIndexbtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropIndex(deleteIndextxt.getText()));
            stmt.close();
            conexion.commit();
            deleteIndextxta.setText(cc.dropIndex(deleteIndextxt.getText()));
            IndexDDL.append(deleteIndextxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Index does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteIndexbtnActionPerformed

    private void deleteProcedurebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProcedurebtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropProcedure(deleteProceduretxt.getText()));
            stmt.close();
            conexion.commit();
            deleteProceduretxta.setText(cc.dropProcedure(deleteProceduretxt.getText()));
            ProcedureDDL.append(deleteProceduretxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Procedure does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteProcedurebtnActionPerformed

    private void deleteTriggersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTriggersbtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropTrigger(deleteTriggertxt.getText()));
            stmt.close();
            conexion.commit();
            deleteTriggertxta.setText(cc.dropTrigger(deleteTriggertxt.getText()));
            TriggerDDL.append(deleteTriggertxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Trigger does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteTriggersbtnActionPerformed

    private void deleteUsersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsersbtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropUser(deleteUsertxt.getText()));
            stmt.close();
            conexion.commit();
            deleteUsertxta.setText(cc.dropUser(deleteUsertxt.getText()));
            UserDDL.append(deleteUsertxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "User does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteUsersbtnActionPerformed

    private void deleteDBbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDBbtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropDB(deleteDBtxt.getText()));
            stmt.close();
            conexion.commit();
            deleteDBtxta.setText(cc.dropDB(deleteDBtxt.getText()));
            DBDDL.append(deleteDBtxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "DB does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteDBbtnActionPerformed

    private void deleteViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteViewbtnActionPerformed
        try{
            Statement stmt = conexion.createStatement();
            stmt.execute(cc.dropView(deleteViewtxt.getText()));
            stmt.close();
            conexion.commit();
            deleteViewtxta.setText(cc.dropView(deleteViewtxt.getText()));
            ViewsDDL.append(deleteViewtxta.getText() + "\n");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "View does not exist");
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteViewbtnActionPerformed

    private void createIndexbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createIndexbtnActionPerformed
        String ind_name = createIndextxt.getText();
        if(!ind_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createIndex(createIndextxt.getText(), createIndexTabletxt.getText()));
                stmt.close();
                conexion.commit();
                createIndextxta.setText(cc.createIndex(createIndextxt.getText(), createIndexTabletxt.getText()));
                IndexDDL.append(createIndextxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on index name");
        }
    }//GEN-LAST:event_createIndexbtnActionPerformed

    private void createProcedurebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProcedurebtnActionPerformed
        String proc_name = createProcedureName.getText();
        if(!proc_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createProcedure(createProcedureName.getText(), createProcedureType.getText(), createProcedureStmt.getText()));
                stmt.close();
                conexion.commit();
                createProceduretxta.setText(cc.createProcedure(createProcedureName.getText(), createProcedureType.getText(), createProcedureStmt.getText()));
                ProcedureDDL.append(createProceduretxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on procedure name");
        }
    }//GEN-LAST:event_createProcedurebtnActionPerformed

    private void createTriggerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTriggerbtnActionPerformed
        String trig_name = createTriggerName.getText();
        if(!trig_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createTrigger(createTriggerName.getText(), createTriggerTableName.getText(), createTriggerType.getText(), createTriggerStmt.getText()));
                stmt.close();
                conexion.commit();
                createTriggertxta.setText(cc.createTrigger(createTriggerName.getText(), createTriggerTableName.getText(), createTriggerType.getText(), createTriggerStmt.getText()));
                TriggerDDL.append(createTriggertxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on trigger name");
        }
    }//GEN-LAST:event_createTriggerbtnActionPerformed

    private void createUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserbtnActionPerformed
        String user_name = createUserName.getText();
        if(!user_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createUser(createUserName.getText(), createUserPass.getText()));
                stmt.close();
                conexion.commit();
                createUsertxta.setText(cc.createUser(createUserName.getText(), createUserPass.getText()));
                UserDDL.append(createUsertxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on User name");
        }
    }//GEN-LAST:event_createUserbtnActionPerformed

    private void createViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createViewbtnActionPerformed
        String view_name = createViewName.getText();
        if(!view_name.equalsIgnoreCase("")){
            try{
                Statement stmt = conexion.createStatement();
                stmt.execute(cc.createView(createViewName.getText(), createViewStatement.getText()));
                stmt.close();
                conexion.commit();
                createViewtxta.setText(cc.createView(createViewName.getText(), createViewStatement.getText()));
                ViewsDDL.append(createViewtxta.getText() + "\n");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No values entered on View name");
        }
    }//GEN-LAST:event_createViewbtnActionPerformed

    private void createDatabasebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDatabasebtnActionPerformed
        
    }//GEN-LAST:event_createDatabasebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllDatabasesbtn;
    private javax.swing.JButton AllIndexesbtn;
    private javax.swing.JButton AllProceduresbtn;
    private javax.swing.JButton AllTablesbtn;
    private javax.swing.JButton AllTriggersbtn;
    private javax.swing.JButton AllUsersbtn;
    private javax.swing.JButton AllViewsbtn;
    private javax.swing.JTextArea DBDDL;
    private javax.swing.JPanel DDLPanel;
    private javax.swing.JTextArea IndexDDL;
    private javax.swing.JTextArea ProcedureDDL;
    private javax.swing.JTextArea TableDDL;
    private javax.swing.JTextArea Tabletxta;
    private javax.swing.JTextArea TriggerDDL;
    private javax.swing.JTextArea UserDDL;
    private javax.swing.JTextArea ViewsDDL;
    private javax.swing.JTextField createDatabaseName;
    private javax.swing.JButton createDatabasebtn;
    private javax.swing.JTextArea createDatabasetxta;
    private javax.swing.JTextField createIndexTabletxt;
    private javax.swing.JButton createIndexbtn;
    private javax.swing.JTextField createIndextxt;
    private javax.swing.JTextArea createIndextxta;
    private javax.swing.JPanel createPanel;
    private javax.swing.JTextField createProcedureName;
    private javax.swing.JTextField createProcedureStmt;
    private javax.swing.JTextField createProcedureType;
    private javax.swing.JButton createProcedurebtn;
    private javax.swing.JTextArea createProceduretxta;
    private javax.swing.JButton createTablebtn;
    private javax.swing.JTextField createTriggerName;
    private javax.swing.JTextField createTriggerStmt;
    private javax.swing.JTextField createTriggerTableName;
    private javax.swing.JTextField createTriggerType;
    private javax.swing.JButton createTriggerbtn;
    private javax.swing.JTextArea createTriggertxta;
    private javax.swing.JTextField createUserName;
    private javax.swing.JPasswordField createUserPass;
    private javax.swing.JButton createUserbtn;
    private javax.swing.JTextArea createUsertxta;
    private javax.swing.JTextField createViewName;
    private javax.swing.JTextField createViewStatement;
    private javax.swing.JButton createViewbtn;
    private javax.swing.JTextArea createViewtxta;
    private javax.swing.JButton deleteDBbtn;
    private javax.swing.JTextField deleteDBtxt;
    private javax.swing.JTextArea deleteDBtxta;
    private javax.swing.JButton deleteIndexbtn;
    private javax.swing.JTextField deleteIndextxt;
    private javax.swing.JTextArea deleteIndextxta;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton deleteProcedurebtn;
    private javax.swing.JTextField deleteProceduretxt;
    private javax.swing.JTextArea deleteProceduretxta;
    private javax.swing.JButton deleteTablebtn;
    private javax.swing.JTextField deleteTabletxt;
    private javax.swing.JTextArea deleteTabletxta;
    private javax.swing.JButton deleteTriggersbtn;
    private javax.swing.JTextField deleteTriggertxt;
    private javax.swing.JTextArea deleteTriggertxta;
    private javax.swing.JButton deleteUsersbtn;
    private javax.swing.JTextField deleteUsertxt;
    private javax.swing.JTextArea deleteUsertxta;
    private javax.swing.JButton deleteViewbtn;
    private javax.swing.JTextField deleteViewtxt;
    private javax.swing.JTextArea deleteViewtxta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JPanel showPanel;
    private javax.swing.JTextArea showtxt;
    private javax.swing.JTextField tbl_nametxt;
    private javax.swing.JTextField val1txt;
    private javax.swing.JTextField val2txt;
    private javax.swing.JTextField val3txt;
    private javax.swing.JTextField val4txt;
    private javax.swing.JTextField val5txt;
    // End of variables declaration//GEN-END:variables

}
