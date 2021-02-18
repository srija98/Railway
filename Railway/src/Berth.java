
public class Berth {
	
	
	int lb =21;
	int mb =21;
	int ub =21;
	
	public void allocateBerth(Ticket ticket)
	{
		System.out.println(ticket.getBerthPreference());
		if(lb!=0 && ticket.getBerthPreference().equalsIgnoreCase("LB"))
		{
		     lb--;
		     ticket.setConfirmationMessage("Booked LB");
		}	
		else if(mb!=0 && ticket.getBerthPreference().equals("MB"))
		{
		     mb--;
		     ticket.setConfirmationMessage("Booked MB");
		}	
		else if(ub!=0 && ticket.getBerthPreference().equals("UB"))
		{
		     ub--;
		     ticket.setConfirmationMessage("Booked UB");
		}
		else
		{
			 if(lb!=0)
			 {
				 lb--;
			     ticket.setConfirmationMessage("Booked LB"); 
			 }
			 else if(mb!=0)
			 {
				 mb--;
			     ticket.setConfirmationMessage("Booked MB"); 
			 }
			 else
			 {
				 ub--;
			     ticket.setConfirmationMessage("Booked UB"); 
			 }
			 
		}
		
	}

}
