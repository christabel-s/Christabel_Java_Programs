package CoreJavaTraining_Day1;

public class If_conditional_statement {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 30;
		int num5 = 10;
		
		
		if (num1 > num2) {
			System.out.println(" block 1 - Num one is greater than num2");
		}
		
		if (num3 < num4) {
			System.out.println("block 2- Num three is lesser than num2");
		}
		if (num1 > num2) {
			System.out.println("block 3 - Num one is greater than num2 or equals to num2");
		}
		
		if (num3 <= num4) {
			System.out.println("block 4 - Num three is lesser than num4 or thay are the same ");
		}
		
		if (num1 == num5) {
			System.out.println("block 5- Num one and num5 are same 10");
		}
		
		if (num1 != num2) {
			System.out.println("block 6- Num one is not same as num2");
		}

	}

}
