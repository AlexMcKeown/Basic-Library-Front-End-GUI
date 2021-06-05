package library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class AdminGUI extends javax.swing.JFrame {
    private static ArrayList<String> listOfLibrarianUsers = new ArrayList<>();    
    private static ArrayList<String> listOfStudentUsers = new ArrayList<>();    
    private static ArrayList<User> listOfUsers= new ArrayList<>();
    private static ArrayList<Book> listOfBooks = new ArrayList<>();
    
    private String createTabType;
    private String editTabType;
    private String deleteTabType;
    private String editComboItem;
    private String searchComboItem = "Select User Type";  
    private String editSelectedUser;
    private String deleteSelectedUser;
    private int counter = 0;  
  
    public AdminGUI() {
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        prerequisite();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminGUI = new javax.swing.JTabbedPane();
        create = new javax.swing.JPanel();
        createComboBox = new javax.swing.JComboBox<>();
        createButton = new javax.swing.JButton();
        createUsernameTextField = new javax.swing.JTextField();
        createLogoutButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        degreeLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        createDegreeTextField = new javax.swing.JTextField();
        createCourseTextField = new javax.swing.JTextField();
        createLastNameTextField = new javax.swing.JTextField();
        createFirstNameTextField = new javax.swing.JTextField();
        createPasswordTextField = new javax.swing.JTextField();
        responseLabel = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        editTypeOfUserComboBox = new javax.swing.JComboBox<>();
        editItemComboBox = new javax.swing.JComboBox<>();
        editLogoutButton = new javax.swing.JButton();
        editTextField = new javax.swing.JTextField();
        editUpdateButton = new javax.swing.JButton();
        editUserComboBox = new javax.swing.JComboBox<>();
        editDisplayLabel = new javax.swing.JLabel();
        deleteUserNameLabel1 = new javax.swing.JLabel();
        deletePasswordLabel1 = new javax.swing.JLabel();
        deleteFirstNameLabel1 = new javax.swing.JLabel();
        deleteLastNameLabel1 = new javax.swing.JLabel();
        editDegreeLabel = new javax.swing.JLabel();
        editCourseLabel = new javax.swing.JLabel();
        deleteUserTypeLabel1 = new javax.swing.JLabel();
        editDisplayUserType = new javax.swing.JLabel();
        editDisplayUsername = new javax.swing.JLabel();
        editDisplayPassword = new javax.swing.JLabel();
        editDisplayFirstName = new javax.swing.JLabel();
        editDisplayLastName = new javax.swing.JLabel();
        editDisplayDegree = new javax.swing.JLabel();
        editDisplayCourse = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        deleteComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        deleteUserComboBox = new javax.swing.JComboBox<>();
        deleteLogoutButton = new javax.swing.JButton();
        deleteDisplayLabel = new javax.swing.JLabel();
        deleteUserNameLabel = new javax.swing.JLabel();
        deletePasswordLabel = new javax.swing.JLabel();
        deleteFirstNameLabel = new javax.swing.JLabel();
        deleteLastNameLabel = new javax.swing.JLabel();
        deleteDegreeLabel = new javax.swing.JLabel();
        deleteCourseLabel = new javax.swing.JLabel();
        deleteUserTypeLabel = new javax.swing.JLabel();
        deleteDisplayUserType = new javax.swing.JLabel();
        deleteDisplayUsername = new javax.swing.JLabel();
        deleteDisplayPassword = new javax.swing.JLabel();
        deleteDisplayFirstName = new javax.swing.JLabel();
        deleteDisplayLastName = new javax.swing.JLabel();
        deleteDisplayDegree = new javax.swing.JLabel();
        deleteDisplayCourse = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        searchLogoutButton = new javax.swing.JButton();
        searchUserTypeLabel = new javax.swing.JLabel();
        searchUsernameLabel = new javax.swing.JLabel();
        searchPasswordLabel = new javax.swing.JLabel();
        searchFNameLabel = new javax.swing.JLabel();
        searchLNameLabel = new javax.swing.JLabel();
        searchCourseLabel = new javax.swing.JLabel();
        searchDegreeLabel = new javax.swing.JLabel();
        searchResponseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchUserTypeLabel1 = new javax.swing.JLabel();
        searchUsernameLabel1 = new javax.swing.JLabel();
        searchPasswordLabel1 = new javax.swing.JLabel();
        searchFNameLabel1 = new javax.swing.JLabel();
        searchLNameLabel1 = new javax.swing.JLabel();
        searchCourseLabel1 = new javax.swing.JLabel();
        searchDegreeLabel1 = new javax.swing.JLabel();
        view = new javax.swing.JPanel();
        searchLogoutButton1 = new javax.swing.JButton();
        viewUserScrollPane = new javax.swing.JScrollPane();
        viewUserTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(667, 419));

        createComboBox.setMaximumRowCount(3);
        createComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Student", "Librarian" }));
        createComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createComboBoxActionPerformed(evt);
            }
        });

        createButton.setText("Create User");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUsernameTextFieldActionPerformed(evt);
            }
        });

        createLogoutButton.setText("Logout");
        createLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLogoutButtonMouseClicked(evt);
            }
        });

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        firstNameLabel.setText("First name:");

        lastNameLabel.setText("Last name:");

        degreeLabel.setText("Degree:");

        courseLabel.setText("Course:");

        createFirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFirstNameTextFieldActionPerformed(evt);
            }
        });

        responseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        responseLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createLayout.createSequentialGroup()
                                .addGap(0, 140, Short.MAX_VALUE)
                                .addComponent(createComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(createLogoutButton))
                            .addGroup(createLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(responseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(createLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createLayout.createSequentialGroup()
                                .addComponent(createLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addGap(27, 316, Short.MAX_VALUE))
                            .addGroup(createLayout.createSequentialGroup()
                                .addComponent(createFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseLabel)
                                    .addComponent(degreeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createCourseTextField)
                                    .addComponent(createDegreeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGap(25, 25, 25))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );

        createLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createCourseTextField, createDegreeTextField, createFirstNameTextField, createLastNameTextField, createPasswordTextField, createUsernameTextField});

        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createLogoutButton))
                .addGap(18, 18, 18)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(createFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel)))
                    .addGroup(createLayout.createSequentialGroup()
                        .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createDegreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degreeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseLabel)
                            .addComponent(createCourseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        adminGUI.addTab("Create User", create);

        editTypeOfUserComboBox.setMaximumRowCount(3);
        editTypeOfUserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Student", "Librarian" }));
        editTypeOfUserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTypeOfUserComboBoxActionPerformed(evt);
            }
        });

        editItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type" }));
        editItemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemComboBoxActionPerformed(evt);
            }
        });

        editLogoutButton.setText("Logout");
        editLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLogoutButtonMouseClicked(evt);
            }
        });

        editUpdateButton.setText("Update");
        editUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUpdateButtonMouseClicked(evt);
            }
        });
        editUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUpdateButtonActionPerformed(evt);
            }
        });

        editUserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        editUserComboBox.setSelectedIndex(0);
        editUserComboBox.setSelectedItem(0);
        editUserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserComboBoxActionPerformed(evt);
            }
        });

        editDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deleteUserNameLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteUserNameLabel1.setText("Username:");

        deletePasswordLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deletePasswordLabel1.setText("Password:");

        deleteFirstNameLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteFirstNameLabel1.setText("First Name:");

        deleteLastNameLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteLastNameLabel1.setText("Last Name:");

        editDegreeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editDegreeLabel.setText("Degree:");

        editCourseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editCourseLabel.setText("Course:");

        deleteUserTypeLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteUserTypeLabel1.setText("UserType:");

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addComponent(editDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editTypeOfUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(editLogoutButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addComponent(editUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addComponent(editItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addComponent(editUpdateButton)
                        .addGap(276, 276, 276))))
            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editLayout.createSequentialGroup()
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deletePasswordLabel1)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteLastNameLabel1)
                                    .addGroup(editLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(editDegreeLabel)
                                            .addComponent(editCourseLabel)))
                                    .addComponent(deleteFirstNameLabel1)))
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(editLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(editDisplayFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(editLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editDisplayDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                                        .addComponent(editDisplayLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editDisplayCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(editLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteUserTypeLabel1)
                                .addComponent(deleteUserNameLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(editLayout.createSequentialGroup()
                                    .addComponent(editDisplayUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 3, Short.MAX_VALUE))
                                .addComponent(editDisplayPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(55, 55, 55)))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editTypeOfUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editUpdateButton)
                .addGap(15, 15, 15))
            .addGroup(editLayout.createSequentialGroup()
                .addComponent(editLogoutButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deleteUserTypeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editDisplayUserType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(12, 12, 12)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deleteUserNameLabel1)
                        .addComponent(editDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editDisplayPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletePasswordLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(9, 9, 9)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(deleteFirstNameLabel1)
                        .addComponent(editDisplayFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editDisplayLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteLastNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editDegreeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editDisplayDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editDisplayCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(99, Short.MAX_VALUE)))
        );

        adminGUI.addTab("Edit User", edit);

        deleteComboBox.setMaximumRowCount(3);
        deleteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Student", "Librarian" }));
        deleteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteComboBoxActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete User");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteUserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        deleteUserComboBox.setSelectedIndex(0);
        deleteUserComboBox.setSelectedItem(0);
        deleteUserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserComboBoxActionPerformed(evt);
            }
        });

        deleteLogoutButton.setText("Logout");
        deleteLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLogoutButtonMouseClicked(evt);
            }
        });

        deleteDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deleteUserNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteUserNameLabel.setText("Username:");

        deletePasswordLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deletePasswordLabel.setText("Password:");

        deleteFirstNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteFirstNameLabel.setText("First Name:");

        deleteLastNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteLastNameLabel.setText("Last Name:");

        deleteDegreeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteDegreeLabel.setText("Degree:");

        deleteCourseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteCourseLabel.setText("Course:");

        deleteUserTypeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteUserTypeLabel.setText("UserType:");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(deleteButton))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteLayout.createSequentialGroup()
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deletePasswordLabel)
                                    .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteLastNameLabel)
                                        .addGroup(deleteLayout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(deleteDegreeLabel)
                                                .addComponent(deleteCourseLabel)))
                                        .addComponent(deleteFirstNameLabel)))
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(deleteLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(deleteDisplayFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(deleteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(deleteDisplayDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                                            .addComponent(deleteDisplayLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deleteDisplayCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(deleteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deleteUserTypeLabel)
                                    .addComponent(deleteUserNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(deleteLayout.createSequentialGroup()
                                        .addComponent(deleteDisplayUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 3, Short.MAX_VALUE))
                                    .addComponent(deleteDisplayPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(deleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(deleteLogoutButton))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteLogoutButton)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(deleteDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteUserTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteDisplayUserType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteUserNameLabel)
                    .addComponent(deleteDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteDisplayPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteFirstNameLabel)
                    .addComponent(deleteDisplayFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteDisplayLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteLastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteDegreeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteDisplayDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteDisplayCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(28, 28, 28))
        );

        deleteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteCourseLabel, deleteDegreeLabel, deleteDisplayCourse, deleteDisplayDegree, deleteDisplayFirstName, deleteDisplayLastName, deleteDisplayPassword, deleteDisplayUserType, deleteDisplayUsername, deleteFirstNameLabel, deleteLastNameLabel, deletePasswordLabel, deleteUserNameLabel, deleteUserTypeLabel});

        adminGUI.addTab("Delete User", delete);

        searchComboBox.setMaximumRowCount(3);
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Student", "Librarian" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        searchLogoutButton.setText("Logout");
        searchLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLogoutButtonMouseClicked(evt);
            }
        });

        searchUserTypeLabel.setText("User Type: ");

        searchUsernameLabel.setText("Username:");

        searchPasswordLabel.setText("Password:");

        searchFNameLabel.setText("First name:");

        searchLNameLabel.setText("Last name:");

        searchCourseLabel.setText("Course:");

        searchDegreeLabel.setText("Degree:");

        searchResponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        searchResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("(Username)");

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(searchLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(searchUserTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchUserTypeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchUsernameLabel)
                            .addComponent(searchPasswordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPasswordLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchUsernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(searchFNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(searchFNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLNameLabel)
                            .addComponent(searchCourseLabel)
                            .addComponent(searchDegreeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchCourseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchLNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchDegreeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
            .addComponent(searchResponseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchLogoutButton)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(8, 8, 8)
                .addComponent(searchResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addGap(20, 20, 20)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchFNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchFNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchLNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchCourseLabel)
                            .addComponent(searchCourseLabel1)))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchUserTypeLabel)
                            .addComponent(searchUserTypeLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchUsernameLabel)
                            .addComponent(searchUsernameLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPasswordLabel1)
                            .addComponent(searchPasswordLabel))))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchDegreeLabel)
                    .addComponent(searchDegreeLabel1))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        searchLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchCourseLabel1, searchDegreeLabel1, searchFNameLabel, searchFNameLabel1, searchLNameLabel1, searchPasswordLabel1, searchUserTypeLabel1, searchUsernameLabel1});

        adminGUI.addTab("Search User", search);

        searchLogoutButton1.setText("Logout");
        searchLogoutButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLogoutButton1MouseClicked(evt);
            }
        });

        viewUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User Type", "Username", "Password", "First Name", "Last Name", "Course", "Degree"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewUserScrollPane.setViewportView(viewUserTable);
        if (viewUserTable.getColumnModel().getColumnCount() > 0) {
            viewUserTable.getColumnModel().getColumn(0).setMinWidth(80);
            viewUserTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            viewUserTable.getColumnModel().getColumn(1).setMinWidth(60);
            viewUserTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            viewUserTable.getColumnModel().getColumn(2).setMinWidth(80);
            viewUserTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            viewUserTable.getColumnModel().getColumn(3).setMinWidth(70);
            viewUserTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            viewUserTable.getColumnModel().getColumn(4).setMinWidth(70);
            viewUserTable.getColumnModel().getColumn(4).setPreferredWidth(70);
            viewUserTable.getColumnModel().getColumn(5).setMinWidth(80);
            viewUserTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            viewUserTable.getColumnModel().getColumn(6).setMinWidth(400);
            viewUserTable.getColumnModel().getColumn(6).setPreferredWidth(400);
        }

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchLogoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewUserScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addComponent(searchLogoutButton1)
                .addGap(18, 18, 18)
                .addComponent(viewUserScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminGUI.addTab("View", view);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminGUI)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminGUI, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prerequisite(){
        createButton.setVisible(false);
        createDegreeTextField.setVisible(false);
        createCourseTextField.setVisible(false);
        courseLabel.setText("");
        degreeLabel.setText("");
        createDegreeTextField.setText("");
        createCourseTextField.setText("");
        
        createUsernameTextField.setVisible(false);
        createPasswordTextField.setVisible(false);
        createFirstNameTextField.setVisible(false);
        createLastNameTextField.setVisible(false);
        usernameLabel.setText("");
        passwordLabel.setText("");
        firstNameLabel.setText("");
        lastNameLabel.setText("");    
        courseLabel.setText("");
        degreeLabel.setText("");
           
        searchCourseLabel1.setVisible(false);
        searchDegreeLabel1.setVisible(false);
        searchCourseLabel.setVisible(false);
        searchDegreeLabel.setVisible(false);
        
        editUserComboBox.setVisible(false);
        editUpdateButton.setVisible(false);
        editTextField.setVisible(false);
        editItemComboBox.setVisible(false);
        deleteUserComboBox.setVisible(false);  
        deleteButton.setVisible(false);
        updateTable();
    }
    
    private void clearLabels(){
        searchUserTypeLabel1.setText("");
        searchUsernameLabel1.setText("");
        searchPasswordLabel1.setText("");
        searchFNameLabel1.setText("");
        searchLNameLabel1.setText("");
        searchCourseLabel1.setText("");
        searchDegreeLabel1.setText("");
        
        deleteDisplayUserType.setText("");
        deleteDisplayUsername.setText("");
        deleteDisplayPassword.setText("");
        deleteDisplayFirstName.setText("");
        deleteDisplayLastName.setText("");
        deleteDisplayCourse.setText("");
        deleteDisplayDegree.setText("");
        
        editDisplayUserType.setText("");
        editDisplayUsername.setText("");
        editDisplayPassword.setText("");
        editDisplayFirstName.setText("");
        editDisplayLastName.setText("");
        editDisplayCourse.setText("");
        editDisplayDegree.setText("");
    }
    
    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        searchComboItem = (String)cb.getSelectedItem();
        
        if(searchComboItem.equals("Student")){
            searchCourseLabel1.setVisible(true);
            searchDegreeLabel1.setVisible(true);
            searchCourseLabel.setVisible(true);
            searchDegreeLabel.setVisible(true);
            
        }else{
            searchCourseLabel1.setVisible(false);
            searchDegreeLabel1.setVisible(false);
            searchCourseLabel.setVisible(false);
            searchDegreeLabel.setVisible(false);
          }
        clearLabels();
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    private void createLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();  
    }//GEN-LAST:event_createLogoutButtonMouseClicked

    private void editLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();  
    }//GEN-LAST:event_editLogoutButtonMouseClicked

    private void deleteLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();  
    }//GEN-LAST:event_deleteLogoutButtonMouseClicked

    private void searchLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();  
    }//GEN-LAST:event_searchLogoutButtonMouseClicked

    private void createFirstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFirstNameTextFieldActionPerformed
    }//GEN-LAST:event_createFirstNameTextFieldActionPerformed

    private void createUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUsernameTextFieldActionPerformed
    }//GEN-LAST:event_createUsernameTextFieldActionPerformed

    private void createComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createComboBoxActionPerformed
           JComboBox cb = (JComboBox)evt.getSource();
            createTabType = (String)cb.getSelectedItem();
           
           createDegreeTextField.setText("");
           createCourseTextField.setText("");
           createUsernameTextField.setText("");
           createPasswordTextField.setText("");
           createFirstNameTextField.setText("");
           createLastNameTextField.setText("");
           
           if(createTabType.equals("Librarian") | createTabType.equals("Student")){
               createUsernameTextField.setVisible(true);
               createPasswordTextField.setVisible(true);
               createFirstNameTextField.setVisible(true);
               createLastNameTextField.setVisible(true);
               usernameLabel.setText("Username:");
               passwordLabel.setText("Passsword:");
               firstNameLabel.setText("First name:");
               lastNameLabel.setText("Last name:");
               createButton.setVisible(true);
               courseLabel.setText("");
               degreeLabel.setText("");
               createDegreeTextField.setVisible(false);
               createCourseTextField.setVisible(false);
               
               if(createTabType.equals("Student")){
                   createDegreeTextField.setVisible(true);
                   createCourseTextField.setVisible(true);
                   courseLabel.setText("Course:");
                   degreeLabel.setText("Degree:");  
               }
           } else if(createTabType.equals("Select User Type")){
               createUsernameTextField.setVisible(false);
               createPasswordTextField.setVisible(false);
               createFirstNameTextField.setVisible(false);
               createLastNameTextField.setVisible(false);
               usernameLabel.setText("");
               passwordLabel.setText("");
               firstNameLabel.setText("");
               lastNameLabel.setText("");
               createButton.setVisible(false);           
               createDegreeTextField.setVisible(false);
               createCourseTextField.setVisible(false);
               createDegreeTextField.setText("");
               createCourseTextField.setText("");
               createUsernameTextField.setText("");
               createPasswordTextField.setText("");
               createFirstNameTextField.setText("");
               createLastNameTextField.setText("");
               courseLabel.setText("");
               degreeLabel.setText("");
           }
    }//GEN-LAST:event_createComboBoxActionPerformed

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        boolean usernameTaken = false;
            for(User user:listOfUsers){
                if(user.getUsername().equals(createUsernameTextField.getText())){
                    usernameTaken = true;
                    responseLabel.setText("Username Taken!");

                }
            }
            if(createTabType.equals("Student") & createCourseTextField.getText().replaceAll(" ","").equals("")){
                usernameTaken = true;
                responseLabel.setText("Fill in course");
            }
            if(createTabType.equals("Student") &  createDegreeTextField.getText().replaceAll(" ","").equals("")){
                usernameTaken = true;
                responseLabel.setText("Fill in degree");
            }
             if(createUsernameTextField.getText().replaceAll(" ","").equals("") || createPasswordTextField.getText().replaceAll(" ","").equals("") || createFirstNameTextField.getText().replaceAll(" ","").equals("") || createLastNameTextField.getText().replaceAll(" ","").equals("")){
                usernameTaken = true;
                responseLabel.setText("ERROR! Please fill in COMPLETELY!");
             }
            
            else if(usernameTaken == false && !createUsernameTextField.getText().replaceAll(" ","").equals("") && !createPasswordTextField.getText().replaceAll(" ","").equals("") && !createFirstNameTextField.getText().replaceAll(" ","").equals("") && !createLastNameTextField.getText().replaceAll(" ","").equals("")){
                switch(createTabType){
                    case "Student":
                        listOfUsers.add(new Student("STUDENT",createUsernameTextField.getText(),createPasswordTextField.getText(),createFirstNameTextField.getText(),createLastNameTextField.getText(),createDegreeTextField.getText(),createCourseTextField.getText()));
                        responseLabel.setText("Student ADDED");
                       
                        break;
                        
                    case "Librarian":
                        listOfUsers.add(new Librarian("LIBRARIAN",createUsernameTextField.getText(),createPasswordTextField.getText(),createFirstNameTextField.getText(),createLastNameTextField.getText()));
                        responseLabel.setText("Librarian ADDED");
                        break;
                }
                createDegreeTextField.setText("");
                createCourseTextField.setText("");
                createUsernameTextField.setText("");
                createPasswordTextField.setText("");
                createFirstNameTextField.setText("");
                createLastNameTextField.setText("");
                
                Timer timer = new Timer(10000, new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        responseLabel.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
                
                try {
                    updateData();
                }catch (IOException ex) {
                    Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        
       
    }//GEN-LAST:event_createButtonMouseClicked

    private void editItemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
       
        editComboItem = (String)cb.getSelectedItem();
        
        if(!editComboItem.equals("Select to Edit")){
            editTextField.setVisible(true);
            editUpdateButton.setVisible(true);
            
        }else{
        editTextField.setVisible(false);
        editUpdateButton.setVisible(false);   
        }
         
        
    }//GEN-LAST:event_editItemComboBoxActionPerformed

    private void editTypeOfUserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTypeOfUserComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        editTabType = (String)cb.getSelectedItem();
        editTextField.setText("");

        if(!editTabType.equals("Select User Type")){
            editUpdateComboBoxes();
            editUserComboBox.setVisible(true); 
        }else{
            editUserComboBox.setVisible(false);
            editTextField.setVisible(false);
            editItemComboBox.setVisible(false);
        }   
        
        editCourseLabel.setVisible(false);
        editDegreeLabel.setVisible(false);
        
        if(editTabType.equals("Student")){
            editCourseLabel.setVisible(true);
            editDegreeLabel.setVisible(true);
        }
        editDisplayUserType.setText("");
        editDisplayUsername.setText("");
        editDisplayPassword.setText("");
        editDisplayFirstName.setText("");
        editDisplayLastName.setText("");
        editDisplayCourse.setText("");
        editDisplayDegree.setText("");
        editUpdateButton.setVisible(false);

    }//GEN-LAST:event_editTypeOfUserComboBoxActionPerformed

    
    private void deleteUserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        deleteSelectedUser = (String)cb.getSelectedItem();
        
        if(!deleteSelectedUser.equals("Select Account")){
            deleteButton.setVisible(true);
            for(User user:listOfUsers){
                if(user.getUsername().equals(deleteSelectedUser)){
                deleteDisplayUserType.setText(user.getUserType());
                deleteDisplayUsername.setText(user.getUsername());
                deleteDisplayPassword.setText(user.getPassword());
                deleteDisplayFirstName.setText(user.getFirstName());
                deleteDisplayLastName.setText(user.getLastName());
                
                deleteCourseLabel.setVisible(false);
                deleteDegreeLabel.setVisible(false);
                deleteDisplayCourse.setText("");
                deleteDisplayDegree.setText("");
                
                if(deleteDisplayUserType.getText().equals("STUDENT")){
                    deleteCourseLabel.setVisible(true);
                    deleteDegreeLabel.setVisible(true);
                    deleteDisplayCourse.setText(user.getCourse());
                    deleteDisplayDegree.setText(user.getDegree());
                }
                }
            }
        }else{
            
            deleteButton.setVisible(false);
            deleteDisplayUserType.setText("");
                deleteDisplayUsername.setText("");
                deleteDisplayPassword.setText("");
                deleteDisplayFirstName.setText("");
                deleteDisplayLastName.setText("");
                deleteDisplayCourse.setText("");
                deleteDisplayDegree.setText("");
        }
    }//GEN-LAST:event_deleteUserComboBoxActionPerformed

    private void deleteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        deleteTabType = (String)cb.getSelectedItem();

        if(!deleteTabType.equals("Select User Type")){
            deleteUpdateComboBoxes();
            deleteUserComboBox.setVisible(true); 
        }else{
            deleteUserComboBox.setVisible(false);
        }  
        
        deleteCourseLabel.setVisible(false);
        deleteDegreeLabel.setVisible(false);
        if(deleteTabType.equals("Student")){
            deleteCourseLabel.setVisible(true);
            deleteDegreeLabel.setVisible(true);
        }
         deleteDisplayUserType.setText("");
                deleteDisplayUsername.setText("");
                deleteDisplayPassword.setText("");
                deleteDisplayFirstName.setText("");
                deleteDisplayLastName.setText("");
                deleteDisplayCourse.setText("");
                deleteDisplayDegree.setText("");
                            deleteButton.setVisible(false);

    }//GEN-LAST:event_deleteComboBoxActionPerformed

    private void editUserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        editSelectedUser = (String)cb.getSelectedItem();
        if(!editSelectedUser.equals("Select Account")){
            editItemComboBox.setVisible(true);
            editItemComboBox.setSelectedIndex(0);
            for(User user: listOfUsers){
                if(user.getUsername().equals(editSelectedUser)){
                    editDisplayUserType.setText(user.getUserType());
                    editDisplayUsername.setText(user.getUsername());
                    editDisplayPassword.setText(user.getPassword());
                    editDisplayFirstName.setText(user.getFirstName());
                    editDisplayLastName.setText(user.getLastName());

                    editCourseLabel.setVisible(false);
                    editDegreeLabel.setVisible(false);
                    editDisplayCourse.setText("");
                    editDisplayDegree.setText("");
                    if(editDisplayUserType.getText().equals("STUDENT")){
                        editCourseLabel.setVisible(true);
                        editDegreeLabel.setVisible(true);
                        editDisplayCourse.setText(user.getCourse());
                        editDisplayDegree.setText(user.getDegree());
                    }
                }
            }
        }else{
            editItemComboBox.setSelectedIndex(0);
            editUpdateButton.setVisible(false);
            editTextField.setVisible(false);
            editItemComboBox.setVisible(false);  
            editDisplayUserType.setText("");
            editDisplayUsername.setText("");
            editDisplayPassword.setText("");
            editDisplayFirstName.setText("");
            editDisplayLastName.setText("");
            editDisplayCourse.setText("");
            editDisplayDegree.setText("");
            }
    }//GEN-LAST:event_editUserComboBoxActionPerformed

    private void editUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUpdateButtonMouseClicked
        if(!editTabType.equals("Select User Type")){
            editDisplayLabel.setText("");
            
            if(!editSelectedUser.equals("Select Account")) {
                editDisplayLabel.setText("");
                
                if(!editTextField.getText().replaceAll(" ","").equals("")){
                    switch(editComboItem){
                        
                        case "User Type":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setUserType(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated User Type!");
                            break;
                        
                        case "Username":
                            boolean usernameTaken = false;
                            for(User user:listOfUsers){
                                if(user.getUsername().equals(editTextField.getText())){
                                    usernameTaken = true;
                                }
                            }
                            
                            if(usernameTaken==false){
                                for(int i = 0; i<listOfUsers.size();i++){
                                    if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                        listOfUsers.get(i).setUsername(editTextField.getText());
                                        for(int j = 0;j<listOfBooks.size(); j++){
                                            if(listOfBooks.get(j).getUsername().equals(editSelectedUser)){
                                                listOfBooks.get(j).setCurrentUser(listOfUsers.get(i));
                                            }
                                        }
                                    }
                                }
                                editDisplayLabel.setText("Updated Username!");
                            }else{
                                editDisplayLabel.setText("Username TAKEN!");
                            }
                            break;
                        
                        case "Password":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setPassword(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated Password!");
                            break;
                        
                        case "First name":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setFirstName(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated first name!"); 
                            break;
                        
                        case "Last name":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setLastName(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated last name!");
                            break;
                        
                        
                        case "Degree":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setDegree(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated degree!");
                            break;
                        
                        case "Course":
                            for(int i = 0; i<listOfUsers.size();i++){
                                if(listOfUsers.get(i).getUsername().equals(editSelectedUser)){
                                    listOfUsers.get(i).setCourse(editTextField.getText());
                                }
                            }
                            editDisplayLabel.setText("Updated course!");
                            break;
                    }
                    
                    try {
                        updateData();
                        editTextField.setText("");
                    } catch (IOException ex) {
                        Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    Timer timer = new Timer(10000, new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            editDisplayLabel.setText("");
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    editUpdateComboBoxes();
                    
                }else{
                    editDisplayLabel.setText("Please enter input");
                }
            }else{
                editDisplayLabel.setText("Please select a Account");
            }
        }else{
            editDisplayLabel.setText("Please select a user type");
        }
    }//GEN-LAST:event_editUpdateButtonMouseClicked

    private void editUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editUpdateButtonActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if(!deleteTabType.equals("Select User Type")){
            if(!deleteSelectedUser.equals("Select Account")) {
                    deleteDisplayLabel.setText("");
                  for(int i = 0; i<listOfUsers.size();i++){
                      if(listOfUsers.get(i).getUsername().equals(deleteSelectedUser)){
                          listOfUsers.remove(listOfUsers.get(i));
                      }
                  }  
                try {
                    updateData();
                } catch (IOException ex) {
                    Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                deleteDisplayLabel.setText("SELECT AN ACCOUNT!");
            }
            
        }else{
            deleteDisplayLabel.setText("SELECT USER TYPE!");
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void searchLabelController(User user){
        searchUsernameLabel1.setText(user.getUsername());
        searchPasswordLabel1.setText(user.getPassword());
        searchFNameLabel1.setText(user.getFirstName());
        searchLNameLabel1.setText(user.getLastName());
   }
     
    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
 
        if(searchComboItem.equals("Select User Type")){
            searchResponseLabel.setText("Please select user type!");
        }else{
            searchResponseLabel.setText("");
            boolean userfound = false;
            
            switch(searchComboItem){
                case "Student":
                    for(User user:listOfUsers){
                        if(user.getUserType().equals("STUDENT")){
                            if(user.getUsername().equals(searchTextField.getText())){
                                searchUserTypeLabel1.setText("Student");
                                searchLabelController(user);
                                
                                searchCourseLabel1.setText(user.getCourse());
                                searchDegreeLabel1.setText(user.getDegree());
                                 userfound = true;
                                searchResponseLabel.setText("");

                                
                            }else if(userfound == false){
                               searchResponseLabel.setText("Student does not exist");
                            }
                                   
                        }
                    }
                    break;
                
                case "Librarian":
                    for(User user:listOfUsers){
                        if(user.getUserType().equals("LIBRARIAN")){
                            if(user.getUsername().equals(searchTextField.getText())){
                                searchUserTypeLabel1.setText("Librarian");
                                searchLabelController(user);
                                userfound = true;
                                searchResponseLabel.setText("");
                                
                                
                            }else if(userfound == false){
                                searchResponseLabel.setText("Librarian does not exist");
                            }
                        }
                    }
                    break;
                
                default:
                    searchResponseLabel.setText("User cannot be found");
                    clearLabels();
                    break;
            }
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchLogoutButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLogoutButton1MouseClicked
        LoginGUI.start();
        this.dispose();  
    }//GEN-LAST:event_searchLogoutButton1MouseClicked

    public void updateTable(){
        DefaultTableModel model = (DefaultTableModel)viewUserTable.getModel();
        Object rowData[] = new Object[7];
         if (viewUserTable.getRowCount() > 0) {
            for(int i = viewUserTable.getRowCount()- 1; i > -1; i--) {
                model.removeRow(i);
            }
        }

        for(int i = 0;i<listOfUsers.size(); i++){
            if(!listOfUsers.get(i).getUserType().equals("ADMIN")){
                rowData[0]=listOfUsers.get(i).getUserType();
                rowData[1]=listOfUsers.get(i).getUsername();
                rowData[2]=listOfUsers.get(i).getPassword();
                rowData[3]=listOfUsers.get(i).getFirstName();
                rowData[4]=listOfUsers.get(i).getLastName();
                if(rowData[0].equals("STUDENT")){
                    rowData[5]=listOfUsers.get(i).getCourse();
                    rowData[6]=listOfUsers.get(i).getDegree();
                }
                else{
                    rowData[5]="";
                    rowData[6]="";
                }
                model.addRow(rowData);
            }
        }
    }
    
    public void updateData() throws IOException{ // user enters details
       Library.updateUsers(listOfUsers);
       Library.updateBooks(listOfBooks);
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        editTypeOfUserComboBox.setSelectedIndex(0);
        deleteComboBox.setSelectedIndex(0);
    }
    
    public void getData() throws IOException, Exception {
        listOfUsers.clear();
        listOfStudentUsers.clear();
        listOfLibrarianUsers.clear();
        listOfBooks.clear();

        listOfStudentUsers.add("Select Account");
        listOfLibrarianUsers.add("Select Account");
        listOfUsers = new ArrayList<> (Library.getUsers());
        listOfBooks = new ArrayList<> (Library.getBooks()); // if admin updates a username then books loaned to the previous username will be updated to the new name
        
        for(User username: listOfUsers){
            if(username.getUserType().equals("LIBRARIAN")){
                listOfLibrarianUsers.add(username.getUsername());
            }
            else if(username.getUserType().equals("STUDENT")){
                listOfStudentUsers.add(username.getUsername());
            }
        }
        
        if(counter++>0){
            updateTable();
            clearLabels();
        }
    }
    
    public void editUpdateComboBoxes(){
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(editTabType.equals("Librarian")){
          editUserComboBox.setModel(new DefaultComboBoxModel(listOfLibrarianUsers.toArray()));
          editItemComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select to Edit","User Type", "Username", "Password", "First name", "Last name" }));
        }
        else if(editTabType.equals("Student")){
           editUserComboBox.setModel(new DefaultComboBoxModel(listOfStudentUsers.toArray())); 
           editItemComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select to Edit","User Type", "Username", "Password", "First name", "Last name", "Degree", "Course" }));
        }
    }
    
    public void deleteUpdateComboBoxes(){      
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(deleteTabType.equals("Librarian")){
           deleteUserComboBox.setModel(new DefaultComboBoxModel(listOfLibrarianUsers.toArray()));
           

        }else if(deleteTabType.equals("Student")){
            deleteUserComboBox.setModel(new DefaultComboBoxModel(listOfStudentUsers.toArray()));
            
        }
    }

    public static void start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane adminGUI;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel create;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox<String> createComboBox;
    private javax.swing.JTextField createCourseTextField;
    private javax.swing.JTextField createDegreeTextField;
    private javax.swing.JTextField createFirstNameTextField;
    private javax.swing.JTextField createLastNameTextField;
    private javax.swing.JButton createLogoutButton;
    private javax.swing.JTextField createPasswordTextField;
    private javax.swing.JTextField createUsernameTextField;
    private javax.swing.JLabel degreeLabel;
    private javax.swing.JPanel delete;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> deleteComboBox;
    private javax.swing.JLabel deleteCourseLabel;
    private javax.swing.JLabel deleteDegreeLabel;
    private javax.swing.JLabel deleteDisplayCourse;
    private javax.swing.JLabel deleteDisplayDegree;
    private javax.swing.JLabel deleteDisplayFirstName;
    private javax.swing.JLabel deleteDisplayLabel;
    private javax.swing.JLabel deleteDisplayLastName;
    private javax.swing.JLabel deleteDisplayPassword;
    private javax.swing.JLabel deleteDisplayUserType;
    private javax.swing.JLabel deleteDisplayUsername;
    private javax.swing.JLabel deleteFirstNameLabel;
    private javax.swing.JLabel deleteFirstNameLabel1;
    private javax.swing.JLabel deleteLastNameLabel;
    private javax.swing.JLabel deleteLastNameLabel1;
    private javax.swing.JButton deleteLogoutButton;
    private javax.swing.JLabel deletePasswordLabel;
    private javax.swing.JLabel deletePasswordLabel1;
    private javax.swing.JComboBox<String> deleteUserComboBox;
    private javax.swing.JLabel deleteUserNameLabel;
    private javax.swing.JLabel deleteUserNameLabel1;
    private javax.swing.JLabel deleteUserTypeLabel;
    private javax.swing.JLabel deleteUserTypeLabel1;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel editCourseLabel;
    private javax.swing.JLabel editDegreeLabel;
    private javax.swing.JLabel editDisplayCourse;
    private javax.swing.JLabel editDisplayDegree;
    private javax.swing.JLabel editDisplayFirstName;
    private javax.swing.JLabel editDisplayLabel;
    private javax.swing.JLabel editDisplayLastName;
    private javax.swing.JLabel editDisplayPassword;
    private javax.swing.JLabel editDisplayUserType;
    private javax.swing.JLabel editDisplayUsername;
    private javax.swing.JComboBox<String> editItemComboBox;
    private javax.swing.JButton editLogoutButton;
    private javax.swing.JTextField editTextField;
    private javax.swing.JComboBox<String> editTypeOfUserComboBox;
    private javax.swing.JButton editUpdateButton;
    private javax.swing.JComboBox<String> editUserComboBox;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JPanel search;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JLabel searchCourseLabel;
    private javax.swing.JLabel searchCourseLabel1;
    private javax.swing.JLabel searchDegreeLabel;
    private javax.swing.JLabel searchDegreeLabel1;
    private javax.swing.JLabel searchFNameLabel;
    private javax.swing.JLabel searchFNameLabel1;
    private javax.swing.JLabel searchLNameLabel;
    private javax.swing.JLabel searchLNameLabel1;
    private javax.swing.JButton searchLogoutButton;
    private javax.swing.JButton searchLogoutButton1;
    private javax.swing.JLabel searchPasswordLabel;
    private javax.swing.JLabel searchPasswordLabel1;
    private javax.swing.JLabel searchResponseLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel searchUserTypeLabel;
    private javax.swing.JLabel searchUserTypeLabel1;
    private javax.swing.JLabel searchUsernameLabel;
    private javax.swing.JLabel searchUsernameLabel1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel view;
    private javax.swing.JScrollPane viewUserScrollPane;
    private javax.swing.JTable viewUserTable;
    // End of variables declaration//GEN-END:variables
}
//1316