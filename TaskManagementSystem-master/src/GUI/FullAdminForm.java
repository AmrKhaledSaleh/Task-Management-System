package GUI;

import java.awt.Image;
import java.io.IOException;
import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import tms.Admin;
import tms.User;

public class FullAdminForm extends javax.swing.JFrame {
    Admin admin = new Admin();

    public FullAdminForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            
        new Login().getCurrentUserInfo(admin);
        name.setText(admin.getName());
        Id.setText(admin.getID()+"");
        setResizable(false);
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public FullAdminForm(int x){// To use justShow function in Login FormS
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ourPanels = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        addUserPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        cpAddUser = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        pfConfirmPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        UpdateUserPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfUpdatedUserId = new javax.swing.JTextField();
        tfNewUsername = new javax.swing.JTextField();
        cpUpdateAddUserRole = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        pfNewPassword = new javax.swing.JPasswordField();
        pfNewConfirmPassword = new javax.swing.JPasswordField();
        udateUsernameCheckBox = new javax.swing.JCheckBox();
        udatePasswordCheckBox = new javax.swing.JCheckBox();
        btnDelete = new javax.swing.JButton();
        updateRoleCheckBox = new javax.swing.JCheckBox();
        password = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        AddProjectPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnAddProject1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        tfProjectName = new javax.swing.JTextField();
        tfLeaderId = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AddProjectPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnDeleteProject = new javax.swing.JButton();
        btnUpdateProject = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tfProjectNewName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfProjectId = new javax.swing.JTextField();
        tfProjectNewLeader = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cbNewProjectName = new javax.swing.JCheckBox();
        cbNewProjectLeader = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        UpdateTaskPhasePane = new javax.swing.JPanel();
        UpdateTaskPhasePane1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnTaskUpdate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        tfTaskId = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cbTaskPhase = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMS");
        setBackground(new java.awt.Color(89, 193, 189));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ourPanels.setBackground(new java.awt.Color(13, 76, 146));
        ourPanels.setForeground(new java.awt.Color(51, 51, 51));
        ourPanels.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        ourPanels.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        homePanel.setBackground(new java.awt.Color(207, 245, 231));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Welcome Back, ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setText("After finishing your work,");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setText("You can Log out from the Logout button.");

        jButton1.setBackground(new java.awt.Color(89, 193, 189));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setText("Dashboard");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        Id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("ID :");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name))))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)))
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(name))
                .addGap(118, 118, 118)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        ourPanels.addTab("Home", homePanel);

        addUserPanel.setBackground(new java.awt.Color(207, 245, 231));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setText("Add User");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-user.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Confirm PassWord");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Role");

        tfName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tfUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cpAddUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cpAddUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Leader" }));
        cpAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpAddUserActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(89, 193, 189));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        pfPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        pfConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(133, 196, 240));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(pfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(tfUserName)
                            .addComponent(pfPassword)))
                    .addComponent(cpAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(pfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cpAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        ourPanels.addTab("Add User", addUserPanel);

        UpdateUserPanel.setBackground(new java.awt.Color(207, 245, 231));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel8.setText("Update/Delete User");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("User ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("New Username");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("New Password");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Confirm New Password");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("New Role");

        tfUpdatedUserId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfUpdatedUserId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUpdatedUserIdFocusGained(evt);
            }
        });
        tfUpdatedUserId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUpdatedUserIdKeyTyped(evt);
            }
        });

        tfNewUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cpUpdateAddUserRole.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cpUpdateAddUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Leader" }));
        cpUpdateAddUserRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpUpdateAddUserRoleActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(89, 193, 189));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        pfNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfNewPasswordActionPerformed(evt);
            }
        });

        pfNewConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfNewConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfNewPasswordActionPerformed(evt);
            }
        });

        udateUsernameCheckBox.setBackground(new java.awt.Color(133, 196, 240));
        udateUsernameCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        udateUsernameCheckBox.setText("Update User Name");
        udateUsernameCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udateUsernameCheckBoxActionPerformed(evt);
            }
        });

        udatePasswordCheckBox.setBackground(new java.awt.Color(133, 196, 240));
        udatePasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        udatePasswordCheckBox.setText("Update Password");

        btnDelete.setBackground(new java.awt.Color(133, 196, 240));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        updateRoleCheckBox.setBackground(new java.awt.Color(133, 196, 240));
        updateRoleCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateRoleCheckBox.setText("Update Role");

        password.setBackground(new java.awt.Color(133, 196, 240));
        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setText("Show Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateUserPanelLayout = new javax.swing.GroupLayout(UpdateUserPanel);
        UpdateUserPanel.setLayout(UpdateUserPanelLayout);
        UpdateUserPanelLayout.setHorizontalGroup(
            UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateUserPanelLayout.createSequentialGroup()
                        .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(udateUsernameCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(udatePasswordCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(pfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpUpdateAddUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateUserPanelLayout.createSequentialGroup()
                        .addComponent(updateRoleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                        .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pfNewConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateUserPanelLayout.createSequentialGroup()
                        .addComponent(tfNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateUserPanelLayout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addContainerGap())))
            .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(tfUpdatedUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateUserPanelLayout.setVerticalGroup(
            UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateUserPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfUpdatedUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(udateUsernameCheckBox)
                .addGap(6, 6, 6)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(udatePasswordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pfNewConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password)
                .addGap(35, 35, 35)
                .addComponent(updateRoleCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cpUpdateAddUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(UpdateUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(UpdateUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(UpdateUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ourPanels.addTab("Update/Delete User", jPanel2);

        AddProjectPanel1.setBackground(new java.awt.Color(207, 245, 231));

        jLabel30.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel30.setText("Add Project");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new-project.png"))); // NOI18N

        btnAddProject1.setBackground(new java.awt.Color(89, 193, 189));
        btnAddProject1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddProject1.setText("Add");
        btnAddProject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProject1ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Project Name");

        tfProjectName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProjectNameActionPerformed(evt);
            }
        });

        tfLeaderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfLeaderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLeaderIdKeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("Leader ID");

        javax.swing.GroupLayout AddProjectPanel1Layout = new javax.swing.GroupLayout(AddProjectPanel1);
        AddProjectPanel1.setLayout(AddProjectPanel1Layout);
        AddProjectPanel1Layout.setHorizontalGroup(
            AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProjectPanel1Layout.createSequentialGroup()
                .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddProjectPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel36))
                        .addGap(18, 18, 18)
                        .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                            .addComponent(tfLeaderId)))
                    .addGroup(AddProjectPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProject1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(AddProjectPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddProjectPanel1Layout.setVerticalGroup(
            AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProjectPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(tfProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(AddProjectPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(tfLeaderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnAddProject1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddProjectPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddProjectPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ourPanels.addTab("Add Project", jPanel5);

        AddProjectPanel.setBackground(new java.awt.Color(207, 245, 231));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel15.setText("Update/Delete Project");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document.png"))); // NOI18N

        btnDeleteProject.setBackground(new java.awt.Color(133, 196, 240));
        btnDeleteProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteProject.setText("Delete");
        btnDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProjectActionPerformed(evt);
            }
        });

        btnUpdateProject.setBackground(new java.awt.Color(89, 193, 189));
        btnUpdateProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateProject.setText("Update");
        btnUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProjectActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Project New Name");

        tfProjectNewName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfProjectNewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProjectNewNameActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Project ID");

        tfProjectId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfProjectId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfProjectIdKeyTyped(evt);
            }
        });

        tfProjectNewLeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfProjectNewLeader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfProjectNewLeaderKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Leader ID");

        cbNewProjectName.setBackground(new java.awt.Color(133, 196, 240));
        cbNewProjectName.setText("Update the project name");

        cbNewProjectLeader.setBackground(new java.awt.Color(133, 196, 240));
        cbNewProjectLeader.setText("Assign a new leader to the project");

        javax.swing.GroupLayout AddProjectPanelLayout = new javax.swing.GroupLayout(AddProjectPanel);
        AddProjectPanel.setLayout(AddProjectPanelLayout);
        AddProjectPanelLayout.setHorizontalGroup(
            AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProjectPanelLayout.createSequentialGroup()
                .addGap(0, 566, Short.MAX_VALUE)
                .addComponent(btnUpdateProject)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteProject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProjectPanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProjectPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(tfProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddProjectPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)))
                .addGap(123, 123, 123))
            .addGroup(AddProjectPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNewProjectLeader)
                    .addComponent(jLabel29)
                    .addComponent(cbNewProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfProjectNewName)
                    .addComponent(tfProjectNewLeader, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddProjectPanelLayout.setVerticalGroup(
            AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProjectPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tfProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(cbNewProjectName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfProjectNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(cbNewProjectLeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProjectNewLeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(79, 79, 79)
                .addGroup(AddProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddProjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddProjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ourPanels.addTab("Update/Delete Project", jPanel3);

        UpdateTaskPhasePane.setBackground(new java.awt.Color(207, 245, 231));

        UpdateTaskPhasePane1.setBackground(new java.awt.Color(207, 245, 231));

        jLabel23.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel23.setText("Update Task Phase");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document.png"))); // NOI18N

        btnTaskUpdate.setBackground(new java.awt.Color(89, 193, 189));
        btnTaskUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTaskUpdate.setText("Update");
        btnTaskUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskUpdateActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Task ID");

        tfTaskId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfTaskId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaskIdActionPerformed(evt);
            }
        });
        tfTaskId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTaskIdKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Task's new Phase");

        cbTaskPhase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTaskPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Work", "Test", "Evaluation", "Canceled" }));

        javax.swing.GroupLayout UpdateTaskPhasePane1Layout = new javax.swing.GroupLayout(UpdateTaskPhasePane1);
        UpdateTaskPhasePane1.setLayout(UpdateTaskPhasePane1Layout);
        UpdateTaskPhasePane1Layout.setHorizontalGroup(
            UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateTaskPhasePane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateTaskPhasePane1Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(cbTaskPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(UpdateTaskPhasePane1Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(101, 101, 101)
                        .addComponent(tfTaskId, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(134, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateTaskPhasePane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaskUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(UpdateTaskPhasePane1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateTaskPhasePane1Layout.setVerticalGroup(
            UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateTaskPhasePane1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addGroup(UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tfTaskId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(UpdateTaskPhasePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cbTaskPhase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnTaskUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout UpdateTaskPhasePaneLayout = new javax.swing.GroupLayout(UpdateTaskPhasePane);
        UpdateTaskPhasePane.setLayout(UpdateTaskPhasePaneLayout);
        UpdateTaskPhasePaneLayout.setHorizontalGroup(
            UpdateTaskPhasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateTaskPhasePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateTaskPhasePane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        UpdateTaskPhasePaneLayout.setVerticalGroup(
            UpdateTaskPhasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateTaskPhasePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateTaskPhasePane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(UpdateTaskPhasePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(UpdateTaskPhasePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ourPanels.addTab("Update Tasks Phase", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ourPanels, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ourPanels)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfProjectNewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProjectNewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProjectNewNameActionPerformed

    private void btnUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProjectActionPerformed
        String seeId = tfProjectId.getText();
        String newProjectName = tfProjectNewName.getText();
        String newProjectLeader = tfProjectNewLeader.getText();

        if (seeId.isEmpty()) {
            justShow("Please fill the id field", "Try again");
            return;
        }

        int TheProjectId = Integer.parseInt(seeId);

        boolean checkProjectName = cbNewProjectName.isSelected();
        boolean checkProjectLeader = cbNewProjectLeader.isSelected();

        if (!checkProjectName && !checkProjectLeader) {
            justShow("Please choose at least one field to update", "Try again");
            return;
        }

        boolean xNewName = false;
        boolean xNewLeader = false;

        if (checkProjectName) {
            if (newProjectName.isEmpty()) {
                justShow("Please enter the new Project name", "Try again");
                return;
            }
            xNewName = true;
        }

        if (checkProjectLeader) {
            if (newProjectLeader.isEmpty()) {
                justShow("Please enter the new Leader Id", "Try again");
                return;
            }
            xNewLeader = true;
        }
        int newLeaderId = 0;

        if(xNewLeader){
            newLeaderId = Integer.parseInt(newProjectLeader);
        }

        try {
            if(!admin.updateProject(TheProjectId,newProjectName,newLeaderId,xNewName,xNewLeader))
                JOptionPane.showMessageDialog(null,"Project ID doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"Project updated successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            justShow("", "");
        }


        tfProjectId.setText("");
        tfProjectNewName.setText("");
        tfProjectNewLeader.setText("");
    }//GEN-LAST:event_btnUpdateProjectActionPerformed

    private void btnDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProjectActionPerformed
        String seeId = tfProjectId.getText();
        if (seeId.isEmpty()) {
            justShow("Please enter the id of the project you want to delete", "Try again");
            return;
        }
        int projectId = Integer.parseInt(seeId);

        try {
            if(admin.deleteProject(projectId))
                JOptionPane.showMessageDialog(null,"Project deleted successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"this ID doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);                
            
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tfProjectId.setText("");
    }//GEN-LAST:event_btnDeleteProjectActionPerformed

    private void tfProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProjectNameActionPerformed

    private void btnAddProject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProject1ActionPerformed
        String pName = tfProjectName.getText();
        String seeId = tfLeaderId.getText();

        if (seeId.isEmpty() || pName.isEmpty()) {
            justShow("Please fill both name & leader id fields", "Try again");
            return;
        }
        int leaderId = Integer.parseInt(seeId);
        try {
            if(admin.addProject(pName, leaderId))
                justShow("Project added successfully", "Done");
            else
                justShow("this ID doesn't exist", "Error");
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
            justShow("This Leader is already working on a project.", "Error");
        }
        
        tfProjectName.setText("");
        tfLeaderId.setText("");
    }//GEN-LAST:event_btnAddProject1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        if(pfNewPassword.getEchoChar() != (char)0)
            pfNewPassword.setEchoChar((char)0);
        else
            pfNewPassword.setEchoChar('*');

        if(pfNewConfirmPassword.getEchoChar() != (char)0)
            pfNewConfirmPassword.setEchoChar((char)0);
        else
            pfNewConfirmPassword.setEchoChar('*');
    }//GEN-LAST:event_passwordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String seeId = tfUpdatedUserId.getText();
        if (seeId.isEmpty()) {
            justShow("Please enter the id of the user you want to update", "Try again");
            return;
        }
        int userId = Integer.parseInt(seeId);
        try {
            if(admin.deleteUser(userId))
                JOptionPane.showMessageDialog(null,"User deleted successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"this ID doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        tfUpdatedUserId.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void udateUsernameCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udateUsernameCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_udateUsernameCheckBoxActionPerformed

    private void pfNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfNewPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String seeId = tfUpdatedUserId.getText();
        if (seeId.isEmpty()) {
            justShow("Please enter the id of the user you want to update", "Try again");
            return;
        }

        int userId = Integer.parseInt(seeId);

        boolean checkUserName = udateUsernameCheckBox.isSelected();
        boolean checkUserRole = updateRoleCheckBox.isSelected();
        boolean checkUserPass = udatePasswordCheckBox.isSelected();

        String newUsername = tfNewUsername.getText();
        String newPassword = String.valueOf(pfNewPassword.getPassword());
        String confirmNewPassword = String.valueOf(pfNewConfirmPassword.getPassword());
        String newRole = cpUpdateAddUserRole.getSelectedItem().toString();

        if (!checkUserName && !checkUserPass && !checkUserRole) {
            justShow("Please choose at least one field to update", "Try again");
            return;
        }
        boolean xUsername = false;
        boolean xPassword = false;
        boolean xRole = false;
        if (checkUserName) {
            if (newUsername.isEmpty()) {
                justShow("Please enter the new Username", "Try again");
                return;
            }
            xUsername = true;
        }
        if (checkUserPass) {
            if (newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
                justShow("Please fill both the password fields", "Try again");
                return;
            }
            if (! newPassword.equals(confirmNewPassword)) {
                justShow("Passwords does not match", "Try again");
                return;
            }
            xPassword = true;
        }
        if (checkUserRole) {
            if (newRole.isEmpty()) {
                justShow("Please enter the new Role / Type", "Try again");
                return;
            }
            xRole = true;
        }
        try {
            if(admin.updateUser(xUsername, xPassword, xRole, userId, newRole, newUsername, newPassword))
                JOptionPane.showMessageDialog(null,"User data updated successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"this ID doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tfUpdatedUserId.setText("");
        tfNewUsername.setText("");
        pfNewPassword.setText("");
        pfNewConfirmPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cpUpdateAddUserRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUpdateAddUserRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpUpdateAddUserRoleActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(pfPassword.getEchoChar() != (char)0)
            pfPassword.setEchoChar((char)0);
        else
            pfPassword.setEchoChar('•');
        //pfNewConfirmPassword
        if(pfConfirmPassword.getEchoChar() != (char)0)
            pfConfirmPassword.setEchoChar((char)0);
        else
            pfConfirmPassword.setEchoChar('•');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = tfName.getText();
        String username = tfUserName.getText();
        String pass = String.valueOf(pfPassword.getPassword());
        String confirmPass = String.valueOf(pfConfirmPassword.getPassword());
        String role = cpAddUser.getSelectedItem().toString();
        if (name.isEmpty() || username.isEmpty() || role.isEmpty() || confirmPass.isEmpty() || pass.isEmpty()) {
            justShow("Please enter all fields", "Try again");
            return;
        }
        if (!pass.equals(confirmPass)) {
            justShow("Passwords does not match", "Try again");
            return;
        }
        try {
            User u = new User();
            u.setName(name);
            u.setUsername(username);
            u.setPassword(pass);
            u.setType(role);
            admin.addUser(u);
            JOptionPane.showMessageDialog(null,"User added successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Username is already taken. Please try another one.", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }

        tfName.setText("");
        tfUserName.setText("");
        pfPassword.setText("");
        pfConfirmPassword.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void cpAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpAddUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            admin.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfTaskIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaskIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaskIdActionPerformed

    private void btnTaskUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskUpdateActionPerformed
        String seeId = tfTaskId.getText();
        String newPhase = cbTaskPhase.getSelectedItem().toString();
        if (seeId.isEmpty() || newPhase.isEmpty()) {
            justShow("Please enter both the Task id and choose the new phase", "Try again");
            return;
        }
        int taskId = Integer.parseInt(seeId);

        try {
            if(admin.updateTaskPhase(taskId, newPhase))
                JOptionPane.showMessageDialog(null,"Task phase updated successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,"this ID doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaskUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Image img = ImageIO.read(getClass().getResource("../images/icon.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            admin.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(FullAdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void tfUpdatedUserIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUpdatedUserIdKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tfUpdatedUserIdKeyTyped

    private void tfUpdatedUserIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUpdatedUserIdFocusGained
        //tfUpdatedUserId.setBorder(new LineBorder(Color.RED, 2));
    }//GEN-LAST:event_tfUpdatedUserIdFocusGained

    private void tfLeaderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLeaderIdKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tfLeaderIdKeyTyped

    private void tfProjectIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProjectIdKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tfProjectIdKeyTyped

    private void tfProjectNewLeaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProjectNewLeaderKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tfProjectNewLeaderKeyTyped

    private void tfTaskIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTaskIdKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tfTaskIdKeyTyped

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
            java.util.logging.Logger.getLogger(FullAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FullAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FullAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FullAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullAdminForm().setVisible(true);
            }
        });
    }
        // justShow is to show the user an error msg
    public void justShow(String msg, String title){
        JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
    }

    // justShowInfo is to show the user an information msg

    public void justShowInfo(String msg, String title){
        JOptionPane.showMessageDialog(this, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddProjectPanel;
    private javax.swing.JPanel AddProjectPanel1;
    private javax.swing.JLabel Id;
    private javax.swing.JPanel UpdateTaskPhasePane;
    private javax.swing.JPanel UpdateTaskPhasePane1;
    private javax.swing.JPanel UpdateUserPanel;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddProject1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteProject;
    private javax.swing.JButton btnTaskUpdate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProject;
    private javax.swing.JCheckBox cbNewProjectLeader;
    private javax.swing.JCheckBox cbNewProjectName;
    private javax.swing.JComboBox<String> cbTaskPhase;
    private javax.swing.JComboBox<String> cpAddUser;
    private javax.swing.JComboBox<String> cpUpdateAddUserRole;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JLabel name;
    private javax.swing.JTabbedPane ourPanels;
    private javax.swing.JCheckBox password;
    private javax.swing.JPasswordField pfConfirmPassword;
    private javax.swing.JPasswordField pfNewConfirmPassword;
    private javax.swing.JPasswordField pfNewPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfLeaderId;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNewUsername;
    private javax.swing.JTextField tfProjectId;
    private javax.swing.JTextField tfProjectName;
    private javax.swing.JTextField tfProjectNewLeader;
    private javax.swing.JTextField tfProjectNewName;
    private javax.swing.JTextField tfTaskId;
    private javax.swing.JTextField tfUpdatedUserId;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JCheckBox udatePasswordCheckBox;
    private javax.swing.JCheckBox udateUsernameCheckBox;
    private javax.swing.JCheckBox updateRoleCheckBox;
    // End of variables declaration//GEN-END:variables
}
