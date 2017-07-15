
public class TreeNode implements Comparable

{
	
	
	private Object value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Object initValue,TreeNode initLeft,TreeNode initRight)
	
	{
		
		value = initValue;
		left = initLeft;
		right = initRight;
	
	}

	public Object getValue()
	
	{
		
		return value;
		
	}
	
	public TreeNode getLeft()
	
	{
		
		return left;
		
	}
	
	public TreeNode getRight()

	{
		
		return right;
		
	}
	
	public void setValue(Object theNewValue)
	
	{
		
		value = theNewValue;
		
	}
	
	public void setLeft(TreeNode theNewLeft)
	
	{
		
		left = theNewLeft;
		
	}
	
	public void setRight(TreeNode theNewRight)
	
	{
		
		right = theNewRight;
		
	}


	public int compareTo(Object other) 
	
	{

		TreeNode otherNode = (TreeNode)other;
		TreeNode myNode = this;
		Integer otherNodeValue = (Integer)otherNode.getValue();
		Integer myNodeValue = (Integer)myNode.getValue();
		
		return myNodeValue.compareTo(otherNodeValue);
		
	}


}
