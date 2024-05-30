package AbstractClass_And_ContrateClass;

//// The Abstract class can have abstract methods and concrete methods also
abstract class Amazon_Login{  //Abstract class 1
	    abstract void Amazon_enterUsername(); // Abstract method
		abstract void Amazon_enter_password();
		void Amazon_clickEnter() { //Am a non static contrete method inside an abstract class
	    	
		}
		static void Amazon_logIn(){ //Am a static contrete method inside an abstract class
			System.out.println("Static method inside the Abstract class 1");
		}
}
	
		
		
abstract class Amazon_shopping extends Amazon_Login{  //Abstract class 2
	    abstract void Amazon_empty_basket(); // Abstract method
		abstract void Amazon_addItem();
		void Amazon_pay() //Am a non static contrete method inside an abstract class
        {
			System.out.println("Non Static method inside the Abstract class 2");
		}
		static void Amazon_logOut() //Am a static contrete method inside an abstract class
		{
			System.out.println("Static method inside the Abstract class 2");
		}
	
		
}


//The concrete class can have only concrete methods
public class Abstract_contrete_Class extends Amazon_shopping {
	

public static void main(String[] args){
		Abstract_contrete_Class Obj = new Abstract_contrete_Class();
		
		Obj.Amazon_enterUsername();
		Obj.Amazon_enter_password();
		Obj.Amazon_empty_basket();
		Obj.Amazon_addItem();
		Obj.Amazon_clickEnter();
		Obj.Amazon_pay();
		  Amazon_logOut();
		  Amazon_logIn();

}

		@Override
		void Amazon_empty_basket() {
			System.out.println(" My logic for Amazon_empty_basket() will be written here for implementation ");
			
		}
	
		@Override
		void Amazon_addItem(){  //Am non static method of this child by overiding the non static method of the abstract class
			System.out.println(" My logic for Amazon_addItem() will be written here for implementation ");
			
		}
	
		@Override
		void Amazon_enterUsername() {
			System.out.println(" My code logic for Amazon_enterUsername() will be written here for implementation ");
			
			
		}
	
		@Override
		void Amazon_enter_password() {
			System.out.println(" My code logic for Amazon_enter_password() will be written here for implementation ");
			
		}

}
