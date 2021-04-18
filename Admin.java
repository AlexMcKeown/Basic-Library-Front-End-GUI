import java.util.*;
import java.io.*;
public class Admin extends User{
	private ArrayList<User> listOfStudents = new ArrayList<>();
	private ArrayList<User> listOfLibrarians = new ArrayList<>();
	public Admin(String userType, String userName, String password,String firstName, String lastName, String libraryID, String userType){
		super(userType, userName, password, firstName, lastName, libraryID);
	}
	
	public void getUsers() throws IOException {
		listOfStudents.clear();
		listOfLibrarians.clear();
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
	           while (input.hasNextLine()) {
				   type = input.next();
				   userName = input.next();
				   password = input.next();
				   fName = input.next();
				   lName = input.next();
				   libraryID = input.next();
				   					
					switch(type){
						case "STUDENT":
						listOfStudents.add(new Student(userName, password,fName,lName,libraryID,type));
						
						break;
						
						case "LIBRARIAN":
						listOfLibrarians.add(new Librarian(userName, password,fName,lName,libraryID,type));
						break;
					}
	           }
	           input.close();
	       } 
	       catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	}
	
	public void createLibrarianAccount() throws IOException{
		Scanner input = new Scanner(System.in);
		String type = " ";
		String userName = " ";
		String password = " ";
		String fName = " ";
		String lName = " ";
		String libraryID = " ";
	   
	   type = input.next();
	   userName = input.next();
	   password = input.next();
	   fName = input.next();
	   lName = input.next();
	   libraryID = input.next();
	   
	   BufferedWriter out = new BufferedWriter(new FileWriter("USERS.txt"));
	   out.write(type+" "+userName+" "+password+" "+fName+" "+lName+" "+libraryID+"\n");
	   getFile();
	}
	
	public void editLibrarianAccount() throws IOException{
		Scanner input = new Scanner(System.in);
		String type = " ";
		String userName = " ";
		String password = " ";
		String fName = " ";
		String lName = " ";
		String libraryID = " ";
		
		userName = input.next();
		if(listOfLibrarians.size()>0){
			for(User searchForUser :listOfLibrarians){
				if(searchForUser.getUserName().equals(userName)){
					type = input.next();
					userName = input.next();
					password = input.next();
					fName = input.next();
					lName= input.next();
					libraryID = input.next();
		
					searchForUser.setUserType(type);	
					searchForUser.setUserName(userName);	
					searchForUser.setPassword(password);	
					searchForUser.setFirstName(fName);	
					searchForUser.setLastName(lName);
					searchForUser.setLibraryID(libraryID);
					
					
					File file = new File("Books.txt");
					PrintWriter printWriter = new PrintWriter(file); // clears
					printWriter.print("");
					printWriter.close();
					
					FileWriter fileWriter = new FileWriter(file);  
					for(User updatingUsers : listOfLibrarians){
						fileWriter.write(updatingUsers.printDetails());
					}
					for(User updatingUsers : listOfStudents){
						fileWriter.write(updatingUsers.printDetails());
					}
					fileWriter.close();
					getFile();
				}
				
			}
		}
	}
	
	public void viewLibrarianAccount(){
		Scanner input = new Scanner(System.in);
		String userName = " ";
		userName = input.next();
		if(listOfLibrarians.size()>0){
			for(User librarian:listOfLibrarians){
				if(librarian.getUserName().equals(userName)){
					librarian.printDetails();
				}
			}
		}
	}
	
	public void searchLibrarianAccount(){
		
	}
	
	public void deleteLibrarianAccount() throws IOException{
		Scanner input = new Scanner(System.in);
		String userName = " ";
		userName = input.next();
		
		if(listOfLibrarians.size()>0){
			for(User searchForUser: listOfLibrarians){
				if(searchForUser.getUserName().equals(userName)){
					listOfLibrarians.remove(searchForUser);
					File file = new File("USERS.txt");
					PrintWriter printWriter = new PrintWriter(file); // clears
					printWriter.print("");
					printWriter.close();
		
					FileWriter fileWriter = new FileWriter(file);  
					for(User updatingUsers : listOfLibrarians){
						fileWriter.write(updatingUsers.getUserType()+" "+updatingUsers.getUserName()+" "+updatingUsers.getPassword()+" "+updatingUsers.getFirstName()+" "+updatingUsers.getLastName()+" "+updatingUsers.getLibraryID()+"\n");
					}
					for(User updatingUsers : listOfStudents){
						fileWriter.write(updatingUsers.getUserType()+" "+updatingUsers.getUserName()+" "+updatingUsers.getPassword()+" "+updatingUsers.getFirstName()+" "+updatingUsers.getLastName()+" "+updatingUsers.getLibraryID()+"\n");
					}
					fileWriter.close();
					getFile();
				}
			}
		}
	}
	
	
	public void createStudentAccount() throws IOException{
		
		
	}
	
	public void editStudentAccount() throws IOException{
		
	}
	
	public void viewStudentAccount(){
		Scanner input = new Scanner(System.in);
		String userName = " ";
		userName = input.next();
		if(listOfStudents.size()>0){
			for(User student:listOfStudents){
				if(student.getUserName().equals(userName)){
					student.printDetails();
				}
			}
		}
		

	}
	
	public void searchStudentAccount(){ // difference from view
		
	}
	
	public void deleteStudentAccount() throws IOException{
		Scanner input = new Scanner(System.in);
		String userName = " ";
		userName = input.next();
		
		if(listOfStudents.size()>0){
			for(User searchForUser: listOfStudents){
				if(searchForUser.getUserName().equals(userName)){
					listOfLibrarians.remove(searchForUser);
					File file = new File("USERS.txt");
					PrintWriter printWriter = new PrintWriter(file); // clears
					printWriter.print("");
					printWriter.close();
		
					FileWriter fileWriter = new FileWriter(file);  
					for(User updatingUsers : listOfLibrarians){
						fileWriter.write(updatingUsers.printDetails());
					}
					for(User updatingUsers : listOfStudents){
						fileWriter.write(updatingUsers.printDetails());
					}
					fileWriter.close();
					getFile();	
				}
			}
		}
		
	}
	
	
	
}