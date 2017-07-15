import java.util.ArrayList;

public class Stack

{
	
	ArrayList stack;
	//last in first out
	//top - last one added @ size - 1
	
	Stack()
	
	{
		
		stack = new ArrayList();
		
	}

	//add
	public void push(Object o)
	
	{
		
		stack.add(o);
		
	}
	
	public Object pop()
	
	{
		
		if(stack.isEmpty())
			
		{
			
			return null;
			
		}
		
		return stack.remove(stack.size()-1);
		
	}
}
