package CoreJavaTraining_Day1;
//Ecapsulation is making sensitive information private variable or method 
//and use the help of the setter method to set the the sensitive info to a different info and use the getter method to get the hidden inof
class Amazon_login{
	
		private String userEmail = "dessamys@gmail.com";
	
	
		public String getUserEmail(){
			return userEmail;
			
		}
		
		public void setUserEmail(String userEmail){
			this.userEmail = userEmail;
			
		}

}

public class Encapsulation_Amazon_Login {

	public static void main(String[] args) {
		Amazon_login AmazonObj = new Amazon_login();
		AmazonObj.setUserEmail("EncapsulatedUserEmail");
		System.out.println(AmazonObj.getUserEmail());
		
		
	}

}
