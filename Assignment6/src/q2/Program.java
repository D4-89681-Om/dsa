package q2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST bst = new BST();

		bst.addNode(2);
		bst.addNode(3);
		bst.addNode(5);
		bst.addNode(10);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		
		
		bst.inOrder();
		
		System.out.print("Give the key : ");
		int key=sc.nextInt();
		
		bst.getSuccessor(key);
		
		sc.close();
	}

}
