package CoreJavaTraining_Day1;

public class Method_Overloading {
	
	// Method overloading is when multiple methods are created with the same name but with different parameters inside the same class
	// They can be static or Non static methods
	
	static void calculation() {   //first method overload with void return type and no parameter
		int value1 = 100;
		int value2 = 10;
		     value2 = 200;    // This is called updating the value of our value2 varialbe with a different value 200
		int sum = value1 + value2;
		System.out.println(sum);
	}
	
	//static method overloading with return type of double
	static double calculation(double value_1, int value_2, int value_a, int value_b) {
		double result = value_1 * value_2 * value_a * value_b;		
		System.out.print(result);
		return result;	// if a return type isnt void it means that this method promised to return some value explicitly after calculation
	}
	
	//Non static method with a return type of void
	void calculation(int value3, int value4, int value5) {
		  int multiply = value3 * (value5 * value4);
		  System.out.print(multiply); //if a method return type is a viod return type the method  //does need to use the keyword retun 
		                             //inside the method the method can still return a value but not explicitly, 
		                             //but it will use the print statement or put the result in a variable and hand it over to another method 

	}
	
	double calculation(int num1, double num2) {
		double product = num1 /num2;
		System.out.println(product);
		return product;  // return keyword should be used in methods that thier return type isnt void.
		
	}
	

	public static void main(String[] args) {
		
		Method_Overloading output = new Method_Overloading();
		
		calculation();
		calculation(2.0, 2, 1, 2);
		output.calculation(5,5,1);
		output.calculation(50,0.2);
		

	}
	
}
