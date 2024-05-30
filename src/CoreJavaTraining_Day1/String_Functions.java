package CoreJavaTraining_Day1;

import java.util.Date;

public class String_Functions {

	public static void main(String[] args) {

		String name = "Christabel";
		String lastName = "Samuel";
		String sonName = "Kamsiriochukwuson2";
		
		String emptystring = "";   // space is not counted as empty in java
		
		/*System.out.println(name.length());// gives us the Number of character in the string christabel
		
		System.out.println(name.charAt(0)); // gives us the character at index 0
		System.out.println(name.charAt(3)); // gives us the character at index 3
		
		System.out.println(name.indexOf("t")); // gives us the index position of letter t
		System.out.println(name.toUpperCase()); // Will convert Christabel to uppercase
		System.out.println(name.toLowerCase()); // Will convert Christabel to lowerCase
		System.out.println(name.concat( " Samuel is my full name")); // will concatinate name variable with the string "Samuel is my full name"
		System.out.println(name.concat(lastName));
		System.out.println(name.concat(" ").concat(lastName));// what ever you are concatenating should be inside a (). Concatinate with a space
		System.out.println(name.contains("stabel"));
		System.out.println(name.contains("Stabel")); // It is fales here becase the S given is capital S. Java is case sensitive
		System.out.println(sonName.trim());// trim function only removes any space at the start of your string and at the end of your string.
		
		
		System.out.println(emptystring.isEmpty()); // This will check if the emptystring is holding empty string or not 
		System.out.println(name.substring(3));  //Substring will print out the string fron index 3 of christabel which will be istabel.
		System.out.println(name.substring(0, 5)); // will print out the string fron index 0  to index 5 of christabel which will be Chris  NOTE space is counted as index
		System.out.println(name.substring(1, 4)); // important note index will always take less one number that is -1 because zero was counted as first vavlue
		
		*/
		
		
		Date obj_CuerrentTime = new Date();
		System.out.println(obj_CuerrentTime); // This will give us the current date and time of my time zone
		

		Date obj_FutureTime = new Date(obj_CuerrentTime.getTime()+60*60*1000*24*10); 
		//System.out.println(obj_FutureTime); // Will print the future date
		 
		//System.out.println(obj_FutureTime); // This will give us the current date and time of my time zone
        String stringDataTime = obj_FutureTime.toString(); // Converts this date and time into a string so that we will be able to use String function methods to manipulate this date and time
		 //System.out.println(obj_FutureTime); 
		 
		 //Sat May 11 15:20:20 BST 2024.   to count the characters the courser should be at the front of each character to be counted , and we do not count the spaces
		 //Convert your date and time to these formats
		 //15 April 2024
		 //15-April-2024
		 //15/April/2024
		 //15/04/2024
		 
		 
		 String month = stringDataTime.substring(4, 7);
		 System.out.println(month);
		 
		 String day = stringDataTime.substring(8, 10);
		 System.out.println(day);
		 
		 String year = stringDataTime.substring(24, 28);
		 System.out.println(year);
		 
		 System.out.println(stringDataTime.length());
         
         
         System.out.println( day + " " +  month +" " + year);  //11 May 2024
         System.out.println( day.concat(" ").concat(month).concat( " ").concat(year));  //11 May 2024
         System.out.println("===================");
         System.out.println( day + "-" +  month +"-" + year);  //11-May-2024
         System.out.println( day.concat("-").concat(month).concat( "-").concat(year));  //11 May 2024
         
         System.out.println("===================");
         System.out.println( day.concat("_").concat(month).concat( "_").concat(year));  //11 May 2024
         System.out.println("===================");
         System.out.println( day + "/" + month +"/" + year);  //11/May/2024
         System.out.println( day.concat("/").concat(month).concat( "/").concat(year));  //11 May 2024
          
         
		
		// Getting future date and time 24hour
		// Will create an object for a future date and Will include  24 hours/1 day  to the current date and time 
		//Date obj_FutureTime = new Date(obj_CuerrentTime.getTime()-60*60*1000*24*5); Today is 12/05/2024, this will give you 5 days in the past which is 07/05/2024.
		// to get any date just make two changes minus for a past date and plus for a future date and the number of days as required.
		//To change the hours from 24 to maybe 10 hours ect
		
		
		//Date obj_FutureTime = new Date(obj_CuerrentTime.getTime()+60*60*1000*24*5); 
		//System.out.println(obj_FutureTime); // Will print the future date
		 
	
		
	}

}
