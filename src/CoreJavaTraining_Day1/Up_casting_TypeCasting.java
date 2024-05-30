package CoreJavaTraining_Day1;


class parentClass {

}
public class Up_casting_TypeCasting extends parentClass{

	public static void main(String[] args) {//the two ways of creating object of a class
		
		//Up_casting_TypeCasting objchildclass = new Up_casting_TypeCasting(); //first way of creating object
		
		// new Up_casting_TypeCasting(); //second way of creating object and upcastion
		
		parentClass obj = new Up_casting_TypeCasting(); //implicitly way of up casting
		parentClass object2 = (parentClass) new Up_casting_TypeCasting(); //explicitly way of up casting
		
		// with the help of this  parent class object - object2 we can access and utilised  all the methods in the parent class
	}

}
