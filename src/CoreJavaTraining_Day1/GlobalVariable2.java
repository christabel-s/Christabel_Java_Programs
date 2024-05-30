package CoreJavaTraining_Day1;

public class GlobalVariable2 {
	
	static int age; // Declearing static global variable which is NOT initialized,will print defualt value of zero. Can be initia inside method
	static double weight;  //creating static global variable that does not need the help of an object to be used
	       String fullName = "Christabel Samuel";  //creating and initializing  a Non Static global variable 
	                                                //that will need an object of it class before it can be use 

	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(weight);
		
		GlobalVariable2 objectvariable = new GlobalVariable2(); //creating an object of this class 
		
		System.out.println(objectvariable.fullName); // using the global variable with the help of the object of this class created above

	}

}
