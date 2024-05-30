package CoreJavaTraining_Day1;

import java.util.Arrays;

public class Match_Function {
  static int sum = 0;    //making thid variable static because you are assiging it back to itself
  static int avaraige = 0;
  static int remainder = 0;
  static int countOfScores = 0;
public static void main(String[] args) {
		
		
		
		
		
		String name = "Christabel";
		
		System.out.println(name.matches("C(.*)")); // Checking is if my string Starts with the letter C
		System.out.println(name.matches("(.*)l")); // Checking is if my string Ends with the letter l
       
		
		
		String name2 = "school";
		
		System.out.println(name2.matches("......"));// Checking is if my string is a six letter word
		
		
		String name3 = "school";
		System.out.println(name3.lastIndexOf('o')); // Checking the index of last letter o in my string school
		
		int index4 = name3.lastIndexOf('c');  // Checking the index of c in my string school
		System.out.println(index4);
		
		
		String name4 = "Samuel";   //How to repeat a string multiple times
		String repeatStr = name4.repeat(6);
		System.out.println(repeatStr);
		
		
		//How  to split my string using space as a delimiter.
		
		String fullname = "Christabel Chioma Samuel";
		
		String fullnameArray[] = fullname.split(" ");  //splits the string using space delimiter and parks the splited string inside an array
		String Str_fullnameArray = Arrays.toString(fullnameArray); // convert the array to a string ,and print it out 
		System.out.println(Str_fullnameArray);
	
		
		//create an Array int data type of size 4 and find out what the average of the int data in the array is
		
		int scores[] = new int[4];
		
		scores[0]= 20;
		scores[1]= 10;
		scores[2]= 73;
		scores[3]= 20;
		
		for(int i = 0; i < scores.length; i++ ){
			sum = sum + scores[i];	
			avaraige = sum /scores.length;
			countOfScores++;
			remainder = sum % scores.length;
		
		}
		
		System.out.println(" The sum is " + sum);
		System.out.println(" The numer of scores in the array are  " + countOfScores);
		System.out.println(" The Averiage is " + avaraige);
		System.out.println(" The Remainder is " + remainder);
		
		
		// how do you check if a string contains only digit
		
		String secName = "l123";
		
		
	}

}
