public class Book{
	private String iSBN;
	private String title;
	private String author;
	private boolean availability;
	private String location;
	
	public Book(String iSBN, String title, String author, String location, String available){
		this.iSBN=iSBN;
		this.title=title;
		this.author=author;
		this.location=location;
		setAvailability(available);
	}
	
	public void reserveBook(){
		if(availability!=false){
			availability = false;
			System.out.println("You have reserved the book "+title);
		} else{
			System.out.println("Someone has already reserved the book");
		}
	}
	
	public String printDetails(){
		return iSBN+"\n"+title+"\n"+author+"\n"+getAvailability()+"\n"+location;
		
	}
	
	public void print(){
		String alignFormat = "%-5s %-14s || %-7s %-28s || %-5s %-13s || %-7s %-15s || %-7s %-15s %n";
		System.out.printf(alignFormat, "ISBN: ",iSBN ,"Title: ", title,"Author: ", author, "Location: ", location, "Availability: ",getAvailability());
	}
	
	public String getAvailability(){
		if(availability==true){
			
			return "Available";
		}else{
			return "Unavailable";
		}
	}
	
	public String getISBN(){
		return iSBN;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	
	public boolean availabilityChecker(){
		return availability;
	}
	
	public String getLocation(){
		return location;
	}
	
	
	public void setISBN(String iSBN){
		this.iSBN = iSBN;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public void setAvailability(String availability){
		 if(availability.equals("Available")){
			 this.availability = true;
		 }else{
			 this.availability = false;
		 }
	}
	
	public void setLocation(String location){
		this.location=location;
	}
}