import java.util.*;
import java.io.*;


public class Student extends User{
	public Student(String userType, String userName, String password,String firstName, String lastName, String libraryID){
		super(userType, userName, password, firstName, lastName, libraryID);
	}
	
	public void searchBook(String iSBN){
		HashMap<String,String> locationFinder = new HashMap<String,String>();
		File file = new File("USERS.txt");
		String iSBNtxt = " ";
		String location = " ";
		try {
			Scanner input = new Scanner(file);
		    input.nextLine();
            while(input.hasNextLine()){
				iSBNtxt = input.nextLine();
				input.nextLine();
			    input.nextLine();
			    location = input.nextLine();
				
				if(input.hasNextLine()){
					input.nextLine();
				}
				locationFinder.put(iSBNtxt,location);
			}
			input.close();
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		if(locationFinder.get(iSBNtxt) != null){
			System.out.println(locationFinder.get(iSBNtxt));
		}
	}
	
	/*public void reserveBook(String iSBN){
		for(Book aBook:allBooks){
			if(aBook.getISBN().equals(iSBN)){
				if(aBook.availabilityChecker == true){
					System.out.println("You have reserved the book!");
				}else{
					System.out.println("Sorry! The book is already reserved");
				}
			}
		}
	}*/
}