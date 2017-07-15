import java.util.ArrayList;

public class PriorityQueue extends Queue

{
	

	ArrayList<Customer> queue;

	//zero is the front


	
	public PriorityQueue()
	
	{
		

		queue = new ArrayList<Customer>();
		
	}
	
	public void enqueue(Customer o)
	
	{
		
		int rank = o.getRank();
		getPosition(rank);
		
	}
	
	private int getPosition(int rank)
	
	{
		
		int pos = 0;
		while(pos < queue.size() && rank>queue.get(pos).getRank())
			
		{
			
			pos+=1;
			
		}
		
		return pos;
		
	}
	
	
	
}
