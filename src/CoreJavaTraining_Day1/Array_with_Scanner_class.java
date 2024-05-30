
package CoreJavaTraining_Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_Scanner_class {

	public static void main(String[] args) {

// Create a scanner class and scanner object to accept input of array values  at runtime from a user
		
		
		 Scanner scObj = new Scanner(System.in);  //create an object of the scanner class which will accept input from user
		
		int score1[] = new int[4];  //create a array which will accept 4 values
		
		 for(int i= 0; i< score1.length; i++) {
			 System.out.println(" Enter the array value for index "+ i); 
			 score1[i] = scObj.nextInt(); //using the object to take input from user and place the input inside our array
		 }
		
		 
         int score2[] = new int[4];  //create a array which will accept 4 values
		 
		 for(int i= 0; i< score2.length; i++) {
			 System.out.println(" Enter the array value for index "+ i); 
			 score2[i] = scObj.nextInt(); //using the object to take input from user
		 }
		 
		 
		 // How to check if two arrays are equal we use arrays .equals
		 
		 System.out.println(Arrays.toString(score1)); //will prints array one
		 System.out.println(Arrays.toString(score2)); ////will prints array two
		
		if(Arrays.equals(score1, score2)==true){  //compares the two arrays to see if the content of both arrays are the same or NOT 
		System.out.println("The content in Score1 is exactly the same as score2 content");
		
		}
	
	else {
		System.out.println("The content of both arrays are NOT the same");
	
	    }

	}

}
