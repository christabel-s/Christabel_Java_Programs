package CoreJavaTraining_Day1;

import java.util.Scanner;  //remember to always import the scanner class

public class Scanner_Class {
	
	//Scanner sc1 = new Scanner(System.in);
	
	static void add_int()
	{    Scanner sc1 = new Scanner(System.in);
	     System.out.println("Enter your first number");
		 int num1 =  sc1.nextInt();  //scanner accepting int input
		 System.out.println("Enter your second number");
		 int num2 = sc1.nextInt();
		 int sum = num1 + num2;
		System.out.println("The sum of the numbers you enterded is " + sum);
	}
	
	static void stringValue() 
	{   Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter your first name");
		String firstname = sc1.nextLine();  //Scanner accepting string input
		System.out.println("Enter your last name");
		String lasttname = sc1.nextLine();
		System.out.println( "Your full name is " + firstname +" "+ lasttname);
	}
	
	static void add_decimal() 
	{   Scanner sc1 = new Scanner(System.in);
		double decinum1 = sc1.nextDouble(); //Scanner accepting double that is decimal input
		double decinum2 = sc1.nextDouble();
		System.out.println(decinum1 * decinum2);
	}
	
	static void checktrue()
	{   Scanner sc1 = new Scanner(System.in);
		boolean output = sc1.nextBoolean(); //Scanner accepting true of false input
		System.out.println(output);
	}
	  
	

	public static void main(String[] args) {
		add_int();
		stringValue();
		add_decimal();
		checktrue();
		
	}
	
}
