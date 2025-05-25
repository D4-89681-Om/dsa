package q2;

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
	
	 public void getSuccessor(int key) {
		 Node trav = root;
		    Node successor = null;

		    while (trav != null) {
		        if (key < trav.data) {
		            successor = trav;       
		            trav = trav.left;
		        } else if (key > trav.data) {
		            trav = trav.right;
		        } else {
		            break;
		        }
		    }

		    if (trav == null) {
		        System.out.println("Key not found");
		        return;
		    }

		    if (trav.right != null) {
		        Node succ = trav.right;
		        while (succ.left != null) {
		            succ = succ.left;
		        }
		        System.out.println("Successor : " + succ.data);
		    } else if (successor != null) {
		        System.out.println("Successor : " + successor.data);
		    } else {
		        System.out.println("No successor");
		    }
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
