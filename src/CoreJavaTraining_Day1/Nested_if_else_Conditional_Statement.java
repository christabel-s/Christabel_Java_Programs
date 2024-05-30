package CoreJavaTraining_Day1;

public class Nested_if_else_Conditional_Statement {

	
	public static void main(String[] args) {
		
		int value1 = 50;
		int value2 = 20;
		
		if (value1 < value2) 
		{	
			  if(value1 >= value2) 
			  {
				  System.out.println(" Am the child If");
			  }
			
			  else 
			  {
				  System.out.println(" Am the child else");
			  }
			
		}
			
		else 
		{
			System.out.println(" I am the parent else condition");
			
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		String firstName = "christabel";
		String lastName = "Samuel";
		
	if (firstName.contains("bel"))  //This is like the grand parents // IF TRUE execution will jump inside and check the second if/parent if
	 {
			if(firstName.equals("christabel"))   //I am Parent IF TRUE execution will jump inside to check the child if
			 {  //System.out.println(" nested second if condition is TRUE");
				      
				    if( firstName.contains("chris"))// Iam Parent IF CONDITION
				          { 
				     	  System.out.println(" Iam Child IF CONDITION"); // If the child IF is FALSE then the Child ELSE will then be executed
				           }
				      
				  
				     else{ 
				    	 System.out.println(" Am the no three else the child else condition ");
				         }  
			  }
       }
			
			 else 
			  {
			    System.out.println(" Am the child else");//// Iam Parent else CONDITION I will be executed if child IF condition is FALSE
			  }
     }
			
	
		
}	




