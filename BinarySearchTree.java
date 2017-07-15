
public class BinarySearchTree 

//me nima jake



{
	private int depth;
	int x = 0;
	private TreeNode root;
	
	public BinarySearchTree(TreeNode root)
	
	{
		
		this.root = root;
		System.out.println((root).getValue()+": Root added");
		
	}
	
	public void add(TreeNode node)
	
	{
		
		if(root == null)
			
		{
			
			root = node;
			
		}
		
		else
			
		{
			
			this.addHelper(node,root);
			
		}
		
	}
	
	public void addHelper(TreeNode node,TreeNode current)
	
	{
		
		Integer currentValue = (Integer)current.getValue();
		Integer nodeValue = (Integer)node.getValue();
		
		if(currentValue.compareTo(nodeValue) >= 0)
			
		{
			
			TreeNode leftNode = current.getLeft();
			
			if(leftNode == null)
				
			{
				
				current.setLeft(node);
				System.out.println(node.getValue() + ": Node added to the left");
				return;
				
			}
			
			else
				
			{
				
				addHelper(node,leftNode);
				
			}
			
		}
		
		else if(currentValue.compareTo(nodeValue) < 0)
			
		{
			
			TreeNode rightNode = (current).getRight();
			
			if(rightNode == null)
				
			{
				
				current.setRight(node);
				System.out.println(node.getValue() + ": Node added to the right");
				return;
				
			}
			
			else
				
			{
				
				addHelper(node,rightNode);
				
			}
			
			
			
		}
		
	}
	
	public void printTree()
	
	{
		
		System.out.println();
		printTreeHelper(root);
		
	}
	
	private void printTreeHelper(TreeNode node)
	
	{
		
		if(node == null)
			
		{
			
			return;
			
		}
		
		else
			
		{
			
			System.out.println(node.getValue());
			printTreeHelper(node.getLeft());
			printTreeHelper(node.getRight());
			
		}
		
	}
	
	public void remove(TreeNode node)
	
	{
		
		if(node == null)
			
		{
			
			return;
			
		}
		
		
		else if(node.getLeft() == null && node.getRight() == null)
		
		{
			
			node.setValue(null);
			System.out.println(node.getValue() + ":Node set to nothing");
	
		}
		
		
			
		else if(node.getLeft() == null)//right
				
		{
						
			System.out.println("We taking from the right");
			node.setValue(node.getRight().getValue());
			System.out.println(node.getRight().getValue() + "this removed ");
			node.getRight().setValue(null);
				
			remove(node.getRight());
				
				
		}
			
		else if(node.getRight() == null)//left
				
		{
	
			System.out.println("We taking from the left");
				
			node.setValue(node.getLeft().getValue());
			node.getLeft().setValue(null);
			System.out.println(node.getLeft().getValue() + ": this removed ");
				
			remove(node.getLeft());
				
				
				
		}
			
		
		else
			
		{
			
			if((Integer)node.getLeft().getLeft().getValue() != null && (Integer)node.getLeft().getRight().getValue() != null)
				
			{
				
				System.out.println("two deep");
				
			}
			
			else
			
			{
			
			if((Integer)node.getLeft().getValue() > (Integer)node.getRight().getValue()) //left is bigger than right
		
			{
				
				System.out.println("left is bigger than right");
				node.setValue(node.getLeft().getValue());
				remove(node.getLeft());
				
			}
			
			if((Integer)node.getLeft().getValue() < (Integer)node.getRight().getValue()) //right is bigger than left
			
			{
				
				
				
				System.out.println("right is bigger than left");
				node.setValue(node.getRight().getValue());
				remove(node.getRight());
				
				
				
				
			}
			
			}
		}
			
			
		}
		
	public int findDepth()
	{
		if(this == null)
		{
			return 0;
		}
		
		else
		{
			TreeNode node = root;
			return findHeight(root)+1;
		}
	}
	
		
	
	private int findHeight(TreeNode node)
	{
		if(node == null)
		{
			return -1;
		}
		int righth = findHeight(node.getRight()); 
		int lefth = findHeight(node.getLeft());
		
		if(lefth > righth)
		{
			return lefth+1;
		}
		
		else
		{
			return righth+1;
		}
	}
}

