package AbstractClass_And_ContrateClass;

//The concrete class can have only concrete methods
public class ContrateClass extends AbstractClass { //Am the concrete class
	
	 void amazonLogin() //Am the concrete method
	{
		System.out.println("Am the implementation method of an abstract method sitted in the abstarct class ");
	}
	

	public static void main(String[] args) { 
		ContrateClass obj = new ContrateClass();
		obj.amazonLogin();

	}

}