package CoreJavaTraining_Day1;

public class Logical_Operators {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 40;
		
		if (num1 < num2 || num1 == num2)
		{
			System.out.println(" One of those is correct");
		}
		
		else
		{
			System.out.println (" Am the else block");
		}
		
		if (num1 != num2 && num2 > num1 ) //both conditions must be true
			
		{
			System.out.println("All conditions must be true");
		}
		
		
			if (!(num1==num2 || num2!=num1));  // The result of this code should have been True but the ! (Not True) has reversed the True to False
			{
				System.out.println("Am the OR Operator");
			}
			
			if (!(num1==num2 && num2!=num1)); // The result of this code should have been False but the ! (Not True) has reversed the False to True
			  {
				System.out.println("Am the && Operator");
			  }
			
			

	}

}
