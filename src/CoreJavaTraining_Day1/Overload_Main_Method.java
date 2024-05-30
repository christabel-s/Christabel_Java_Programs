package CoreJavaTraining_Day1;

public class Overload_Main_Method {

	public static void main(String[] args){
		System.out.println(" Am the original main method");
		main ();
		main (4);
		main ("name");
	
	}
		
		public static void main (){
			System.out.println(" Am the overloaded main method");
			
		}
		

		public static void main (int num){
			System.out.println(" Am the overloaded main method with integer parameter");
			
		}
		

		public static void main (String name){
			System.out.println(" Am the overloaded main method with string parameter");
		}
		

	

}
