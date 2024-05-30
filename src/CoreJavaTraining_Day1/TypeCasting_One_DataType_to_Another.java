package CoreJavaTraining_Day1;

public class TypeCasting_One_DataType_to_Another {

	public static void main(String[] args) { 
		  int num = 90;
		  double num2 = num;  //converting int to double is widening the data type and this is done Implicitly
		  System.out.println(num2);
		
		   double num3 = 90.8;
			int num4 = (int) num3;  //double to int is narrowing the data type so it must be done explicitly( by force)
			System.out.println(num4);
			
			byte bytenum = 82;
			long longnum = bytenum;  //converting int to double is widening the data type and this is done Implicitly and explicitly
			long newlongnum = 2000;  //Updating /changing  the value to 2000
			System.out.println(newlongnum);
			
			long mylong = 2000;
			byte mybite = (byte) mylong;  //narrowing the data size this is done explicitly(by force)
			
			
			byte newbyte = 82;   //Updating /changing  the value to 2000
			System.out.println(mybite);
			
			int myint = 25;
			float myfloat = myint;
			System.out.println(myfloat);
			
	
			
			
		}

}
