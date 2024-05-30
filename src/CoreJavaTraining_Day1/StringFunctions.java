package CoreJavaTraining_Day1;

import java.util.Arrays;

public class StringFunctions {
  static int countChar = 0;  //global variable declaration
  static int CountNumeric = 0;
  static int Count_Of_Space = 0;
	
  public static void main(String[] args) {
		
		/*String FirstName = "Christabel";
		System.out.println(FirstName.length());
		
		int NameLenght = FirstName.length();  // this will give us the length of the name christabel 10
		System.out.println(NameLenght);
		
		char charIndex = FirstName.charAt(3); //the index will start counting from zero. This will print the charater on the index 3 which is  i.
		System.out.println(charIndex);
		
		System.out.println(FirstName.indexOf("b"));   //This will give is the indext of the character b which is 7
		System.out.println(FirstName.toUpperCase());  // This will convert all the charaters in the name christabel to Uppercase letters. 
		System.out.println(FirstName.toLowerCase());  // This will convert all the charaters in the name christabel to Uppercase letters.
		System.out.println(FirstName.concat(" is my first name")); //This will join/concatinate the name christabel to the string. Christabel is my first name
		
		String firstName  = " Christabel";
		String secondName = " Samuel";
		System.out.println(firstName.concat( " ").concat(secondName));  //Joins second string/variable to the first string/variable' Christabel Samuel.
		System.out.println(firstName.contains("bel"));
		System.out.println(firstName.contains("Bel"));
  
		
		
		String name = "Christabel";
		char  myArray[] = name.toCharArray();  //converting our string Christabel which is in our variable name to character in an array
		System.out.println(Arrays.toString(myArray));  // convert the array to string again and print it 
		
		
		
		// To find out how many Alphabet are in the string "Christabel" 
		// Use Character class
		for(int i=0; i< myArray.length; i++) 
		{
		boolean alphabet = Character.isAlphabetic(myArray[i]); // Is the character on index 2 on my array an Alphabet true or false
		System.out.println(alphabet);
		
		if (alphabet ==true) {
			
			countChar++; //whenever alphabet is true counter will increse from zero to 1 then from zero to 2 etc
		}
		
	}
		System.out.println(" The number of character is the string is " + countChar);	// here we print the final number counter is holding
		
	
		
		
	  
	  
	  
	  
	  // count of numeric in the string
		
		String fullname = ("Christabel4896654321");
		char  myArray[] = fullname.toCharArray();  //converting our string Christabel which is in our variable name to character in an array
		System.out.println(Arrays.toString(myArray));  // convert the array to string again and print it 
		
		
		
		// To find out how many Alphabet are in the string "Christabel" 
		// Use numeric charater  .
		for(int i=0; i< myArray.length; i++) 
		{
		boolean alphabet = Character.isDigit(myArray[i]); // Is the character on index 2 on my array an Alphabet true or false
		//System.out.println(alphabet);
		
		if (alphabet ==true) {
			
			CountNumeric++; //whenever alphabet is true counter will increse from zero to 1 then from zero to 2 etc
		}
		
	}
		System.out.println(" The number of Numeric character in the  Array is " + CountNumeric);	// here we print the final number counter is holding
		
		
		 */	
		
		
		
		
		
		
		
		 
		  // count of numeric in the string
			
			String fullname = ("Christabel Chioma Samuel");
			char  myArray[] = fullname.toCharArray();  //converting our string Christabel which is in our variable name to character in an array
			System.out.println(Arrays.toString(myArray));  // convert the array to string again and print it 
			
			
			
			// To find out how many Alphabet are in the string "Christabel" 
			// Use numeric charater  .
			for(int i=0; i< myArray.length; i++) 
			{
			boolean alphabet = Character.isSpaceChar((myArray[i])); // Is the character on index 2 on my array an Alphabet true or false
			//System.out.println(alphabet);
			
			if (alphabet ==true) {
				
				 Count_Of_Space++; //whenever alphabet is true counter will increse from zero to 1 then from zero to 2 etc
			}
			
		}
			System.out.println(" The number of spaces in the  Array is " + Count_Of_Space);	// here we print the final number counter is holding
			
			
			
			// Find out if te given input is a Palindrome or not.
			// Palindrome is a word that when read from the front or from the back will still mean the same thing eg mum, dad
}

}
