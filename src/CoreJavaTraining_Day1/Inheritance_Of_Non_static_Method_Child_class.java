package CoreJavaTraining_Day1;

class Parent_class {
	
		void multiply() 
		{
			System.out.println("I am the non static method 1 of the Parent Class");// non static method of the parent class will use the object of 
			                                                              //the the child clsss when the parent class is called
		}
	
		void devide() 
		{
			System.out.println("I am the non static method 2 of the Parent Class");
		}
}

public class Inheritance_Of_Non_static_Method_Child_class extends Parent_class {
	
		void addition()
		{
			System.out.println("I am the non static method 1 of the child Class");
		}
		
	    void subtract() 
	    {
	    	System.out.println("I am the non static method 2 of the child Class");
		}

public static void main(String[] args) {
		Inheritance_Of_Non_static_Method_Child_class obj = new Inheritance_Of_Non_static_Method_Child_class();
        
		obj.addition();
		obj.subtract();
		obj.multiply();
		obj.devide();
	
	}

}
