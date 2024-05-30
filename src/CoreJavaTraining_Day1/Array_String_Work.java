package CoreJavaTraining_Day1;

public class Array_String_Work {

	public static void main(String[] args) {
		// In a given Array find out if a given string is present in the array or not
		
		int ArrayNo[] = new int[5];
		int num = 40;
		int countnum= 0;

		ArrayNo[0] = 10;
		ArrayNo[1] = 20;
		ArrayNo[2] = 40;
		ArrayNo[3] = 70;
		ArrayNo[4] = 40;
		
 
		for(int i=0; i<ArrayNo.length; i++) {
			
			 if(ArrayNo[i]==num) {
				 System.out.println("num is present in the Array index  " + i);
				 countnum++;     
			 }
			 else {
				
			    // System.out.println(ArrayNo[i]);
		   }
			
	   }	
		// If you want your counter to print out like this 1 2 3 etc put it inside the for loop, 
		//if you want it to print out just the total count made or total number put it outside the for loop like this below
		 System.out.println(" num appeared "+  countnum + " times in the araay"); 
		 
		 
		 
		
		// How to copy one Array into another Array
	}

}
