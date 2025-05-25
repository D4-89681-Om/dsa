package q1;

public class BST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);
		if (root == null) root = newnode;
		else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					}else trav = trav.left;
				}
				else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					}
					else trav = trav.right;
				}
			}
		}
	}

	private void inOrder(Node trav) {
		if(trav == null)
			return;
		inOrder(trav.left);						
		System.out.print(" " + trav.data);	
		inOrder(trav.right); 					
	}
	
	public void inOrder() {				
		System.out.print("root : ");
		inOrder(root);
		System.out.println("");
	}
	
	private boolean serachNode(Node trav,int key)
	{
		if(trav == null) return false;
		if(trav.data == key ) return true;
		
		if(key<trav.data) return serachNode(trav.left,key);
		return serachNode(trav.right, key);
	}
	
	public boolean searchNode(int key) {
		return serachNode(root, key);
	}
	public boolean isEmpty() {
		return root == null;
	}
}
