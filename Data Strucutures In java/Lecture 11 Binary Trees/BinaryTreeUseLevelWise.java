import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeUseLevelWise {

	// takeInput function for Binary Tree Level Wise
	public static BinaryTreeNode<Integer> takeInputLevelWise() {

		Scanner s = new Scanner(System.in);

		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		System.out.println("Enter root Data");
		// create a queue using linked list for Binary tree
		int rootData = s.nextInt();

		if (rootData == -1) {
			s.close(); // base case
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.poll();
			// left child of root node
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.add(child);
				front.left = child;

			}
			// right child of right node
			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.add(child);
				front.right = child;
			}
		}
		// while loop end, in queues, .add is used to add, .poll is used to pop
		s.close();
		return root;
	}

	// print function for Binary Tree Level wise,
	public static void printTreeLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = queue.poll();
			System.out.print(frontNode.data + ":");
			if (frontNode.left != null) {
				System.out.print("L:" + frontNode.left.data + ",");
				queue.add(frontNode.left);

			} else {
				System.out.print("L:" + -1 + ",");
			}
			if (frontNode.right != null) {
				System.out.print("R:" + frontNode.right.data);
				queue.add(frontNode.right);
			} else {
				System.out.print("R:" + -1);
			}
			System.out.println();
		}
	}
	
	//Program to count nodes in Binary Tree
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0; 
		}
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
	}
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTreeLevelWise(root);
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(5);
//		root.left = node1;
//		root.right = node2;
		System.out.println("The number of nodes is " +countNodes(root));
		boolean ans = Solution.isNodePresent(root, 5);
		System.out.println(ans);
		System.out.println("=================================================================");
		System.out.println("height of Binary tree is "+Solution.height(root));
		Solution.mirrorBinaryTree(root);
		System.out.println("=================================================================");
		printTreeLevelWise(root);
		System.out.println("=================================================================");
		System.out.println("diamter :"+Solution.diameter(root));
		System.out.println("=================================================================");
		System.out.println("diameter :"+Solution.heightDiameter(root).second);
		System.out.println("height "+ Solution.heightDiameter(root).first);

	}

}
