package Tree;

public class TreeNode {
	
	private int data ;
	private TreeNode LeftNode ;
	private TreeNode RightNode ;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	/**
	 * Insert Node in a Tree 
	 * @param value
	 */
	public void insertNode(int value) {
		if(value < data) {
			System.out.println("Insert left node");
			if(LeftNode != null) {
				LeftNode.insertNode(value);
			}
			else {
				LeftNode = new TreeNode(value);
			}
		}
		else {
			System.out.println("Insert Right node");
			if(RightNode!=null) {
				RightNode.insertNode(value);
			}
			else {
				RightNode = new TreeNode(value);
			}
		}
	}
	public TreeNode validateValueIsInTree(int value) {
		System.out.println("********");
		
		if(data==value) {
			System.out.println("********FOUND******** value "+value);
			return this ;
		}
		if(data>value) {
			System.out.println("LeftNode.data -"+LeftNode.data);
			if(LeftNode != null) {
				LeftNode.validateValueIsInTree(value) ;
			}
		}
		else {
			System.out.println("RightNode.data -"+RightNode.data);
			if(RightNode!=null) {
			RightNode.validateValueIsInTree(value);
		}
	}
		return null ;
	}
	
	/**TreeNode
	 * 
	 */
	public void inOrderTraversal() {
		if(LeftNode!=null) {
			LeftNode.inOrderTraversal();
		}
		System.out.println("Node "+data);
		if(RightNode!=null) {
			RightNode.inOrderTraversal();
		}
	}
	
	/**
	 * 
	 * @param node
	 */
	public void deleteNode(TreeNode node) {
		if(node.LeftNode!=null) {
			System.out.println("Left Node");
			deleteNode(LeftNode);
		}
		if(node.RightNode!=null) {
			System.out.println("Right Node");
			deleteNode(RightNode);
		}
		System.out.println("Deleting node "+node.data);
			
		node = null ;
	}
	
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return LeftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		LeftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return RightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		RightNode = rightNode;
	}
	
	
	
}
