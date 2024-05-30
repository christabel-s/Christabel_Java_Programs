package CoreJavaTraining_Day1;

import java.util.Arrays;

public class String_Anagram_Assign {

	public static void main(String[] args) {
		// Anagram checks if set of charater present in one word is present in the second word 
		// Check if these two words are Anagram of each other or Not Anagram
		
		String firstWord = "bread";
		String seconWord = "beard";
		
		if(firstWord.length() != seconWord.length()) {
			System.out.println(firstWord + " and " + seconWord + " are Not Anagram");
			
		}
		else {
		
		// Converting the string words into Array of character and place them inside the char arrayWord1 to enable us to perform sorting later
		char arrayWord1[] = firstWord.toCharArray(); 
		char arrayWord2[] = seconWord.toCharArray();
		
		//converting Char arrayWord1 and arrayWord2 to be printed as string of characters like this [w, a, s] and [s, a, w]
		System.out.println("Befor sorting " + firstWord + " and " + seconWord );
		System.out.println(Arrays.toString(arrayWord1));
		System.out.println(Arrays.toString(arrayWord2));
		
		
		
		Arrays.sort(arrayWord1);     //Sortting  the Arraying now to alphabetical order
		Arrays.sort(arrayWord2);
		
		//array arrayWord1 and arrayWord2 after sorting array will be eg [a, s, w] and [a, s, w]
		System.out.println("After sorting " + firstWord + " and " + seconWord );
		System.out.println(Arrays.toString(arrayWord1));
		System.out.println(Arrays.toString(arrayWord2));
		
		//Checking if the two words inside the character array Anagram or not be comparing the two arrays if contents are exactly the same 
		
		if(Arrays.equals(arrayWord1, arrayWord2)){
			System.out.println(firstWord + " and " + seconWord + " are Anagram");
		}
		else
			System.out.println(firstWord + " and " + seconWord + " are Not Anagram");
		}
	}

}
