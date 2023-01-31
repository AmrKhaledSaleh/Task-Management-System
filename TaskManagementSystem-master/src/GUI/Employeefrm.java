package GUI;

import tms.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Employeefrm extends javax.swing.JFrame {
    private final Employee e = new Employee();
    
    public Employeefrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            new Login().getCurrentUserInfo(e);
            e_name.setText(e.getName());
            e_ID.setText(e.getID() + "");

            e.GetTasks(TasksTable);
            getScrollPane(OtherReason).setVisible(false);// Hide text area
            e.getResults(resultTable);
            e.getRequestTasks(RequestTasks);
        }catch(SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        e_name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        e_ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TasksTable = new javax.swing.JTable();
        EndTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        task_img = new javax.swing.JLabel();
        refreshTasks = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        RequestTasks = new javax.swing.JTable();
        Approve = new javax.swing.JButton();
        Disapprove = new javax.swing.JButton();
        requestsRefresh = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OtherReason = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMS");
        setBackground(new java.awt.Color(89, 193, 189));
        setMinimumSize(new java.awt.Dimension(911, 61));
        setPreferredSize(new java.awt.Dimension(990, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(13, 76, 146));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(911, 561));

        jPanel3.setBackground(new java.awt.Color(207, 245, 231));
        jPanel3.setPreferredSize(new java.awt.Dimension(950, 600));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Welcome Back, ");

        e_name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("After finishing your Shift,");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Log out of the program by log out button to save your departure time.");

        LogOut.setBackground(new java.awt.Color(89, 193, 189));
        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LogOut.setText("Log out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ID :");

        e_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e_name)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(e_ID)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(e_ID))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(e_name))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(93, 93, 93)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel1.setBackground(new java.awt.Color(207, 245, 231));

        TasksTable.setAutoCreateRowSorter(true);
        TasksTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TasksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Priority", "Title", "Description", "Status", "Start Time", "Deadline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TasksTable);

        EndTask.setBackground(new java.awt.Color(89, 193, 189));
        EndTask.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EndTask.setText("End Task");
        EndTask.setAlignmentX(0.5F);
        EndTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTaskActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tasks");

        task_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-tasklist-48.png"))); // NOI18N

        refreshTasks.setText("Refresh");
        refreshTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTasksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshTasks, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(task_img)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(EndTask, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(task_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshTasks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(EndTask, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Tasks", jPanel1);

        jPanel4.setBackground(new java.awt.Color(207, 245, 231));

        resultTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Reason", "status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(resultTable);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Result Request");

        refresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-request-64 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refresh)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11))
                    .addComponent(jLabel13))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Result Request", jPanel4);

        jTabbedPane2.setBackground(new java.awt.Color(10, 90, 130));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBackground(new java.awt.Color(207, 245, 231));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Tasks Inbox");

        RequestTasks.setAutoCreateRowSorter(true);
        RequestTasks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RequestTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Title", "Description", "Start Time", "Deadline"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(RequestTasks);

        Approve.setBackground(new java.awt.Color(89, 193, 189));
        Approve.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Approve.setText("Approve");
        Approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveActionPerformed(evt);
            }
        });

        Disapprove.setBackground(new java.awt.Color(89, 193, 189));
        Disapprove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Disapprove.setText("Disapprove");
        Disapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisapproveActionPerformed(evt);
            }
        });

        requestsRefresh.setText("Refresh");
        requestsRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsRefreshActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-inbox-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(285, 285, 285))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disapprove)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requestsRefresh)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestsRefresh)
                .addGap(78, 78, 78)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Disapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Task request", jPanel5);

        jPanel6.setBackground(new java.awt.Color(207, 245, 231));

        jButton8.setBackground(new java.awt.Color(89, 193, 189));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setText("Send Request");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Excuse:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feeling dizzy", "Feeling nauseous or ill", "Migraine headache", "Doctor’s appointment", "Dental emergency", "Sick child", "Family emergency", "An important delivery or repair at home", "Getting your car fixed", "Rather not say", "Other Reason" }));
        comboBox.setAutoscrolls(true);
        comboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setText("Leave request");

        OtherReason.setBackground(new java.awt.Color(204, 204, 204));
        OtherReason.setColumns(15);
        OtherReason.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OtherReason.setForeground(new java.awt.Color(0, 0, 0));
        OtherReason.setLineWrap(true);
        OtherReason.setRows(4);
        OtherReason.setTabSize(4);
        OtherReason.setText("Type your Reason...");
        OtherReason.setSelectionColor(new java.awt.Color(0, 102, 102));
        OtherReason.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OtherReasonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OtherReasonFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(OtherReason);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-rest-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(263, 263, 263))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGap(106, 106, 106)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane2.addTab("Leave request", jPanel6);

        jTabbedPane1.addTab("Requests", jTabbedPane2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            
            Image img = ImageIO.read(getClass().getResource("../images/icon.png"));
            this.setIconImage(img);
            
            JOptionPane p = new JOptionPane();
            final JDialog dialog = p.createDialog("Attendance recorded at:");
            p.setMessage(e.attended());
        
            Timer timer = new Timer(3000, (ActionEvent ae) -> {
                dialog.dispose();
            });
            timer.setRepeats(false);
            timer.start();
            dialog.setVisible(true);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened
    
    private static JScrollPane getScrollPane( JComponent component ) {// To get scrollPane of the text area
         Container p = component .getParent();
         if (p instanceof JViewport) {
                Container gp = p.getParent();
                if (gp instanceof JScrollPane jScrollPane) {
                    return jScrollPane;
                }
         }
         return null;
    }

    private void EndTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTaskActionPerformed
        int currentRowNum = TasksTable.getSelectedRow();
        System.out.print(currentRowNum);

        if(currentRowNum == -1){
            new FullAdminForm().justShow("Please select Task", "Error");
            return;
        }

        try {
            e.endTask((int)TasksTable.getModel().getValueAt(currentRowNum, 0));
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel mdl = (DefaultTableModel) TasksTable.getModel();
        mdl.removeRow(currentRowNum);
        new FullAdminForm().justShowInfo("Task ended succesfully!", "Done");
    }//GEN-LAST:event_EndTaskActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        try {
            this.dispose();
            e.Departure();
            e.closeConnection();
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){// To show other option text area 
            if ("Other Reason".equals(comboBox.getSelectedItem().toString()))
                getScrollPane(OtherReason).setVisible(true);
            else
               getScrollPane(OtherReason).setVisible(false);
        }
    }//GEN-LAST:event_comboBoxItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(((DefaultTableModel) TasksTable.getModel()).getRowCount() != 0){// If Employee Stil have Unfinished tasks
            if (JOptionPane.showConfirmDialog(null, "You still have unfinished Tasks\n Do you want to continue?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;// Cancel sending Leaving request
            }
        }            
        String reason = comboBox.getSelectedItem().toString();

        if("Other Reason".equals(reason)){// If other reason is choosen text area appears
            if("".equals(OtherReason.getText()) || "Type your Reason...".equals(OtherReason.getText())){
                 new FullAdminForm().justShow("Please Type your Reason", "Try Again!");
                return;
            }
            reason = OtherReason.getText();
        }

        DefaultTableModel dtm = (DefaultTableModel)resultTable.getModel();
        try {
            dtm.addRow(e.addRequest(reason));// Updating the requests Table from database
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        new FullAdminForm().justShowInfo("Request Sent successfully!", "Done");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
            DefaultTableModel dtm = (DefaultTableModel)resultTable.getModel();
            dtm.setRowCount(0);
            
        try {
            e.getResults(resultTable);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void ApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveActionPerformed
        int selectedRow = RequestTasks.getSelectedRow();
        DefaultTableModel mdl = (DefaultTableModel) RequestTasks.getModel();
        System.out.print(selectedRow);

        if(selectedRow == -1){
            new FullAdminForm().justShow("Please select Task", "Error");
            return;
        }
        int taskID = (int) mdl.getValueAt(selectedRow, 0);
        
        try {
            e.approveTask(taskID);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        refreshTasksActionPerformed(evt);
        
        mdl.removeRow(RequestTasks.getSelectedRow());
        new FullAdminForm().justShowInfo("Task added successfully!", "Done");
    }//GEN-LAST:event_ApproveActionPerformed

    private void refreshTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTasksActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel)TasksTable.getModel();
            dtm.setRowCount(0);
            
            e.GetTasks(TasksTable);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshTasksActionPerformed

    private void DisapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisapproveActionPerformed
                int selectedRow = RequestTasks.getSelectedRow();
        DefaultTableModel mdl = (DefaultTableModel) RequestTasks.getModel();
        System.out.print(selectedRow);

        if(selectedRow == -1){
            new FullAdminForm().justShow("Please select Task", "Error");
            return;
        }
        int taskID = (int) mdl.getValueAt(selectedRow, 0);
        try {
            e.disapproveTask(taskID);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        refreshTasksActionPerformed(evt);
        
        mdl.removeRow(RequestTasks.getSelectedRow());
        new FullAdminForm().justShowInfo("Task disapproved!", "Done");
    }//GEN-LAST:event_DisapproveActionPerformed

    private void requestsRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestsRefreshActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel)RequestTasks.getModel();
            dtm.setRowCount(0);
            
            e.getRequestTasks(RequestTasks);
        } catch (SQLException ex) {
            Logger.getLogger(Employeefrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_requestsRefreshActionPerformed

    private void OtherReasonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OtherReasonFocusGained
        if("Type your Reason...".equals(OtherReason.getText())){
            OtherReason.setText("");
        }
    }//GEN-LAST:event_OtherReasonFocusGained

    private void OtherReasonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OtherReasonFocusLost
        if("".equals(OtherReason.getText())){
            OtherReason.setText("Type your Reason...");
        }
    }//GEN-LAST:event_OtherReasonFocusLost
    

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Employeefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeefrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeefrm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approve;
    private javax.swing.JButton Disapprove;
    private javax.swing.JButton EndTask;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextArea OtherReason;
    private javax.swing.JTable RequestTasks;
    private javax.swing.JTable TasksTable;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel e_ID;
    private javax.swing.JLabel e_name;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshTasks;
    private javax.swing.JButton requestsRefresh;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel task_img;
    // End of variables declaration//GEN-END:variables
}
