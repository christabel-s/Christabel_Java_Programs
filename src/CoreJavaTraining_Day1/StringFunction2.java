package CoreJavaTraining_Day1;

public class StringFunction2 {

	public static void main(String[] args) {
		
		String fullName = " Christabel Chioma Samuel";
		String name = "Christabel";
		
		System.out.println(fullName.contains("Chioma"));
		System.out.println(fullName.contains("samuel"));
		
		 String page_Title = " Learn and grow your caree";
		 System.out.println(page_Title.trim());  // trim method will remove any space found from at the begging of your string or at the end of your string
		 StringFunction2 strObj = new StringFunction2();
		 
	  for(int i=0; i<name.length(); i++) { //Loops through the length of the character christabel
		char na = name.charAt(i);  // stores it 
		System.out.println(na);  // prints all the characters on the same straight line that mean vertically
		//System.out.print(na); // If you remove the ln from the println it will actually prints all the characters on the same straight line that mean Horizontal 
		
		
	  }
	  System.out.println(" ======================");
		
	  // How to print the string christabel in a revers order
	  
	  for(int i=name.length()-1; i>=0; i--) { //Loops through the length of the character christabel
			char na = name.charAt(i);  // i  is holding each character in the variable called name , as it loops through it , Takes character i is holding each time stores it on na
			System.out.println(na); // then prints the character out 
			//System.out.print(na);
			
			
		  }
	}
}
