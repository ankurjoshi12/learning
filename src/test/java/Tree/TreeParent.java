package Tree;

public class TreeParent {

	private TreeNode Root;

	public TreeParent() {
	}

	private void insert(int data) {
		if (Root != null) {
			System.out.println("Entering new Node " + data);
			Root.insertNode(data);
		} else {
			System.out.println("Enterting root " + data);
			Root = new TreeNode(data);
		}
	}

	private void traversal() {
		if (Root != null) {
			Root.inOrderTraversal();
		}
	}

	public void ifExist(int data) {
		if(Root!=null) {
				Root.validateValueIsInTree(data);
				
			}
	}
	public void delete(TreeNode node) {
		if(Root!=null) {
			node.deleteNode(node);
		}

	}

	public TreeNode getRoot() {
		return Root;
	}

	public void setRoot(TreeNode root) {
		Root = root;
	}

	public static void main(String[] args) {
		TreeParent parent = new TreeParent();
		parent.insert(10);
		parent.insert(11);
		parent.insert(5);
		parent.insert(2);
		parent.insert(20);
		parent.insert(19);
		parent.traversal();
		parent.ifExist(19);
		parent.delete(new TreeNode(2));
		parent.traversal();
//		System.out.println("If exist " + parent.ifExist(19));

	}
}
