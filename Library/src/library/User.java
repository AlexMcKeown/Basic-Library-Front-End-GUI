package library;

public class User implements Comparable <User>{
	protected String username;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String userType;
        protected String setCompareUser = "";
	
        public User(){
            this.userType = "";
            this.username="";
            this.password = "";
            this.firstName = "";
	    this.lastName = "";
        }
        
	public User(String userType, String username, String password,String firstName, String lastName){
            this.userType = userType;
            this.username=username;
	    this.password = password;
	    this.firstName = firstName;
	    this.lastName = lastName;
	}
	
	public String printDetails(){
            return userType+"\n"+username+"\n"+password+"\n"+firstName+"\n"+lastName;
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
        
        public void setCompareUser(String setCompareUser){
            this.setCompareUser = setCompareUser;
        }
        
        public int compareTo(User otherUser){
            switch(setCompareUser){
                case "UserType":
                    if (this.userType == null && otherUser.getUserType() == null){
                         return 0;
                     }else{
                         int compareInt = this.userType.compareTo(otherUser.getUserType());
                         if(compareInt < 0){
                             return-1;
                         }
                         else if(compareInt>0){
                             return 1;
                         }
                     }
                    break;
                    
                case "Username":
                    if (this.username == null && otherUser.getUsername() == null){
                         return 0;
                     }else{
                         int compareInt = this.username.compareTo(otherUser.getUsername());
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
        
        public String getDegree(){
            return null;
        }
        
        public String getCourse(){
            return null;
        }
        
        public void setDegree(String degree){
        }
        
        public void setCourse(String course){
        }
}