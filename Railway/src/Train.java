import java.util.ArrayList;

public class Train {
	
	
	ArrayList<Ticket> confirmedTickets =new ArrayList<Ticket>();
	ArrayList<Ticket> RacTickets =new ArrayList<Ticket>();
	ArrayList<Ticket> WaitingListTickets =new ArrayList<Ticket>();
	Berth berth =new Berth();
	
	public void bookTicket(Ticket ticket)
	{
		if(confirmedTickets.size() < 1)
		{
			berth.allocateBerth(ticket);
			confirmedTickets.add(ticket);
		}
		
		else if (RacTickets.size() < 1)
		{
			ticket.setConfirmationMessage("In Rac");
			RacTickets.add(ticket);
		}
		else if(WaitingListTickets.size() < 1)
		{
			ticket.setConfirmationMessage("In Waiting List");
			WaitingListTickets.add(ticket);
			
		}
		else
		{
			ticket.setConfirmationMessage("No tickets availble.Not booked");
		}
		
		displayTicket(ticket);
	}
	
	public void cancelTicket(Ticket ticket)
	{
		if(remove(ticket,confirmedTickets))
		{
			//confirmedTickets.remove(ticket);
			if(RacTickets.size() != 0)
			{   
				berth.allocateBerth(RacTickets.get(0));
				confirmedTickets.add(RacTickets.get(0));
				RacTickets.remove(0);
				if(WaitingListTickets.size()!=0)
				{
					WaitingListTickets.get(0).setConfirmationMessage("In Rac");
					RacTickets.add(WaitingListTickets.get(0));
					WaitingListTickets.remove(0);
				}
			}
		}
		else if(remove(ticket,RacTickets))
		{
			//RacTickets.remove(ticket);
			if(WaitingListTickets.size()!=0)
			{
				WaitingListTickets.get(0).setConfirmationMessage("In Rac");
				RacTickets.add(WaitingListTickets.get(0));
				WaitingListTickets.remove(0);
			}
		}
		else if(remove(ticket,WaitingListTickets))
		{
			//WaitingListTickets.remove(ticket);
		}
		else
		{
			System.out.println("No Search Ticket found");
		}
	}
	
	
	public boolean remove(Ticket ticket,ArrayList<Ticket> arr)
	{
		for(Ticket t: arr)
		{
			if(ticket.getName().equals(t.getName()) && ticket.getAge() ==t.getAge() 
					&& ticket.getGender().equals(t.getGender()) )
			{
				arr.remove(t);
			   return true;
			  
			}   
		}
		return false;
		
	}
	
	
	public void displayTicket(Ticket t)
	{
		System.out.println(t.getName() +" "+t.getAge() +" "+t.getGender()+" "+ t.getConfirmationMessage());
	}
	
	
	public void displayAll()
	{
		for(Ticket t : confirmedTickets)
		{
			System.out.println(t.getName() +" "+t.getAge() +" "+t.getGender()+" "+ t.getConfirmationMessage());
		}
		for(Ticket t : RacTickets)
		{
			System.out.println(t.getName() +" "+t.getAge() +" "+t.getGender()+" "+ t.getConfirmationMessage());
		}
		for(Ticket t : WaitingListTickets)
		{
			System.out.println(t.getName() +" "+t.getAge() +" "+t.getGender()+" "+ t.getConfirmationMessage());
		}
	}
	
	

}
