package CoreJavaTraining_Day1;


class Encapsulate_Age {
		  private int age = 45;
		  private String userEmail = "dessamys@gmail.com";
		  private String password = "Nmesomason";
			 
			public String getUserEmail() {
				return userEmail;
			}
	
			public void setUserEmail(String userEmail) {
				this.userEmail = userEmail;
			}
	
			public String getPassword() {
				return password;
			}
	
			public void setPassword(String password) {
				this.password = password;
			}
	
			  
			public int getAge() {
				return age;
			}
			
			public void setAge(int age) {
				this.age = age;
			}
	  
	  
	  
			
}


public class Encapsulation_2 {
        
		public static void main(String[] args) {
			Encapsulate_Age objdetails = new Encapsulate_Age();
			objdetails.setAge(95);
			objdetails.setUserEmail(("email_Encapsutated"));
			objdetails.setPassword("password_Emcapsulated");
			
			System.out.println(objdetails.getAge());
			System.out.println(objdetails.getUserEmail());
			System.out.println(objdetails.getPassword());
	
		}

}
