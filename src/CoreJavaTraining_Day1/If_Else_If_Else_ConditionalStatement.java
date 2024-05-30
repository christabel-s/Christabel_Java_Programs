package CoreJavaTraining_Day1;

public class If_Else_If_Else_ConditionalStatement {
	
	// There are five Conditional Operators also called Comparation Operators
	//     <  lesser than   >  greater than == equals to    <= lesser than or Equals to >= greater than OR Equals to   != Not equals to

	public static void main(String[] args) {
		
		int value1 = 10;
		int value2 = 20;
		
		if (value1>value2)
		{
			System.out.println(" print 1 "); // This if block will run if the condition is true where the if condition is not TRUE
			                                // then one of the if else blocks whose condition is True will run instead. 
			                                // but if non of the If else blocks meets the condition then the Else block will run as last option	
		}
		
		else if (value1 == value2)
		{
			System.out.println(" print 2 ");
			
		}
		
		
		else if (value1 != value2)
		{
			System.out.println(" print 3 ");
			
		}
		
		else if (value1 < value2)  // even it two if else blocks conditions are TRUE the first TRUE block is the block that will be executed
		{
			System.out.println(" print 2 ");
			
		}
		
		else if (value1 == value2)
		{
			System.out.println(" print 4 ");
			
		}
		else 
		{
			System.out.println(" 5 No condition matches ");  // If non of the if else bocks condition is true the else block will be executed
			
		}
		
		
			
	}

}
