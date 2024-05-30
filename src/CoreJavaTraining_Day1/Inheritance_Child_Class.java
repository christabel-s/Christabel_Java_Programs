package CoreJavaTraining_Day1;


class Parent //parent class
 {
	static void addition()
	{
		System.out.println("I am additing from Parent Class");
	}
	
}

public class Inheritance_Child_Class extends Parent // Child class that inherites the addition method from the parent class
   {                                              // With help of the keyword extend
	static void subtraction()
	{
		System.out.println("I am Subtraction from child Class");
	}
	public static void main(String[] args) {
		addition();
		subtraction();
		
	}

}
