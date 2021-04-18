import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Library{
	private static ArrayList<User> listOfUsers =  new ArrayList<>();
	public static void main(String []args) throws IOException {
		
	}
	
	public void getUsers(){
	    File file = new File("USERS.txt");
		String type = " ";
		String userName = " ";
		String password = " ";
		String fName = " ";
		String lName = " ";
		String libraryID = " ";
	       try {
	           Scanner input = new Scanner(file);
			   input.nextLine();
	           while(input.hasNextLine()) {
				   type = input.next();
				   userName = input.next();
				   password = input.next();
				   fName = input.next();
				   lName = input.next();
				   libraryID = input.next();
				   
										
					switch(type){
						case "STUDENT":
	 	                listOfUsers.add(new Student(userName, password,fName,lName,libraryID, "Student"));
						break;
						
						case "LIBRARIAN":
						listOfUsers.add(new Librarian(userName, password,fName,lName,libraryID, "Librarian"));
						break;
						
						case "ADMIN":
						listOfUsers.add(new Admin(userName, password,fName,lName,libraryID, "Admin"));
						break;
						
					}
	           }
	           input.close();
	       } 
	       catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	}
}