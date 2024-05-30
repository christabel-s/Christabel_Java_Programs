package Interface;

// The interface class can have only abstract methods
interface Interface1{ // interface class with abstract methods
		void login(); //Am an abstract method, I do not need to have the keyword abstract in front of me anyways.
		void search();
}

interface Interface2 extends Interface1{  // interface class with abstract methods
		void payment();
		void logout();
}

public class Interface_and_contreteClass implements Interface2{
		
		void navigate_Pg1() //I'm a non static method
		{
			
		}
		
		static void navigate_Pg2()
		{
			
		}
public static void main(String[] args) {
	
	       
	Interface_and_contreteClass ObjInterface = new Interface_and_contreteClass();
	
		             ObjInterface.navigate_Pg1();
		             navigate_Pg2();
		             ObjInterface.login();
		             ObjInterface.search();
		             ObjInterface.payment();
		             ObjInterface.logout();	

	}


@Override
public void login() {
// Write the code in here for implementation of the login method in the above abstract class same 
//with the below three methods
   System.out.println("Am the methods inherited from the interface class I need to have implemetations inside of me.");	
}


@Override
public void search() {
	
}

@Override
public void payment() {
	
}

@Override
public void logout() {
	
}

}
