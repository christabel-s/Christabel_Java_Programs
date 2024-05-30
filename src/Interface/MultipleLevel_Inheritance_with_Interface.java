package Interface;

interface openYoutube {
	void enterUserName1(); // Abstract method
	void enterPassword2();
	
}

interface openGmail {
	void enterUserName();
	void enterPassword();	
	
}


//100 abstraction is possible with interface. All methods in interface must be abstract methods only.
public class MultipleLevel_Inheritance_with_Interface implements openYoutube, openGmail{

	public static void main(String[] args) {
		

	}

	@Override
	public void enterUserName() {
		// Write the code in here for implementation of the login method in the above abstract class same 
		//with the below three methods
		
	}

	@Override
	public void enterPassword() {
		// Write the code in here for implementation of the login method in the above abstract class same 
		//with the below three methods
		
	}

	@Override
	public void enterUserName1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPassword2() {
		// TODO Auto-generated method stub
		
	}

}
