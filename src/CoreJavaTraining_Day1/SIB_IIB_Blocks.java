package CoreJavaTraining_Day1;

public class SIB_IIB_Blocks {
	
	static 
	{
		System.out.println("I am an SIB 1 Block");
	}
	
	
	static 
	{
		System.out.println("I am an SIB 2 Block");
	}
	
 
	{
		System.out.println("I am an IIB 1 Block");
	}
	
	{
		System.out.println("Iam a IIB 2 Block");
	}
     
	
	SIB_IIB_Blocks() //Am the constructor
	
	{
		System.out.println("Iam a contructor, a special type of method though the last to be exceted");
	}
    
	public static void main(String[] args) {
		
     System.out.println("And I am the main Method ");
     SIB_IIB_Blocks Obj = new SIB_IIB_Blocks(); // Am the object
     
     
	}

}
