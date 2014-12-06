package binarysearchtree;

public class BinarySearchTreeDemo {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40);
		bst.insert(25);
		bst.insert(78);
		bst.insert(10);
		bst.insert(3);
		bst.insert(17);
		bst.insert(32);
		bst.insert(30);
		bst.insert(38);
		bst.insert(78);
		bst.insert(50);
		bst.insert(93);
		
		System.out.println("The minimum value in the BST: " + bst.findMinimum());
		System.out.println("The maximum value in the BST: " + bst.findMaximum());
		
		System.out.println("Inorder traversal");
		bst.printInOrder();
		
		System.out.println("Preorder traversal");
		bst.printPreOrder();
		
		System.out.println("Postorder traversal");
		bst.printPostOrder();
	}
}
