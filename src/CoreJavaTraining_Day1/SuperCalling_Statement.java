package CoreJavaTraining_Day1;

//Using super() calling statement to call the constructors of our parent class from inside the child class constructor

class grandParent_Class {
	
			grandParent_Class (String name, String lastName){
			System.out.println(" I'am the constructor on grand parents Class" + " my name is " + name + lastName);
			}
}

class MyParent_Class extends grandParent_Class {
	      
			MyParent_Class(int age, String name){
			super("Christabel ", "Samuel");
			System.out.println(" I'am the constructor of the parents Class age  " + age + " and my name is " + name );
		
			
			
		   }
}

public class SuperCalling_Statement extends MyParent_Class {
	
		   SuperCalling_Statement(){
		   super(45, " Christabel ");
		   System.out.println(" I'am the constructor of the Child Class");
			}

		   public static void main(String[] args) {
		SuperCalling_Statement Obj = new SuperCalling_Statement();
		
		
		//new SuperCalling_Statement();

	}

}
