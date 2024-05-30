package CoreJavaTraining_Day1;

public class Continue_Keyword {

	public static void main(String[] args) {
		// Continue keyword is used to skip a particular iteration in a loop eg for loop
		
		
		for(int i = 0; i< 10; i++) { 
			if(i == 5)
				continue ;   // when i becomes 5 continue will skip i and iteration 5 will not be run continue on iteration 6
			System.out.println(i);
			
		}

	}

}
