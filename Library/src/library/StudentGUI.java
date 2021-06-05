package library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class StudentGUI extends javax.swing.JFrame {
    public static String username = "";
    public static String password = "";
    private String searchSelectedItem = "Search by: ";
    private ArrayList<User>listOfUsers = new ArrayList<>();
    private ArrayList<Book> listOfBooks = new ArrayList<>();
    
    public StudentGUI() {
       
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        addRowToTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        studentGUI = new javax.swing.JTabbedPane();
        bookReserver = new javax.swing.JPanel();
        studentLibraryPageLabel = new javax.swing.JLabel();
        reserveButton = new javax.swing.JButton();
        adviceLabel = new javax.swing.JLabel();
        reserveLogoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookFinderTable = new javax.swing.JTable();
        reserveRespondLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        search = new javax.swing.JPanel();
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
        searchLogoutButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 584));
        setResizable(false);

        studentLibraryPageLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        studentLibraryPageLabel.setText("Book Reserver");

        reserveButton.setText("Reserve");
        reserveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reserveButtonMouseClicked(evt);
            }
        });
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        adviceLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        adviceLabel.setText("Select and Reserve!");

        reserveLogoutButton.setText("Logout");
        reserveLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reserveLogoutButtonMouseClicked(evt);
            }
        });
        reserveLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveLogoutButtonActionPerformed(evt);
            }
        });

        bookFinderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Location", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookFinderTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(bookFinderTable);
        if (bookFinderTable.getColumnModel().getColumnCount() > 0) {
            bookFinderTable.getColumnModel().getColumn(0).setResizable(false);
            bookFinderTable.getColumnModel().getColumn(1).setResizable(false);
            bookFinderTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            bookFinderTable.getColumnModel().getColumn(2).setResizable(false);
            bookFinderTable.getColumnModel().getColumn(3).setResizable(false);
            bookFinderTable.getColumnModel().getColumn(4).setResizable(false);
        }

        reserveRespondLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reserveRespondLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        sortComboBox.setMaximumRowCount(4);
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By", "ISBN", "Title", "Author", "Location", "Availability" }));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookReserverLayout = new javax.swing.GroupLayout(bookReserver);
        bookReserver.setLayout(bookReserverLayout);
        bookReserverLayout.setHorizontalGroup(
            bookReserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookReserverLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(studentLibraryPageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reserveLogoutButton))
            .addGroup(bookReserverLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bookReserverLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(adviceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bookReserverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reserveRespondLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookReserverLayout.setVerticalGroup(
            bookReserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookReserverLayout.createSequentialGroup()
                .addGroup(bookReserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reserveLogoutButton)
                    .addGroup(bookReserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentLibraryPageLabel)
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(reserveRespondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookReserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adviceLabel))
                .addGap(0, 0, 0))
        );

        studentGUI.addTab("Reserve", bookReserver);

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

        searchLogoutButton.setText("Logout");
        searchLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLogoutButtonMouseClicked(evt);
            }
        });
        searchLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchTitleLabel)
                    .addComponent(searchISBNLabel)
                    .addComponent(searchAuthorLabel))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(searchTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(searchISBNLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchAuthorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchLocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchAvailabilityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchLocationLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(searchAvailabilityLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(searchButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchLogoutButton))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addGap(4, 4, 4)
                .addComponent(searchResponseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(searchAvailabilityLabel1))
                .addGap(18, 18, 18)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAuthorLabel)
                    .addComponent(searchAuthorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        searchLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchAuthorLabel1, searchAvailabilityLabel1, searchISBNLabel1, searchLocationLabel, searchLocationLabel1, searchTitleLabel1});

        studentGUI.addTab("Search", search);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentGUI, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(studentGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String comboBoxString = (String)cb.getSelectedItem();
        searchSelectedItem = comboBoxString;
    }//GEN-LAST:event_filterComboBoxActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void reserveLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveLogoutButtonActionPerformed
    }//GEN-LAST:event_reserveLogoutButtonActionPerformed

    private void reserveLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();
    }//GEN-LAST:event_reserveLogoutButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        boolean controlFinder = false;
        if(searchSelectedItem.replaceAll(" ","").equals("")){
            searchResponseLabel.setText("Please enter input");
        }
        
        else if(searchSelectedItem.equals("Search by:")){
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
    
    
    private void reserveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveButtonMouseClicked
        int[] selected = bookFinderTable.getSelectedRows();   
        reserveRespondLabel.setText("");
        for(int i = 0; i<selected.length;i++){
            if(listOfBooks.get(selected[i]).availabilityChecker() == true){
                for(User user:listOfUsers){
                    if(user.getUsername().equals(this.username) && user.getPassword().equals(this.password)){
                        listOfBooks.get(selected[i]).reserveBook(user);
                        reserveRespondLabel.setText("* You have reserved the book "+listOfBooks.get(selected[i]).getTitle());
                    }
                }
            }else{
             reserveRespondLabel.setText("* Sorry the book "+listOfBooks.get(selected[i]).getTitle()+" is unavailabe");
            }
            
            try {
                setData();
            } catch (IOException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            addRowToTable();
        }
    }//GEN-LAST:event_reserveButtonMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLogoutButtonMouseClicked
        LoginGUI.start();
        this.dispose();
    }//GEN-LAST:event_searchLogoutButtonMouseClicked

    private void searchLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLogoutButtonActionPerformed
    }//GEN-LAST:event_searchLogoutButtonActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
   int compareInt = 0;
        JComboBox cb = (JComboBox)evt.getSource();
        String comboBoxString = (String)cb.getSelectedItem();
        if(comboBoxString.equals("Sort By")){
            reserveRespondLabel.setText("Please Choose a Method of Sort");
        }
        else{
            reserveRespondLabel.setText("");
            for(int i = 0; i < listOfBooks.size()-1;i++){
                for(int j=0; j < listOfBooks.size()-1-i; j++){
                    
                    switch(comboBoxString){
                        case "ISBN":
                            listOfBooks.get(j).setCompareBook("ISBN");                            
                            break;
                            
                        case "Title":
                            listOfBooks.get(j).setCompareBook("Title");                            
                            break;
                        
                        case "Author":
                            listOfBooks.get(j).setCompareBook("Author");                            
                            break;
                       
                        case "Location":
                            listOfBooks.get(j).setCompareBook("Location");                           
                            break;
                        
                        case "Availability":
                            listOfBooks.get(j).setCompareBook("Availability");                            
                            break;
                    }
                    compareInt = listOfBooks.get(j).compareTo(listOfBooks.get(j+1));

                    if(compareInt > 0){
                                Collections.swap(listOfBooks, j,(j+1));

                    }
                }
            }
            addRowToTable();
        }
    }//GEN-LAST:event_sortComboBoxActionPerformed

    public void getData() throws IOException, Exception {
        listOfUsers.clear();
        listOfBooks.clear();

        listOfUsers = new ArrayList<> (Library.getUsers());
        listOfBooks = new ArrayList<> (Library.getBooks()); 
    }
    
    public void setData() throws IOException{
         Library.updateBooks(listOfBooks);
        try {
            getData();
        } catch (Exception ex) {
            Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
  public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel)bookFinderTable.getModel();
        Object rowData[] = new Object[5];
        if (bookFinderTable.getRowCount() > 0) {
            for(int i = bookFinderTable.getRowCount()- 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        for(int i = 0;i<listOfBooks.size(); i++){
            rowData[0]=listOfBooks.get(i).getISBN();
            rowData[1]=listOfBooks.get(i).getTitle();
            rowData[2]=listOfBooks.get(i).getAuthor();
            rowData[3]=listOfBooks.get(i).getLocation();
            rowData[4]=listOfBooks.get(i).getAvailability();
            model.addRow(rowData);
        }
    }
    public void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceLabel;
    private javax.swing.JTable bookFinderTable;
    private javax.swing.JPanel bookReserver;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reserveButton;
    private javax.swing.JButton reserveLogoutButton;
    private javax.swing.JLabel reserveRespondLabel;
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
    private javax.swing.JTabbedPane studentGUI;
    private javax.swing.JLabel studentLibraryPageLabel;
    // End of variables declaration//GEN-END:variables
}
