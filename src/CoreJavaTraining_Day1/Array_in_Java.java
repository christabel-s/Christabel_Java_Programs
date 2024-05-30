package CoreJavaTraining_Day1;

public class Array_in_Java {

	public static void main(String[] args) {
		
		
		//StudentsName[2] = " Christabel"; //Here we are changing/replacing the value in index 2 from Kamsi to Christabel
		
		//System.out.println(StudentsName[0]); Will print out the value in the index 0
		//System.out.println(StudentsName[2]); Will print out the value in the index 2
		
		/*for (int i = 0; i<3; i++) {   // Better to use for loop instead to print out the whole values inside the array
			
			System.out.println(StudentsName[i]);
		
		}
		*/
		//this method of creating Array is also acceptable where the square bracket is placed before the array name
	       
	       // int []rollNo =new int[3];  
		
		
		
       String StudentsName[] = new String[3]; // Creates and initialised an array to have only 3 values inside the array
		
				StudentsName[0] = " Junior";   //Assigns values to the each index in the array
				StudentsName[1] = "  Angel";
				StudentsName[2] = "  Kamsi";
			
	  int rollNo[] =new int[3];
	       
		       rollNo[0] = 1; //Assigns values to the each index in the array
		       rollNo[1] = 2; 
		       rollNo[2] = 3; 
		       
	  String gender[] = new String [3]; // Creates and initialised an array to have only 3 values inside the array
			
		       gender[0] = "M";   //Assigns values to the each index in the array
		       gender[1] = "F";
		       gender[2] = "M";
				

	       System.out.println("Student names  " + "StudentsNo" + "   Sex");
	       
       for (int i = 0; i<StudentsName.length; i++) {   // Better to use for loop instead to print out the whole values inside the array
    	   
			System.out.println(StudentsName[i] + "         " + rollNo[i] + "            " +  gender[i]);
		
		}
       
       //Assignment  - Create an array of data type int, of size 3 and take the value of the array using the scanner class
       
      
	}

}
