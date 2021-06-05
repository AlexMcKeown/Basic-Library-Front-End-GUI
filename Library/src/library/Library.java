package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Library {
    private static int counter = 0;
    private static ArrayList<User> listOfUsers = new ArrayList<>();
    private static ArrayList<String> listOfISBNs = new ArrayList<>();
    private static ArrayList<Book> reservedBooks = new ArrayList<>();
    private static ArrayList<Book> listOfBooks = new ArrayList<>();

    public static void main(String []args){
        try {
            setUsers();
        } catch (Exception ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        LoginGUI.start();
    }   
    
    public static ArrayList getBooks() throws Exception{
        setBooks();
        return listOfBooks;
    }
    
    public static ArrayList getISBNs() throws Exception{
        setBooks();
        return listOfISBNs;
    }
    
    public static ArrayList getReservedBooks() throws Exception{
        setBooks();
        return reservedBooks;
    } 
   
    public static void updateBooks(ArrayList updateAllBooks) throws IOException{
        listOfBooks.clear();
        listOfBooks = new ArrayList<>(updateAllBooks);
        FileWriter file = new FileWriter("Books.txt");
        PrintWriter outputStream = new PrintWriter(file);
        for(Book book:listOfBooks){
            outputStream.println(book.printDetails());
            outputStream.println("");
        }
        outputStream.close();
                    
        try{
            setBooks();
        }catch (Exception ex) {
            Logger.getLogger(LibrarianGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setBooks() throws IOException, Exception {
        listOfBooks.clear();
        listOfISBNs.clear();
        listOfISBNs.add("Select ISBN");
        reservedBooks.clear();
        listOfUsers.clear();
        setUsers();
        File file = new File("Books.txt");
        String[] book = new String[6];
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                for(int i = 0; i<book.length;i++){
                    book[i] = input.nextLine();
                }
                switch(book[5].replaceAll(" ","")){
                    case "null":
                        listOfBooks.add(new Book(book[0].replaceAll(" ",""),book[1],book[2],book[3],book[4], null));
                        
                        break;
                    
                    default:
                        for(User user:listOfUsers){
                            if(user.getUsername().equals(book[5].replaceAll(" ",""))){
                                listOfBooks.add(new Book(book[0].replaceAll(" ",""),book[1],book[2],book[3],book[4],user));
                            }
                        }
                      
                }
                 if(input.hasNextLine()){
                    input.nextLine();
                }
                    
            }
           
            input.close();
            
        }catch(FileNotFoundException e){
         e.printStackTrace();
        }
        
        for(Book book1:listOfBooks){
            listOfISBNs.add(book1.getISBN());
            if(book1.getCurrentUser()!= null){
                reservedBooks.add(book1);
            }
        }
        
    }
    //-------
    public static ArrayList getUsers() throws IOException, Exception {
        setUsers();
        return listOfUsers;              
    } 
  
    public static void updateUsers(ArrayList updateAllUsers) throws IOException{
        listOfUsers.clear();
        listOfUsers = new ArrayList<>(updateAllUsers);
        PrintWriter outputStream = new PrintWriter(new FileWriter("USERS.txt"));
        for(User user:listOfUsers){
            outputStream.println(user.printDetails());
            outputStream.println(" ");
          }         
        outputStream.close();
	
        try {
            setUsers();
        } catch (Exception ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void setUsers() throws IOException, Exception {
        listOfUsers.clear();
        File file = new File("USERS.txt");
        String[] acc = new String[5]; // short for account
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                for(int i = 0; i<acc.length;i++){
                    if(input.hasNextLine()){
                        acc[i] = input.nextLine();
                    }
                }
                
                switch(acc[0].replaceAll(" ","")){ //acc[0] is type of user from USERS.txt file
                    case "STUDENT":
                        String [] std = new String[2];
                        for(int i = 0; i<std.length;i++){
                            std[i] = input.nextLine();
                        }
                        
                        Student student = new Student(acc[0].replaceAll(" ",""),acc[1].replaceAll(" ",""),acc[2].replaceAll(" ",""),acc[3],acc[4],std[0],std[1]);
                        listOfUsers.add(student);
                        break;
                    
                    case "LIBRARIAN":
                        Librarian librarian = new Librarian(acc[0].replaceAll(" ",""),acc[1].replaceAll(" ",""),acc[2].replaceAll(" ",""),acc[3],acc[4]);
                        listOfUsers.add(librarian);
                        break;
                    
                    case "ADMIN":
                        Admin admin = new Admin(acc[0].replaceAll(" ",""),acc[1].replaceAll(" ",""),acc[2].replaceAll(" ",""),acc[3],acc[4]);
                        listOfUsers.add(admin);
                        break;
                } 
                 if(input.hasNextLine()){
                    input.nextLine();
                }
            }
            input.close();
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        for(int i = 0; i< acc.length; i++){
            acc[i]="";
        }       
    }
    
}
