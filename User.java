import java.util.*;
import java.io.*;


public class User{
	protected String username;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String libraryID;
	protected String userType;
	
	public User(String userType, String username, String password,String firstName, String lastName, String libraryID){
		this.userType = userType;
		this.username=username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.libraryID = libraryID;
	}
	
	public String printDetails(){
		return username+" "+password+" "+firstName+" "+lastName+" "+libraryID+" "+userType;
	}
	
	public String getUserType(){
		return userType;
	}
	
	public void setUserType(String userType){
		this.userType = userType;
	}
	
	public void setUsername(String username){
		this.username=username;
		
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	
	
	public String getLibraryID(){
		return libraryID;
	}
	
	public void setLibraryID(String libraryID){
		this.libraryID=libraryID;
	}
	
	public void getFile(){

	}
	
	public void searchBook(String iSBN){
	}
	
	public void locationOfBook(String iSBN){
	}
	
	public void reserveBook(String iSBN){
	
	}
	
	public void createBookRecord() throws IOException{	
	}
	
	public void editBookRecord() throws IOException{
	}
	
	public void deleteBookRecord() throws IOException{
	}
	
	public void viewBookRecord(){
	}
		
	public static void addBooks(Book book){
	}
	
	public void createLibrarianAccount() throws IOException{
		
	}
	
	public void editLibrarianAccount() throws IOException{
		
	}
	
	public void viewLibrarianAccount() {
		
	}
	
	public void searchLibrarianAccount() {
		
	}
	
	public void deleteLibrarianAccount() throws IOException{
		
	}
	
	
	public void createStudentAccount() throws IOException{
		
		
	}
	
	public void editStudentAccount() throws IOException{
		
	}
	
	public void viewStudentAccount() {
		
	}
	
	public void searchStudentAccount(){
		
	}
	
	public void deleteStudentAccount() throws IOException{
		
	}
}