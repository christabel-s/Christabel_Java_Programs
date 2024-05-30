package CoreJavaTraining_Day1;

public class Assert_Keyword {
	//checking if the string name is empty of has some value in it then 
    //concatinate the value with samuel. if empty we get assertion error
	
	
	static void addition(int num1, int num2) {
		assert num1 == 100;  //assert, that is do the addition only if num1 is 100 if not trow an error
		int sum =num1 + num2;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		
		
		addition(100, 200);
		String name = "C ";
	    assert name.length() > 0;    
	System.out.println(name.concat(" Samuel"));
	

	}

}
