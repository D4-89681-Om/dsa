package q3;

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
		
		int level = bst.findLevel(key);
		System.out.println("Level : "+level);
		
		sc.close();
	}

}
