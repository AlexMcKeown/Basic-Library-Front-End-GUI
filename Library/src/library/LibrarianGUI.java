package library;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
import java.util.Collections;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class LibrarianGUI extends javax.swing.JFrame {
    private String searchSelectedItem = "Search by:";
    private String editSelectedISBN;
    private int counter = 0;
    private String deleteSelectedBook;
    private String editOptionSelected = "Change";
    private Book editSelectedBook;
    private ArrayList<User> listOfUsers ;
    private ArrayList<String> listOfISBNs ;
    private ArrayList<Book> reservedBooks ;
    private ArrayList<Book> listOfBooks;
    
    public LibrarianGUI() {
        listOfUsers = new ArrayList<>();
        listOfISBNs = new ArrayList<>();
        reservedBooks = new ArrayList<>();
        listOfBooks = new ArrayList<>();
   
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
       
        editAvailableRadioButton.setVisible(false);
        editUnavailableRadioButton.setVisible(false);
        deleteButton.setVisible(false);
        editOptionComboBox.setVisible(false);
        editButton.setVisible(false);
        editOptionTextField.setVisible(false);
        updatePages();
        addRowToTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAvailabilityButtonGroup = new javax.swing.ButtonGroup();
        editAvailabilityButtonGroup = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        create = new javax.swing.JPanel();
        createLogoutButton = new javax.swing.JButton();
        iSBNLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        iSBNTextField = new javax.swing.JTextField();
        titleTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        availableRadioButton = new javax.swing.JRadioButton();
        unavailableRadioButton = new javax.swing.JRadioButton();
        createBookButton = new javax.swing.JButton();
        responseLabel = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        editLogoutButton = new javax.swing.JButton();
        editISBNsLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        editISBNDisplay = new javax.swing.JLabel();
        currentInfoLabel = new javax.swing.JLabel();
        editOptionComboBox = new javax.swing.JComboBox<>();
        editOptionTextField = new javax.swing.JTextField();
        editISBNLabel = new javax.swing.JLabel();
        editTitleLabel = new javax.swing.JLabel();
        editAuthorLabel = new javax.swing.JLabel();
        editLocationLabel = new javax.swing.JLabel();
        editAvailabilityLabel = new javax.swing.JLabel();
        editTitleDisplay = new javax.swing.JLabel();
        editAuthorDisplay = new javax.swing.JLabel();
        editLocationDisplay = new javax.swing.JLabel();
        editAvailabilityDisplay = new javax.swing.JLabel();
        editChangeResponseLabel = new javax.swing.JLabel();
        editComboBox = new javax.swing.JComboBox<>();
        editISBNresponseLabel = new javax.swing.JLabel();
        editAvailableRadioButton = new javax.swing.JRadioButton();
        editUnavailableRadioButton = new javax.swing.JRadioButton();
        view = new javax.swing.JPanel();
        viewLogoutButton = new javax.swing.JButton();
        viewISBNsLabel = new javax.swing.JLabel();
        viewComboBox = new javax.swing.JComboBox<>();
        viewTitleDisplay = new javax.swing.JLabel();
        viewLocationDisplay = new javax.swing.JLabel();
        viewAvailabilityLabel = new javax.swing.JLabel();
        viewAuthorDisplay = new javax.swing.JLabel();
        viewLocationLabel = new javax.swing.JLabel();
        viewISBNLabel = new javax.swing.JLabel();
        viewTitleLabel = new javax.swing.JLabel();
        viewAvailabilityDisplay = new javax.swing.JLabel();
        viewAuthorLabel = new javax.swing.JLabel();
        viewISBNDisplay = new javax.swing.JLabel();
        viewResponseLabel = new javax.swing.JLabel();
        currentInfoLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        deleteLogoutButton = new javax.swing.JButton();
        deleteISBNsLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        deleteComboBox = new javax.swing.JComboBox<>();
        deleteTitleDisplay = new javax.swing.JLabel();
        deleteLocationDisplay = new javax.swing.JLabel();
        deleteAvailabilityLabel = new javax.swing.JLabel();
        deleteAuthorDisplay = new javax.swing.JLabel();
        deleteLocationLabel = new javax.swing.JLabel();
        deleteISBNLabel = new javax.swing.JLabel();
        deleteTitleLabel = new javax.swing.JLabel();
        deleteAvailabilityDisplay = new javax.swing.JLabel();
        deleteAuthorLabel = new javax.swing.JLabel();
        deleteISBNDisplay = new javax.swing.JLabel();
        deleteResponseLabel = new javax.swing.JLabel();
        currentInfoLabel2 = new javax.swing.JLabel();
        reserved = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservedBookTable = new javax.swing.JTable();
        sortComboBox = new javax.swing.JComboBox<>();
        reservedBooksDisplayLabel = new javax.swing.JLabel();
        reserveLogoutButton = new javax.swing.JButton();
        search = new javax.swing.JPanel();
        searchLogoutButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        searchResponseLabel = new javax.swing.JLabel();
        searchISBNLabel = new javax.swing.JLabel();
        searchTitleLabel = new javax.swing.JLabel();
        searchAuthorLabel = new javax.swing.JLabel();
        searchLocationLabel = new javax.swing.JLabel();
        searchAvailabilityLabel = new javax.swing.JLabel();
        searchISBNLabel1 = new javax.swing.JLabel();
        searchTitleLabel1 = new javax.swing.JLabel();
        searchAuthorLabel1 = new javax.swing.JLabel();
        searchLocationLabel1 = new javax.swing.JLabel();
        searchAvailabilityLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(776, 403));
        setResizable(false);

        createLogoutButton.setText("Logout");
        createLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLogoutButtonMouseClicked(evt);
            }
        });
        createLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLogoutButtonActionPerformed(evt);
            }
        });

        iSBNLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        iSBNLabel.setText("ISBN:");

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        titleLabel.setText("Title:");

        authorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        authorLabel.setText("Author:");

        locationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        locationLabel.setText("Location:");

        availabilityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        availabilityLabel.setText("Availability:");

        headerLabel.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        headerLabel.setText("Create a book record");

        iSBNTextField.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        titleTextField.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        authorTextField.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        locationTextField.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        createAvailabilityButtonGroup.add(availableRadioButton);
        availableRadioButton.setText("Available");
        availableRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableRadioButtonActionPerformed(evt);
            }
        });

        createAvailabilityButtonGroup.add(unavailableRadioButton);
        unavailableRadioButton.setText("Unavailable");
        unavailableRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unavailableRadioButtonActionPerformed(evt);
            }
        });

        createBookButton.setText("Create Book");
        createBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBookButtonMouseClicked(evt);
            }
        });
        createBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBookButtonActionPerformed(evt);
            }
        });

        responseLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(responseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabel)
                .addGap(154, 154, 154)
                .addComponent(createLogoutButton))
            .addGroup(createLayout.createSequentialGroup()
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(iSBNLabel)))
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorTextField)
                    .addComponent(iSBNTextField)
                    .addComponent(titleTextField)
                    .addComponent(locationTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(createLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(availabilityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unavailableRadioButton)
                .addGap(0, 236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createLogoutButton)
                    .addGroup(createLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(headerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iSBNLabel)
                    .addComponent(iSBNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availabilityLabel)
                    .addComponent(availableRadioButton)
                    .addComponent(unavailableRadioButton))
                .addGap(28, 28, 28)
                .addComponent(createBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabs.addTab("Create", create);

        editLogoutButton.setText("Logout");
        editLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLogoutButtonMouseClicked(evt);
            }
        });

        editISBNsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        editISBNsLabel.setText("ISBNs:");

        editButton.setText("Update");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        editISBNDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        currentInfoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        currentInfoLabel.setText("Current Information:");

        editOptionComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        editOptionComboBox.setMaximumRowCount(5);
        editOptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Change", "ISBN", "Title", "Author", "Location", "Availability" }));
        editOptionComboBox.setSelectedIndex(0);
        editOptionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOptionComboBoxActionPerformed(evt);
            }
        });

        editOptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOptionTextFieldActionPerformed(evt);
            }
        });

        editISBNLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editISBNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editISBNLabel.setText("ISBN:");

        editTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editTitleLabel.setText("Title:");

        editAuthorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAuthorLabel.setText("Author:");

        editLocationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editLocationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLocationLabel.setText("Location:");

        editAvailabilityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editAvailabilityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAvailabilityLabel.setText("Availability:");

        editTitleDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        editAuthorDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        editLocationDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        editAvailabilityDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        editChangeResponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        editChangeResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editChangeResponseLabel.setToolTipText("");

        editComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        editComboBox.setMaximumRowCount(4);
        editComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray())
        );
        editComboBox.setSelectedIndex(0);
        editComboBox.setSelectedItem(0);
        editComboBox.setRequestFocusEnabled(false);
        editComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editComboBoxActionPerformed(evt);
            }
        });

        editISBNresponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        editISBNresponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        editAvailabilityButtonGroup.add(editAvailableRadioButton);
        editAvailableRadioButton.setText("Available");
        editAvailableRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAvailableRadioButtonActionPerformed(evt);
            }
        });

        editAvailabilityButtonGroup.add(editUnavailableRadioButton);
        editUnavailableRadioButton.setText("Unavailable");
        editUnavailableRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUnavailableRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editISBNresponseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editChangeResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(editOptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editOptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(editAvailableRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editUnavailableRadioButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addComponent(editAvailabilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(editLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(editAuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editISBNLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editAvailabilityDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editLocationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editAuthorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editTitleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editISBNDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editISBNsLabel)
                            .addComponent(currentInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147)
                .addComponent(editLogoutButton))
        );

        editLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editAuthorDisplay, editAvailabilityDisplay, editISBNDisplay, editLocationDisplay, editTitleDisplay});

        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editISBNsLabel)))
                    .addComponent(editLogoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editISBNresponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editISBNLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editISBNDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addComponent(editTitleDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editAuthorDisplay))
                    .addGroup(editLayout.createSequentialGroup()
                        .addComponent(editTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editAuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editLocationDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editLocationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editAvailabilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editAvailabilityDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addComponent(editChangeResponseLabel)
                        .addGap(9, 9, 9)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editOptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editOptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(editButton))
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editAvailableRadioButton)
                        .addComponent(editUnavailableRadioButton)))
                .addGap(27, 27, 27))
        );

        editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editAuthorDisplay, editAvailabilityDisplay, editLocationDisplay});

        editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editChangeResponseLabel, editISBNDisplay});

        tabs.addTab("Edit", edit);

        viewLogoutButton.setText("Logout");
        viewLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLogoutButtonMouseClicked(evt);
            }
        });

        viewISBNsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        viewISBNsLabel.setText("ISBNs:");

        viewComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        viewComboBox.setMaximumRowCount(4);
        viewComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray())
        );
        viewComboBox.setSelectedIndex(0);
        viewComboBox.setSelectedItem(0);
        viewComboBox.setRequestFocusEnabled(false);
        viewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboBoxActionPerformed(evt);
            }
        });

        viewTitleDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        viewLocationDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        viewAvailabilityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewAvailabilityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAvailabilityLabel.setText("Availability:");

        viewAuthorDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        viewLocationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewLocationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLocationLabel.setText("Location:");

        viewISBNLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewISBNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewISBNLabel.setText("ISBN:");

        viewTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewTitleLabel.setText("Title:");

        viewAvailabilityDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        viewAuthorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        viewAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAuthorLabel.setText("Author:");

        viewISBNDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        viewResponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        viewResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentInfoLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        currentInfoLabel1.setText("Current Information:");

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(viewISBNsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(viewLogoutButton))
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(viewISBNLabel)
                                        .addComponent(viewTitleLabel))
                                    .addGroup(viewLayout.createSequentialGroup()
                                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(viewAuthorLabel)
                                            .addComponent(viewLocationLabel))
                                        .addGap(1, 1, 1))))
                            .addComponent(viewAvailabilityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewISBNDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewLocationDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAuthorDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewTitleDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAvailabilityDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addComponent(currentInfoLabel1)
                        .addGap(262, 262, 262)
                        .addComponent(viewResponseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewLogoutButton)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewISBNsLabel)
                            .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(currentInfoLabel1)))
                .addGap(18, 18, 18)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewISBNDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewISBNLabel))
                .addGap(7, 7, 7)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTitleLabel)
                    .addComponent(viewTitleDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAuthorLabel)
                    .addComponent(viewAuthorDisplay))
                .addGap(5, 5, 5)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewLocationLabel)
                    .addComponent(viewLocationDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAvailabilityLabel)
                    .addComponent(viewAvailabilityDisplay))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        viewLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {viewAuthorDisplay, viewAvailabilityDisplay, viewISBNDisplay, viewLocationDisplay, viewTitleDisplay});

        tabs.addTab("View", view);

        deleteLogoutButton.setText("Logout");
        deleteLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLogoutButtonMouseClicked(evt);
            }
        });

        deleteISBNsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        deleteISBNsLabel.setText("ISBNs:");

        deleteButton.setText("Delete Record");
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

        deleteComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        deleteComboBox.setMaximumRowCount(4);
        deleteComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray())
        );
        deleteComboBox.setSelectedIndex(0);
        deleteComboBox.setSelectedItem(0);
        deleteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteComboBoxActionPerformed(evt);
            }
        });

        deleteTitleDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        deleteLocationDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        deleteAvailabilityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteAvailabilityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAvailabilityLabel.setText("Availability:");

        deleteAuthorDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        deleteLocationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteLocationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLocationLabel.setText("Location:");

        deleteISBNLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteISBNLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteISBNLabel.setText("ISBN:");

        deleteTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteTitleLabel.setText("Title:");

        deleteAvailabilityDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        deleteAuthorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAuthorLabel.setText("Author:");

        deleteISBNDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        deleteResponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 15)); // NOI18N
        deleteResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentInfoLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        currentInfoLabel2.setText("Current Information:");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deleteISBNLabel)
                                .addComponent(deleteTitleLabel))
                            .addGroup(deleteLayout.createSequentialGroup()
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deleteAuthorLabel)
                                    .addComponent(deleteLocationLabel))
                                .addGap(1, 1, 1))))
                    .addComponent(deleteAvailabilityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteISBNDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteLocationDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteAuthorDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTitleDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteAvailabilityDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                        .addComponent(deleteISBNsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(deleteLogoutButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(currentInfoLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteResponseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteLogoutButton)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteISBNsLabel)
                            .addComponent(deleteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentInfoLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteISBNDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteISBNLabel))
                .addGap(7, 7, 7)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteTitleLabel)
                    .addComponent(deleteTitleDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAuthorLabel)
                    .addComponent(deleteAuthorDisplay))
                .addGap(5, 5, 5)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteLocationLabel)
                    .addComponent(deleteLocationDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteAvailabilityLabel)
                    .addComponent(deleteAvailabilityDisplay))
                .addGap(35, 35, 35)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        deleteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteAuthorDisplay, deleteAuthorLabel, deleteAvailabilityDisplay, deleteAvailabilityLabel, deleteISBNDisplay, deleteISBNLabel, deleteLocationDisplay, deleteLocationLabel, deleteTitleDisplay, deleteTitleLabel});

        tabs.addTab("Delete", delete);

        reservedBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Type", "Username", "ISBN", "Title", "Author", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reservedBookTable);
        if (reservedBookTable.getColumnModel().getColumnCount() > 0) {
            reservedBookTable.getColumnModel().getColumn(0).setResizable(false);
            reservedBookTable.getColumnModel().getColumn(1).setResizable(false);
            reservedBookTable.getColumnModel().getColumn(2).setResizable(false);
            reservedBookTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            reservedBookTable.getColumnModel().getColumn(3).setResizable(false);
            reservedBookTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            reservedBookTable.getColumnModel().getColumn(4).setResizable(false);
            reservedBookTable.getColumnModel().getColumn(5).setResizable(false);
        }

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By", "UserType", "Username", "ISBN", "Title", "Author" }));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        reservedBooksDisplayLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        reservedBooksDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        reserveLogoutButton.setText("Logout");
        reserveLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reserveLogoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reservedLayout = new javax.swing.GroupLayout(reserved);
        reserved.setLayout(reservedLayout);
        reservedLayout.setHorizontalGroup(
            reservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(reservedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservedBooksDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reserveLogoutButton))
        );
        reservedLayout.setVerticalGroup(
            reservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservedLayout.createSequentialGroup()
                .addGroup(reservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reserveLogoutButton))
                    .addComponent(reservedBooksDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Reserved Books", reserved);

        searchLogoutButton.setText("Logout");
        searchLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLogoutButtonMouseClicked(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by:", "Keyword", "ISBN", "Title", "Author" }));
        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        searchTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchResponseLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        searchResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        searchISBNLabel.setText("ISBN:");

        searchTitleLabel.setText("Title:");

        searchAuthorLabel.setText("Author:");

        searchLocationLabel.setText("Location:");

        searchAvailabilityLabel.setText("Availability:");

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(searchButton))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchLogoutButton))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addGap(57, 100, Short.MAX_VALUE)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchResponseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchTitleLabel)
                            .addComponent(searchISBNLabel)
                            .addComponent(searchAuthorLabel))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchISBNLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchAuthorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchAvailabilityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchLocationLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchAvailabilityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(searchLogoutButton))
                .addGap(1, 1, 1)
                .addComponent(searchButton)
                .addGap(0, 0, 0)
                .addComponent(searchResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchISBNLabel)
                    .addComponent(searchLocationLabel)
                    .addComponent(searchISBNLabel1)
                    .addComponent(searchLocationLabel1))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTitleLabel)
                    .addComponent(searchAvailabilityLabel)
                    .addComponent(searchTitleLabel1)
                    .addComponent(searchAvailabilityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAuthorLabel)
                    .addComponent(searchAuthorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        tabs.addTab("Search", search);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLogoutButtonActionPerformed

    }//GEN-LAST:event_createLogoutButtonActionPerformed

    private void availableRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableRadioButtonActionPerformed

    }//GEN-LAST:event_availableRadioButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
       
    }//GEN-LAST:event_editButtonActionPerformed
    
    private void createBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBookButtonActionPerformed
    }//GEN-LAST:event_createBookButtonActionPerformed

    private void createBookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBookButtonMouseClicked
        boolean isbnChecker = true;
        if(iSBNTextField.getText().replaceAll(" ","").equals("") || titleTextField.getText().replaceAll(" ","").equals("")  || authorTextField.getText().replaceAll(" ","").equals("") || locationTextField.getText().replaceAll(" ","").equals("")|| getSelectedButtonText(createAvailabilityButtonGroup) == null ){
            responseLabel.setText("Error! Please complete!");
        }
        else if(iSBNTextField.getText().replaceAll("[0-9]","").equals("") == true){
            if(listOfBooks.size()>0){
                for(String isbn: listOfISBNs){
                    if(isbn.equals(iSBNTextField.getText().replaceAll(" ",""))){
                      isbnChecker = false;
                    }
                }     

                if(isbnChecker == true){
                    try{
                        listOfBooks.add(new Book(iSBNTextField.getText().replaceAll(" ",""), titleTextField.getText(),authorTextField.getText(), locationTextField.getText(),getSelectedButtonText(createAvailabilityButtonGroup),null));
                      updateBookRecord();
                    }catch(IOException ex){
                      Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    iSBNTextField.setText("");
                    authorTextField.setText("");
                    titleTextField.setText("");
                    locationTextField.setText("");
                    createAvailabilityButtonGroup.clearSelection();
                    responseLabel.setText("Book ADDED!");
                }
                else{
                    responseLabel.setText("Error ISBN Taken!");
                }
            
            }
            else if(listOfBooks.size()==0){
                try{
                    listOfBooks.add(new Book(iSBNTextField.getText().replaceAll(" ",""), titleTextField.getText(),authorTextField.getText(), locationTextField.getText(),getSelectedButtonText(createAvailabilityButtonGroup), null));
                    updateBookRecord();
                }catch (IOException ex) {
                    Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                iSBNTextField.setText("");
                authorTextField.setText("");
                titleTextField.setText("");
                locationTextField.setText("");
                editAvailabilityButtonGroup.clearSelection();
                responseLabel.setText("Book ADDED!");
            } 
        }
        else{
            responseLabel.setText("Please enter a number ONLY for ISBN!");
        }
    }//GEN-LAST:event_createBookButtonMouseClicked
 
    /* NETBEANS DIDNT UPDATE A VARIABLE NAME 
    private void optionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionTextFieldActionPerformed
*/
    private void editOptionTextFieldActionPerformed(ActionEvent evt){
        
    }
    
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

    private void viewLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();
    }//GEN-LAST:event_viewLogoutButtonMouseClicked

    private void unavailableRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unavailableRadioButtonActionPerformed
    }//GEN-LAST:event_unavailableRadioButtonActionPerformed

    private void editOptionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOptionComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        editOptionSelected = (String)cb.getSelectedItem();
        editAvailabilityButtonGroup.clearSelection();
        
        if(editOptionSelected.equals("Availability")){
            editOptionTextField.setVisible(false);
            editAvailableRadioButton.setVisible(true);
            editUnavailableRadioButton.setVisible(true);
            editOptionTextField.setText("");
        }
        else if(!editOptionSelected.equals("Availability")){
            editAvailableRadioButton.setVisible(false);
            editUnavailableRadioButton.setVisible(false);
            editOptionTextField.setVisible(true);
            editAvailabilityButtonGroup.clearSelection();
        }
    }//GEN-LAST:event_editOptionComboBoxActionPerformed

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        boolean uniqueCheck = true;     
        String option = "";
        
        if(editOptionSelected.equals("Change")){
            uniqueCheck = false;
            editISBNresponseLabel.setText("Please select what you would like to edit!");
        }
        
        if(editOptionSelected.equals("ISBN") & !editOptionTextField.getText().replaceAll("[0-9]","").equals("")){
            uniqueCheck = false;
            editISBNresponseLabel.setText("Error! Invaild ISBN! e.g. 611221");
        }
        
        if(editOptionSelected.equals("Availability") & editAvailabilityButtonGroup.getSelection() == null ){
            uniqueCheck = false;
            editISBNresponseLabel.setText("Error! Please select an Availability i.e Available or Unavailable!");
        }
        
        if(!editOptionSelected.equals("Availability") && !editOptionSelected.equals("Change") && editOptionTextField.getText().replaceAll(" ","").equals("")){
            uniqueCheck = false;
            editISBNresponseLabel.setText("Error! Please enter input!");
        }
        
        if(editOptionSelected.equals("ISBN") & uniqueCheck == true){
            for(Book aBook:listOfBooks){
                if(aBook.getISBN().equals(editOptionTextField.getText().replaceAll(" ",""))){
                    uniqueCheck = false;
                    editISBNresponseLabel.setText("Error! ISBN IN USE!");
                }
            }  
        }
        
        if(uniqueCheck == true & !editOptionSelected.equals("Select ISBN")){
            editISBNresponseLabel.setText("");
            
            for(int i = 0;i<listOfBooks.size();i++){
                if(listOfBooks.get(i).getISBN().equals(editSelectedBook.getISBN())){
                    switch(editOptionSelected){
                        
                        case "ISBN":
                            listOfBooks.get(i).setISBN(editOptionTextField.getText());
                            break;
               
                        case "Title":
                            listOfBooks.get(i).setTitle(editOptionTextField.getText());
                            break;
                   
                        case "Author":
                            listOfBooks.get(i).setAuthor(editOptionTextField.getText());
                            break;
                   
                        case "Location":
                            listOfBooks.get(i).setLocation(editOptionTextField.getText());
                            break;
                   
                        case "Availability":
                            listOfBooks.get(i).setAvailability(getSelectedButtonText(editAvailabilityButtonGroup));
                            break;
                   
                        case "Change":
                            editChangeResponseLabel.setText("Error! Please select what you would like to change");
                            break;
                  
                        default:
                            editChangeResponseLabel.setText("Error! Please select what you would like to change");
                            break;
                    }
                    editISBNDisplay.setText(listOfBooks.get(i).getISBN());
                    editTitleDisplay.setText(listOfBooks.get(i).getTitle());
                    editAuthorDisplay.setText(listOfBooks.get(i).getAuthor());
                    editLocationDisplay.setText(listOfBooks.get(i).getLocation());
                    editAvailabilityDisplay.setText(listOfBooks.get(i).getAvailability());
                    option = listOfBooks.get(i).getISBN();

                }
            }

            try {
                updateBookRecord(); // will reset all colums
            } catch (IOException ex) {
                Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            editAvailabilityButtonGroup.clearSelection();
            editOptionTextField.setText("");
            editChangeResponseLabel.setText("Updated!");
            editComboBox.setSelectedItem(editSelectedISBN);
            editOptionComboBox.setSelectedItem(option); //  will reselect last column entered by user as if it never changed
            
            if(editOptionSelected.equals("Availability")){
                editOptionTextField.setVisible(false);
                editAvailableRadioButton.setVisible(true);
            }
            
            Timer timer = new Timer(10000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    editChangeResponseLabel.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_editButtonMouseClicked
 
    private void viewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String comboBoxString = (String)cb.getSelectedItem();
        if(comboBoxString.equals("Select ISBN")){
            viewResponseLabel.setText("Error! Please select an ISBNS!");
            viewISBNDisplay.setText("");
            viewTitleDisplay.setText("");
            viewAuthorDisplay.setText("");
            viewLocationDisplay.setText("");
            viewAvailabilityDisplay.setText("");  
        }
        else{
            for(Book book: listOfBooks){
                if(book.getISBN().equals(comboBoxString)){
                    viewISBNDisplay.setText(book.getISBN());
                    viewTitleDisplay.setText(book.getTitle());
                    viewAuthorDisplay.setText(book.getAuthor());
                    viewLocationDisplay.setText(book.getLocation());
                    viewAvailabilityDisplay.setText(book.getAvailability());
                }
            }
        }
    }//GEN-LAST:event_viewComboBoxActionPerformed

    private void deleteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String comboBoxString = (String)cb.getSelectedItem();
        if(comboBoxString.equals("Select ISBN")){
            deleteResponseLabel.setText("Error! Please select an ISBNS!");
            deleteISBNDisplay.setText("");
            deleteTitleDisplay.setText("");
            deleteAuthorDisplay.setText("");
            deleteLocationDisplay.setText("");
            deleteAvailabilityDisplay.setText("");
            deleteButton.setVisible(false);
        }
        else{
            for(Book book: listOfBooks){
                if(book.getISBN().equals(comboBoxString)){
                    deleteISBNDisplay.setText(book.getISBN());
                    deleteTitleDisplay.setText(book.getTitle());
                    deleteAuthorDisplay.setText(book.getAuthor());
                    deleteLocationDisplay.setText(book.getLocation());
                    deleteAvailabilityDisplay.setText(book.getAvailability());
                    deleteSelectedBook = comboBoxString;
                    deleteButton.setVisible(true);
                }
            } 
        }
    }//GEN-LAST:event_deleteComboBoxActionPerformed
    
    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if(deleteTitleDisplay.getText().equals("")==true){ // checks if any label is display info as that would mean user had interacted with the combobox
            deleteResponseLabel.setText("Error! Please select an ISBNS!");
        }
        else if(deleteTitleDisplay.getText().equals("")==false){
            clearDisplay();
            
            for(int i = 0; i<listOfBooks.size(); i++){
                if(listOfBooks.get(i).getISBN().equals(deleteSelectedBook)){
                    listOfBooks.remove(i);
                    try {
                        updateBookRecord();
                    } catch (IOException ex) {
                        Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    deleteButton.setVisible(false); // resets the combo box to "Select ISBN" and once a ISBN has been selected the button = true 
                    deleteResponseLabel.setText("Book deleted!");
                    Timer timer = new Timer(10000, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            deleteResponseLabel.setText("");
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            } 
        }        
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void editComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        editSelectedISBN = (String)cb.getSelectedItem();
        
        if(editSelectedISBN.equals("Select ISBN")){
            editChangeResponseLabel.setText("Please select an ISBN");
            editISBNDisplay.setText("");
            editTitleDisplay.setText("");
            editAuthorDisplay.setText("");
            editLocationDisplay.setText("");
            editAvailabilityDisplay.setText("");
            editOptionTextField.setVisible(false);
            editOptionComboBox.setVisible(false);
            editButton.setVisible(false);
        }
        else if(!editSelectedISBN.equals("Select ISBN")){
            editChangeResponseLabel.setText("");
            for(Book book: listOfBooks){
                if(book.getISBN().equals(editSelectedISBN)){
                    editISBNDisplay.setText(book.getISBN());
                    editTitleDisplay.setText(book.getTitle());
                    editAuthorDisplay.setText(book.getAuthor());
                    editLocationDisplay.setText(book.getLocation());
                    editAvailabilityDisplay.setText(book.getAvailability());
                    editSelectedBook = book; 
                    editButton.setVisible(true);
                    editOptionComboBox.setVisible(true);
                    
                    if(editOptionSelected.equals("Availability")){ // changes from textfield to radio button if option x is selected
                        editOptionTextField.setVisible(false); 
                        editAvailableRadioButton.setVisible(true);

               
                    }else{ // changes from radio to textfield if not x
                        editOptionTextField.setVisible(true); 
                        editAvailableRadioButton.setVisible(false);               
                    }
                }
            }
        }
    }//GEN-LAST:event_editComboBoxActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
        int compareInt;
        JComboBox cb = (JComboBox)evt.getSource();
        String comboBoxString = (String)cb.getSelectedItem();
        if(comboBoxString.equals("Sort By")){
            reservedBooksDisplayLabel.setText("Please Choose a Method of Sort");
        }
        else{
            reservedBooksDisplayLabel.setText("");
            for(int i = 0; i < reservedBooks.size()-1;i++){
                for(int j=0; j < reservedBooks.size()-1-i; j++){
                    switch(comboBoxString){
                        case "UserType":
                            reservedBooks.get(j).setCompareUser("UserType");
                            break;
                        
                        case "Username":
                            reservedBooks.get(j).setCompareUser("Username");
                            break;
                        
                        case "ISBN":
                            reservedBooks.get(j).setCompareBook("ISBN");
                            break;
                        
                        case "Title":
                            reservedBooks.get(j).setCompareBook("Title");
                            break;
                       
                        case "Author":
                            reservedBooks.get(j).setCompareBook("Author");
                            break;
                       
                       case "Location":
                           reservedBooks.get(j).setCompareBook("Location");
                           break; 
                    }
                    compareInt = reservedBooks.get(j).compareToCurrentUser(reservedBooks.get(j+1).getCurrentUser());
                    if(compareInt < 0){ 
                        Collections.swap(reservedBooks, j,(j+1));
                    }
                }
            }
            addRowToTable();
        }
    }//GEN-LAST:event_sortComboBoxActionPerformed

    private void editAvailableRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAvailableRadioButtonActionPerformed
    }//GEN-LAST:event_editAvailableRadioButtonActionPerformed

    private void editUnavailableRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUnavailableRadioButtonActionPerformed
    }//GEN-LAST:event_editUnavailableRadioButtonActionPerformed

    private void reserveLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();
    }//GEN-LAST:event_reserveLogoutButtonMouseClicked

    private void searchLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();
    }//GEN-LAST:event_searchLogoutButtonMouseClicked

    private void updateSearchDisplay(){
        searchISBNLabel1.setText("");
        searchTitleLabel1.setText("");
        searchAuthorLabel1.setText("");
        searchLocationLabel1.setText("");
        searchAvailabilityLabel1.setText("");
    }
    
    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        boolean controlFinder = false;
        if(searchSelectedItem.replaceAll(" ","").equals("")){
            searchResponseLabel.setText("Please enter input");
        updateSearchDisplay();
        }
        
        else if(searchSelectedItem.equals("Search by:")){
            updateSearchDisplay();
             searchResponseLabel.setText("Please choose search filter");

        }else{
            searchResponseLabel.setText("");
            for(Book book:listOfBooks){
                boolean finder = false;
                switch(searchSelectedItem){
                    
                    case "Keyword":
                        if(book.getISBN().equals(searchTextField.getText())){
                            finder = true;
                        }

                        else if(book.getTitle().equals(searchTextField.getText())){
                            finder = true;
                        }
                        
                        else if(book.getAuthor().equals(searchTextField.getText())){
                            finder = true;
                        }
                        
                        else if(book.getLocation().equals(searchTextField.getText())){
                            finder = true;
                        }
                        break;
                    
                    case "ISBN":
                        if(book.getISBN().equals(searchTextField.getText())){
                            finder = true;
                        }
                        break;
                    
                    case "Title":
                        if(book.getTitle().equals(searchTextField.getText())){
                            finder = true;
                        }
                        break;
                    
                    case "Author":
                        if(book.getAuthor().equals(searchTextField.getText())){
                            finder = true;
                        }
                        break;
                }
                if(finder == true){
                    showSearch(book);
                    controlFinder = true;
                }
            }
            if(controlFinder == false){
                searchResponseLabel.setText("The Following Book dose not exist. Sorry!");
                updateSearchDisplay();
            }
        }
    }//GEN-LAST:event_searchButtonMouseClicked

      private void showSearch(Book book){
        searchResponseLabel.setText("");

        searchISBNLabel1.setText(book.getISBN());
        searchTitleLabel1.setText(book.getTitle());
        searchAuthorLabel1.setText(book.getAuthor());
        searchLocationLabel1.setText(book.getLocation());
        searchAvailabilityLabel1.setText(book.getAvailability()); 
    }
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        searchSelectedItem = (String)cb.getSelectedItem();
    }//GEN-LAST:event_filterComboBoxActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void clearDisplay(){
        deleteISBNDisplay.setText("");
        deleteTitleDisplay.setText("");
        deleteAuthorDisplay.setText("");
        deleteLocationDisplay.setText("");
        deleteAvailabilityDisplay.setText("");
               
        editISBNDisplay.setText("");
        editTitleDisplay.setText("");
        editAuthorDisplay.setText("");
        editLocationDisplay.setText("");
        editAvailabilityDisplay.setText("");
               
        viewISBNDisplay.setText("");
        viewTitleDisplay.setText("");
        viewAuthorDisplay.setText("");
        viewLocationDisplay.setText("");
        viewAvailabilityDisplay.setText("");
        
        searchISBNLabel1.setText("");
        searchTitleLabel1.setText("");
        searchAuthorLabel1.setText("");
        searchLocationLabel1.setText("");
        searchAvailabilityLabel1.setText("");
    }    
    
    public void getData() throws IOException, Exception {
        listOfBooks.clear();
        listOfISBNs.clear();
        reservedBooks.clear();
        listOfUsers.clear();

        listOfUsers = new ArrayList<> (Library.getUsers()); 
        listOfBooks = new ArrayList<> (Library.getBooks());
        listOfISBNs = new ArrayList<>(Library.getISBNs());
        reservedBooks = new ArrayList<>(Library.getReservedBooks());
     
        if(this.counter++>0){
            addRowToTable();
            updatePages();
        }
    }

    public void updatePages(){
        editComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray()));
        editOptionComboBox.setSelectedIndex(0);
        sortComboBox.setSelectedIndex(0);
        deleteComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray()));
        viewComboBox.setModel(new DefaultComboBoxModel(listOfISBNs.toArray()));
        
        editOptionTextField.setVisible(false);
        editOptionComboBox.setVisible(false);
        editButton.setVisible(false);    
        clearDisplay();
    }

    public void updateBookRecord() throws IOException{	
        Library.updateBooks(listOfBooks);
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }
        return null;
    }
    
    public static void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianGUI().setVisible(true);
            }
        });
    }
    
    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel)reservedBookTable.getModel();
        if (reservedBookTable.getRowCount() > 0) {
            for(int i = reservedBookTable.getRowCount()- 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        
        Object rowData[] = new Object[6];
        for(int i = 0;i<reservedBooks.size(); i++){
            rowData[0]=reservedBooks.get(i).getUserType();
            rowData[1]=reservedBooks.get(i).getUsername();
            rowData[2]=reservedBooks.get(i).getISBN();
            rowData[3]=reservedBooks.get(i).getTitle();
            rowData[4]=reservedBooks.get(i).getAuthor();
            rowData[5]=reservedBooks.get(i).getLocation();
            model.addRow(rowData);
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JRadioButton availableRadioButton;
    private javax.swing.JPanel create;
    private javax.swing.ButtonGroup createAvailabilityButtonGroup;
    private javax.swing.JButton createBookButton;
    private javax.swing.JButton createLogoutButton;
    private javax.swing.JLabel currentInfoLabel;
    private javax.swing.JLabel currentInfoLabel1;
    private javax.swing.JLabel currentInfoLabel2;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel deleteAuthorDisplay;
    private javax.swing.JLabel deleteAuthorLabel;
    private javax.swing.JLabel deleteAvailabilityDisplay;
    private javax.swing.JLabel deleteAvailabilityLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> deleteComboBox;
    private javax.swing.JLabel deleteISBNDisplay;
    private javax.swing.JLabel deleteISBNLabel;
    private javax.swing.JLabel deleteISBNsLabel;
    private javax.swing.JLabel deleteLocationDisplay;
    private javax.swing.JLabel deleteLocationLabel;
    private javax.swing.JButton deleteLogoutButton;
    private javax.swing.JLabel deleteResponseLabel;
    private javax.swing.JLabel deleteTitleDisplay;
    private javax.swing.JLabel deleteTitleLabel;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel editAuthorDisplay;
    private javax.swing.JLabel editAuthorLabel;
    private javax.swing.ButtonGroup editAvailabilityButtonGroup;
    private javax.swing.JLabel editAvailabilityDisplay;
    private javax.swing.JLabel editAvailabilityLabel;
    private javax.swing.JRadioButton editAvailableRadioButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editChangeResponseLabel;
    private javax.swing.JComboBox<String> editComboBox;
    private javax.swing.JLabel editISBNDisplay;
    private javax.swing.JLabel editISBNLabel;
    private javax.swing.JLabel editISBNresponseLabel;
    private javax.swing.JLabel editISBNsLabel;
    private javax.swing.JLabel editLocationDisplay;
    private javax.swing.JLabel editLocationLabel;
    private javax.swing.JButton editLogoutButton;
    private javax.swing.JComboBox<String> editOptionComboBox;
    private javax.swing.JTextField editOptionTextField;
    private javax.swing.JLabel editTitleDisplay;
    private javax.swing.JLabel editTitleLabel;
    private javax.swing.JRadioButton editUnavailableRadioButton;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel iSBNLabel;
    private javax.swing.JTextField iSBNTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton reserveLogoutButton;
    private javax.swing.JPanel reserved;
    private javax.swing.JTable reservedBookTable;
    private javax.swing.JLabel reservedBooksDisplayLabel;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JPanel search;
    private javax.swing.JLabel searchAuthorLabel;
    private javax.swing.JLabel searchAuthorLabel1;
    private javax.swing.JLabel searchAvailabilityLabel;
    private javax.swing.JLabel searchAvailabilityLabel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchISBNLabel;
    private javax.swing.JLabel searchISBNLabel1;
    private javax.swing.JLabel searchLocationLabel;
    private javax.swing.JLabel searchLocationLabel1;
    private javax.swing.JButton searchLogoutButton;
    private javax.swing.JLabel searchResponseLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel searchTitleLabel;
    private javax.swing.JLabel searchTitleLabel1;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JRadioButton unavailableRadioButton;
    private javax.swing.JPanel view;
    private javax.swing.JLabel viewAuthorDisplay;
    private javax.swing.JLabel viewAuthorLabel;
    private javax.swing.JLabel viewAvailabilityDisplay;
    private javax.swing.JLabel viewAvailabilityLabel;
    private javax.swing.JComboBox<String> viewComboBox;
    private javax.swing.JLabel viewISBNDisplay;
    private javax.swing.JLabel viewISBNLabel;
    private javax.swing.JLabel viewISBNsLabel;
    private javax.swing.JLabel viewLocationDisplay;
    private javax.swing.JLabel viewLocationLabel;
    private javax.swing.JButton viewLogoutButton;
    private javax.swing.JLabel viewResponseLabel;
    private javax.swing.JLabel viewTitleDisplay;
    private javax.swing.JLabel viewTitleLabel;
    // End of variables declaration//GEN-END:variables
}
