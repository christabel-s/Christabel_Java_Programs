package MethodOveride;

public class ParentClass_MethodOverride {
	
		void parent_method() 
		{
			System.out.println("Login with my Old email");
		}
		void parentPassword()// non static method should be override in the child class
		{
			System.out.println("Login with my Old password");
		}
		
		void amazonAccount() // I will use the super keyword to call you in my child class so that you will not be override
		{
			System.out.println("I have old Amazon Account login details");
		}

}


	
	

	

