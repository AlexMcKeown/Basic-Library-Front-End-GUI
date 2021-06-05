package library;

public class Book implements Comparable <Book>{
	private String iSBN;
	private String title;
	private String author;
	private boolean availability;
	private String location;
        private User currentUser;
        private String compareBook = "";
	
	public Book(String iSBN, String title, String author, String location,String available, User currentUser){
		this.iSBN=iSBN;
		this.title=title;
		this.author=author;
                this.location=location;
                setAvailability(available);
                this.currentUser=currentUser;
	}
	
        public void setCurrentUser(User currentUser){
            this.currentUser=currentUser;
        }
        
        public User getCurrentUser(){
            return currentUser;
        }
        
        public int compareToCurrentUser(User otherUser){
            return currentUser.compareTo(otherUser);
        }
        
        public void setCompareUser(String compare){
           currentUser.setCompareUser(compare);
       }
        
        public String getUsername(){
             if(currentUser==null){
             return "null";
             }else{
               return currentUser.getUsername();  
             }
        }
         
        public String getUserType(){
             return currentUser.getUserType();
         }
        
	public void reserveBook(User account){
		if(availability!=false){
			availability = false;
			//You have reserved the book 
                        this.currentUser = account;
		} else{
			//Someone has already reserved the book
		}
	}
	
	public String printDetails(){
		return iSBN+"\n"+title+"\n"+author+"\n"+location+"\n"+getAvailability()+"\n"+getUsername();
		
	}
	
        public boolean availabilityChecker(){
            return availability;
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
        
        public void setCompareBook(String compareBook){
            this.compareBook = compareBook;
        }
        
        public int compareTo(Book otherBook){
            switch(compareBook){
                case "ISBN":
                    if (this.iSBN == null && otherBook.getISBN() == null){
                         return 0;
                     }else{
                         int compareInt = this.iSBN.compareTo(otherBook.getISBN());
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                    break;
                    
                case "Title":
                    if (this.title == null && otherBook.getTitle() == null){
                         return 0;
                     }else{
                         int compareInt = this.title.compareTo(otherBook.getTitle());
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                     break; 
                     
                case "Author":
                    if (this.author == null && otherBook.getAuthor() == null){
                         return 0;
                     }else{
                         int compareInt = this.author.compareTo(otherBook.getAuthor());
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                    break;
                    
                case "Availability":
                    if (this.getAvailability() == null && otherBook.getAvailability() == null){
                         return 0;
                     }else{
                         int compareInt = this.getAvailability().compareTo(otherBook.getAvailability());
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                    break;
                    
                case "Location":
                     if (this.location == null && otherBook.location == null){
                         return 0;
                     }else{
                         int compareInt = this.location.compareTo(otherBook.location);
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                    break;
                    
            }
            return 0;
        }
}
