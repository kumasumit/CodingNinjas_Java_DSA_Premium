import java.util.Scanner;
public class BinaryTreeUse {
	
	//takeInput function for Binary Tree
	public static BinaryTreeNode<Integer> takeInput(Scanner s ){
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		//lets assume if user wants to end input, it returns -1
		//base case if user wants to create a null tree
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);  //recursive call for left child.
		root.right = takeInput(s); //recursive call for right child.
		return root; //we get the complete tree.
		
	}
	
	//print function for Binary Tree depth wise, 
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String toBePrinted = root.data + ""; //we are doing + "" to convert root.data into String
		if(root.left != null) {
			toBePrinted += " L:" + root.left.data+",";
		}
		if(root.right != null) {
			toBePrinted += " R:" + root.right.data; //Whenever you use .data, make sure the thing before dot is not null		
		}
		//now do 2 recursive calls one for left child another for right child
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		printTree(root);
		s.close();
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(5);
//		root.left = node1;
//		root.right = node2;

	}

}
