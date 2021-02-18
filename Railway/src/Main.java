
import java.util.Scanner;

public class Main {

	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Train train =new Train();
		
		 System.out.println("Enter ur choice:");
		 System.out.println("1.book ticket  2.cancel ticket 3.Print booked tickets 4.Print Available ticket");
		 boolean end=false;
		 
		 while(!end)
		 {
			 int ch =sc.nextInt();
			 switch(ch)
			 {
			    case 1:train.bookTicket(generateTicket());
		         	   end=false;
	                   break;
			        
			  case 2:train.cancelTicket(generateTicket());	 
			         end=false;
                     break;
			 case 3:train.displayAll();
			         end=false;
                     break;
			 case 4:break;
				 default: end=true;
				           break;
			 
			 }
		 }
		
	}
	
	public static Ticket generateTicket()
	{
		System.out.println("Enter Name :");
		String name =sc.next();
		
		System.out.println("Enter age :");
		int age =sc.nextInt();
		
		System.out.println("Enter gender :");
		String gender =sc.next();
		System.out.println("Enter Birth Preference :");
		String birth_preference=sc.next();
		
		Ticket t = new Ticket(name,age,gender,birth_preference);
		return t;
		
		
	}
	
	
	
}
