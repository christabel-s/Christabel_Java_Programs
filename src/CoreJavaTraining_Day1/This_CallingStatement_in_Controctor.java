package CoreJavaTraining_Day1;

// this calling statement is used to call a contructor from another constructor 
//line number 8 is calling the constructor in line 13
// this calling statement in line 16 is call the constructor in line 21
public class This_CallingStatement_in_Controctor {
	
		
		This_CallingStatement_in_Controctor() {
				this(4);
			System.out.println(" contructor with no parameter"); // this is called immediately an object is created
				
			}
		  //this constructor is called by the this calling statement in the constructor above it or before it
		This_CallingStatement_in_Controctor(int a) {
			this(5.5, "christabel");
	       System.out.println(" contructor with one  parameter " + a);
				
			}
	     //this constructor is called by the this calling statement in the constructor above it or before it
		This_CallingStatement_in_Controctor(double b, String name) {
	       System.out.println(" contructor with two  parameter " + b + " " + name );	// this 
			}
		
	
		public static void main(String[] args) {
			This_CallingStatement_in_Controctor Objthis = new This_CallingStatement_in_Controctor();

	}

}
