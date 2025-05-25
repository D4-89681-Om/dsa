package q3;
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
	
	public int findLevel(int key) {
	    return findLevel(root, key, 0);
	}

	private int findLevel(Node node, int key, int level) {
	    if (node == null) return -1;              
	    if (node.data == key) return level;        
	    if (key < node.data)
	        return findLevel(node.left, key, level + 1);
	    else
	        return findLevel(node.right, key, level + 1);
	}
	public boolean isEmpty() {
		return root == null;
	}
}
