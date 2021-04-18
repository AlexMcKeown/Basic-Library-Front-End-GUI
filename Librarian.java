import java.util.*;
import java.io.*;

public class Librarian extends User{
	private static ArrayList<Book> reservedBooks = new ArrayList<>();
	protected static ArrayList<Book> allBooks = new ArrayList<>();
	
	public Librarian(String userType, String username, String password,String firstName, String lastName, String libraryID){
		super(userType, username, password, firstName, lastName, libraryID);
	}
   
	public void getFile(){
		allBooks.clear();
	    File file = new File("Books.txt");
		String id = " ";
		String titleName = " ";
		String writer = " ";
		String position = " ";
		String availability = " ";
		
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()){
				id = input.nextLine();
				titleName = input.nextLine();
				writer = input.nextLine();
				position = input.nextLine();
				availability = input.nextLine();
				
				if(input.hasNextLine()){
					input.nextLine();
				}
				Book fileBook = new Book(id,titleName,writer,position,availability);
	            allBooks.add(fileBook);
			}
			input.close();
		} 
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		updateReservedBooks();
	}
   
	public void createBookRecord() throws IOException{ // user enters details
		Scanner input = new Scanner(System.in);
		String iSBN = " ";
		String title = " ";
		String author = " ";
		String location =" ";
		String availability=" ";
		
		iSBN = input.next();
		title = input.next();
		author = input.next();
		location = input.next();
		availability = input.next();
		
		BufferedWriter out = new BufferedWriter(new FileWriter("Books.txt"));
		out.write("");
		out.write(iSBN);
		out.write(title);
		out.write(author);
		out.write(location);
		out.write(availability);
		getFile();
	}
	
	public void editBookRecord() throws IOException{
		Scanner input = new Scanner(System.in);
		String iSBN = " ";
		String title = " ";
		String author = " ";
		String location =" ";
		String availability = " ";
		
		iSBN = input.next();
		if(allBooks.size()>0){
			for(Book searchForBook :allBooks){
				if(searchForBook.getISBN().equals(iSBN)){
					iSBN = input.next();
					title = input.next();
					author = input.next();
					location = input.next();
					availability = input.next();
		
					searchForBook.setISBN(iSBN);	
					searchForBook.setTitle(title);	
					searchForBook.setAuthor(author);	
					searchForBook.setLocation(location);	
					searchForBook.setAvailability(availability);
					
					File file = new File("Books.txt");
					PrintWriter printWriter = new PrintWriter(file); // clears
					printWriter.print("");
					printWriter.close();
					
					FileWriter fileWriter = new FileWriter(file);  
					for(Book updatingBook : allBooks){
						fileWriter.write(updatingBook.getISBN()+"\n"+updatingBook.getTitle()+"\n"+updatingBook.getAuthor()+"\n"+updatingBook.getLocation());
					}
					fileWriter.close();
				}
			}
		}
		getFile();
	}
	
	public void deleteBookRecord() throws IOException{
		Scanner input = new Scanner(System.in);
		String iSBN = " ";
		iSBN = input.next();
		
		if(allBooks.size()>0){
			for( Book searchForBook :allBooks){
				if(searchForBook.getISBN().equals(iSBN)){
					if(searchForBook.availabilityChecker() == false){
						reservedBooks.remove(searchForBook);
					}
					allBooks.remove(searchForBook);
				}
			}
		}
		
		File file = new File("Books.txt");
		PrintWriter printWriter = new PrintWriter(file); // clears
		printWriter.print("");
		printWriter.close();
		
		FileWriter fileWriter = new FileWriter(file);  
		for(Book updatingBooks : allBooks){
			fileWriter.write(updatingBooks.printDetails());
		}
		
		fileWriter.close();
		getFile();
	}
	
	public void viewBookRecord(){
		Scanner input = new Scanner(System.in);
		String iSBN = " ";
		iSBN = input.next();
		
		if(allBooks.size()>0){
			for(Book searchForBook : allBooks){
				if(searchForBook.getISBN().equals(iSBN)){
					searchForBook.print();
				}
			}
		}
	}
	
	public void updateReservedBooks(){
		reservedBooks.clear();
		for(Book addbook: allBooks){
			if(addbook.availabilityChecker() == false){
				reservedBooks.add(addbook);
			}
		}
	}
}