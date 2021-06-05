
package library;

public class Librarian extends User{
	
	public Librarian(String userType, String username, String password,String firstName, String lastName){
		super(userType, username, password, firstName, lastName);
	}
   
           public int compareTo(Librarian otherUser){
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
}