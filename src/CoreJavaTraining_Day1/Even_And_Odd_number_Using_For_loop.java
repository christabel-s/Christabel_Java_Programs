package CoreJavaTraining_Day1;

public class Even_And_Odd_number_Using_For_loop {

	public static void main(String[] args) {
		
		
	/*for(int num1 = 4; num1 <100; num1=num1+2)   // This code will print all the even numbers between 4 and 100
	{
		System.out.println(num1);

	}

	
	
	for(int num1 = 1; num1 <100; num1=num1+2)   // This code will print all the Odd numbers between 1 and 100
	{
		System.out.println(num1);

	}
	
	for(int num2 = 0; num2 <100; num2++)   // This code will print all the Even numbers between 1 and 100
	{
		if(num2 % 2 == 0)
		System.out.println(" This is an even number "+ "" + num2);

	}*/

	for(int num2 = 2   ; num2 <100; num2++)   // This line will loop from 1 to 100 and pass on each item to the num2 variable 
	{
		if(num2 % 2 != 0) // this line will check if the item num2 given to it is and odd or an even number.
		{
		System.out.println(" This is an Odd number "+ "" + num2);// This code will print all the Odd numbers between 1 and 100
		
	   }
		else 
		{
			System.out.println(" even number " + num2);// This code will print all the even numbers between 1 and 100
		}
  }
}
}
	