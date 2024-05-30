package CoreJavaTraining_Day1;

public class Plindrome_program {
		
		public static void main(String[] args) {
		
		//How to  Reverse a string and checks if a string is Palidrome or not
		
		String myInput = "MuM";
		String myRevers_Input = "";
		
		for(int i=myInput.length()-1; i>=0; i--) {
			
			char myCharacter = myInput.charAt(i);
			myRevers_Input=myRevers_Input + myCharacter;
			
			}
		System.out.println(myRevers_Input);
		
		if(myInput.equals(myRevers_Input)) {  //Palimdrome is a string when read from the back or from the from will still be the same word and pronounce in same way
			
			System.out.print("This string is a Palidrome");  
			
		}
		
		else {
			
			System.out.print("This string is Not Palidrome");
		
		}
	     
		
		
   }



}
