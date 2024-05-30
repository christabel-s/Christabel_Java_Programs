package CoreJavaTraining_Day1;

public class Constro{
	
	//Constructors
	Constro() {   //constructor with no parameter/argument
		 System.out.println("This is my first constructor with no parameter");
		
	}
	

	Constro(String age) {   //one parameter constructor
		System.out.println("I am " + age + " Years old");
		
	}

	Constro(int value1, int value2, double value3, int value4) {   //Constructor with four arguments/parameter
		System.out.println(value1/value2/value3 *value4);	 
	}
	
	
	//Methods
	
	public static void FirstName() {
		 System.out.println("Am a method with a public asscess specifier ");
	     System.out.println("My modifier is static my return type is void "	);
	     System.out.println("But I have no parameter ");
		
	}
	
	

	static void multiply(int num1, int num2) {  //Static method with parameters/arguments
	
	     String name; // this is declaration
	     int num = 25; //this is initialisation and declaration
	     System.out.println(num1 *num2);
	}
	
	static void divission(int FirstNum, int SecondNum) {  //Static method with parameters/arguments
		 System.out.println(FirstNum /SecondNum);
			
	}
	
	void subtract(int num3, int num4) {  //non-static method with no parameter 
		  System.out.println(num3 - num4 );
		
	}
	void addition() {
		 System.out.println("Iam a non - static method with no parameter ");
		
	}
	
	public static String myName(String fullname){
		 System.out.println(fullname);
		 return fullname;
			
	}
	
	
	
	public static void main(String[] args) {
     
	Constro cal =new Constro();  //Creating and Object to be used in calling methods and constructor that has no parameter
	             new Constro("40");   // calling constructor with one argument/parameter
	             new Constro(100, 2, 2.5,2); // calling construction with four arguments/parameter
	             
	             
	             multiply(10,5);
	             divission(100, 5); // calling a static method
	             cal.subtract(50,1);  //calling non static method that has argument with the help of our referenced variable cal in our object
	             cal.addition();   // calling non-static method with out argument
	             myName("Christabel Samuel");
	             
	 
		
	}

}
