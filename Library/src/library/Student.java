package library;

public class Student extends User{
    protected String degree;
    protected String course;
    
	public Student(String userType, String userName, String password,String firstName, String lastName, String degree, String course){
		super(userType, userName, password, firstName, lastName);
                this.degree=degree;
                this.course=course;
	}
        
        public String getDegree(){
            return this.degree;
        }
        
        public String getCourse(){
            return this.course;
        }
        
        public void setDegree(String degree){
            this.degree = degree;
        }
        
        public void setCourse(String course){
            this.course = course;
        }
        
	public String printDetails(){
		return super.printDetails()+"\n"+degree+"\n"+course;
	}

        public int compareTo(Student otherUser){
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