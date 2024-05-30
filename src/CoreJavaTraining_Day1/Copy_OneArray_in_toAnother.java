package CoreJavaTraining_Day1;

import java.util.Arrays;

public class Copy_OneArray_in_toAnother {

	
	// How to copy Array SecondName into the firstName 
	public static void main(String[] args) {

	String firstName[]  = new String[6];
	String secoName[]  = new String[6];
	
	firstName[0] ="Christabel";
	firstName[1] ="Angel";
	firstName[2] ="Junior";
	firstName[3] ="Kamsi";
	firstName[4] ="Miracle";
	firstName[5] ="Praise";
			
		for(int i=0; i<firstName.length; i++) {	
			//copies the firstName Array into the empty  Array SecondName
			 secoName[i] = firstName[i];	
		}
		
		
		System.out.println(Arrays.toString(firstName)); //Converting the array into string and print it out
		System.out.println(Arrays.toString(secoName));  
	
		
	}

}
