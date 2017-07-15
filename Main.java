

public class Main 

{
	
	
public static void main(String args[])
	
	{
	
	
		
		TreeNode node = new TreeNode(new Integer(16),null,null);
		
		BinarySearchTree binary = new BinarySearchTree(node);

		TreeNode node1 = new TreeNode(new Integer(12),null,null);
		binary.add(node1);
		
		TreeNode node2 = new TreeNode(new Integer(10),null,null);
		binary.add(node2);
		
		TreeNode node3 = new TreeNode(new Integer(14),null,null);
		binary.add(node3);
		
		TreeNode node4 = new TreeNode(new Integer(6),null,null);
		binary.add(node4);
		
		TreeNode node5 = new TreeNode(new Integer(11),null,null);
		binary.add(node5);
		
		TreeNode node6 = new TreeNode(new Integer(13),null,null);
		binary.add(node6);
		
		TreeNode node7 = new TreeNode(new Integer(15),null,null);
		binary.add(node7);
	
		TreeNode node8 = new TreeNode(new Integer(97),null,null);
		binary.add(node8);
		
		TreeNode node9 = new TreeNode(new Integer(84),null,null);
		binary.add(node9);
		
		TreeNode node10 = new TreeNode(new Integer(112),null,null);
		binary.add(node10);
		
		TreeNode node11 = new TreeNode(new Integer(37),null,null);
		binary.add(node11);
		
		TreeNode node12 = new TreeNode(new Integer(90),null,null);
		binary.add(node12);
		
		TreeNode node13 = new TreeNode(new Integer(100),null,null);
		binary.add(node13);
		
		TreeNode node14 = new TreeNode(new Integer(190),null,null);
		binary.add(node14);
	
		binary.remove(node);
		
		System.out.println(binary.findDepth());
		BTreePrinter tree = new BTreePrinter();
		
		tree.printTree(node);
		
		
		
	}
	
	
	
	

	
	
}
