package CoreJavaTraining_Day1;

public class ThisKeyword {
	int age;
	String name;
	double salary;
	
	void studentInfo(int age, String name, double salary){
	
		this.age = age;
		this.name = name;
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		
		ThisKeyword objthis = new ThisKeyword();
		objthis.studentInfo(20,"chris", 55);
		System.out.println(objthis.salary);

	}

}
