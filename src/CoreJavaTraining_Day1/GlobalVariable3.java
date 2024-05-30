package CoreJavaTraining_Day1;

public class GlobalVariable3 {
	
	//method overload Using global variable
	static double  num1 ;
	static int num2 ;
	
	static void add(int num1, double num2)
	{
		System.out.println(num1 * num2);
		return;
	}
	void add(int num1, int num2)
	{
		System.out.println(num1 * num2);
	}
	
	static void add(double num1, int num2)
	{
		System.out.println(num1 * num2);
	}
	
	
	     
	
	
	String name = "Kamsi"; //global variables which are non static
	int age =19;
	double weight = 60.2;
	
	
	void biogra(String name, int age, double weight)
	{
		System.out.println("This is my biography" + " "  + name + " "+ " " +age + " " + weight ); //local variables in this line
	
	}

	public static void main(String[] args) {

		GlobalVariable3 myBio = new GlobalVariable3();
		
		System.out.println(myBio.name);
		System.out.println(myBio.age);
		System.out.println(myBio.weight);
		myBio.biogra("Christabel", 40 , 60.3 ); //calling the method
		add(20,2.0);
		myBio.add(20,2);
		add(3.0, 2);
	
    
	}

}
