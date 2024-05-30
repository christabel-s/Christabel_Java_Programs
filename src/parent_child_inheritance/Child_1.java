
package parent_child_inheritance;

//This is a child one class with a main method which has inherit from a parent class with the help of the keyword extends 
//and will call the parent methods inside it main method

public class Child_1 extends Parent_class{

	static void divide()
	{
	 System.out.println("Am divide from my own class child 1");	
	}
	
public static void main(String[] args){
	
	addition();   // inherited from parent class
	subtraction(); // inherited from parent class
	divide(); //.My own method child1 class
	
	
	}

}
