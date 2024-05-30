package CoreJavaTraining_Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling2 {

	public static void main(String[] args) {
		
	Scanner userInput = new Scanner(System.in);
	
	 try{
		int age = userInput.nextInt();
		System.out.println(age);
	
	   }
	
		catch(InputMismatchException excep1 ) {
			
			System.out.println("Exception has occured, user provided wrong info");
		}
		 
		 catch(NullPointerException excep2) {
				
				System.out.println("Exception has occured, user has entered no value");
		 }
		
		 
		 catch(IndexOutOfBoundsException excep3) {
				
				System.out.println("Exception has occured, user provided wrong info");
		 }
	// Use the finally block to give a final message to the customer inrespective weather there was an exeption or not
        finally {
        	System.out.println("Thank you for visiting our website");
        	
        }
        
	}

}
