
package parent_child_inheritance;
//This is a child one class with a main method which has inherit from a parent class with the help of the keyword extends 
//and will call the parent methods inside it main method

public class Child_2 extends Parent_class{
	
	static void mutiply()
	{
		System.out.println("Am multiply from the child class2");
	}
	
public static void main(String[] args){
		
	mutiply(); //My own method child 2 class
	addition();   // inherited from parent class
	subtraction(); // inherited from parent class
	
	
		
		
	}
}
