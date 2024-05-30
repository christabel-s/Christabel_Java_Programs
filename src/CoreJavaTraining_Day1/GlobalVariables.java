package CoreJavaTraining_Day1;

public class GlobalVariables {
	
// static String name;   global variable can not be decleared on one line and 
	// name = "Christabel"; // Initialized on another line.
	
	static String name = "Christabel"; // Global variable can only be decleared and initialized in the same line if decleared inside a class
	static int age = 40;   //global variable has to be deleared as either static or non static.
	static String proffession; // but the global variable can be decleared inside the class and initialized inside a method
	
	static void additon()
	{
		System.out.println("Am learning Java");
	}
	
	public static void main(String[] args) {
		
		additon();
		proffession = "QA Engineer";
		System.out.println(proffession);
		System.out.println(name);
		System .out.println(age);
		
	}

}



