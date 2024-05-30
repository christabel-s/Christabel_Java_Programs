package Assignment1;


public class Checking_Different_Values_Using_If_Statements {
 //Write a program that checks price tickets for male,female and children
	//and prints out the different prices for M,F, or children.
	
	public static void main(String[] args) {
		int maleTicket = 20;
		int femaleTicket = 15;
		int childrenTicket = 10;
		
		int  ticketPrice = 0;
		
		
		if(ticketPrice == maleTicket  ) {
			System.out.println( "£"+ ticketPrice + " ticket is for the male");
		}
		
		else if(ticketPrice ==femaleTicket)
		{
		 System.out.println( "£"+ticketPrice + " ticket is for the female");	
		}
		
		else if (ticketPrice ==childrenTicket)
		{
		 System.out.println ("Sorry this ticket is the children "); 
		}
		
		else 
		{
		 System.out.println ("Sorry no ticket at that price "); 
		}

	}

}
