import java.util.ArrayList;

public class Queue 

{

	//first come first served
	private ArrayList queue;
	
	//zero is the front
	
	public Queue()
	
	{
		
		queue = new ArrayList();
		
	}
	
	public void enqueue(Object o)
	
	{

			queue.add(o);
			

	}
	
	public Object dequeue()
	
	{
		
		if(queue.isEmpty())
			
		{
			
			return null;
			
		}
			
		return queue.remove(0);
		
	}
	
	public Object peek(int index)
	
	{
		
		if(index < queue.size()-1 && index >= 0)
			
		{
			
			return null;
			
		}
		
		return queue.get(index);
		
	}
	
	public String toString()
	
	{
		
		return queue.toString();
		
	}
	
	public ArrayList getQueue()
	
	{
		
		return queue;
		
	} 
}
