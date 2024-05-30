package MethodOveride;

public class ChildClass_MethodOverride extends ParentClass_MethodOverride {
	
	
public static void main(String[] args) {
		
		ChildClass_MethodOverride ChildObject= new ChildClass_MethodOverride();
			
		ChildObject.parent_method();
		ChildObject.amazonAccount();
		ChildObject.parentPassword(); //It is the child method that the JVM will find with the name password for here and run
		            
}
	
	
		void parent_method() 
		{
			System.out.println("Login with my New email");
		}
		
		void parentPassword()//non static method can should be override 
		{
			System.out.println("Login with my New password");
		}
		
		void amazonAccount() 
		{
			                     //Using the supper keyword to call the amazonAccount() method which is in my
			super.amazonAccount(); //parent class so that this method is not overrriden.
			System.out.println("But my Amazon Account login details has now changed");
		}

}




	