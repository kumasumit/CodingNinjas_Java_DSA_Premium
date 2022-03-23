package binarysearchtrees;
/*Check cousins
Send Feedback
Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins of each other or not. Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
Do it in O(n).
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
Line 2 : integer value of p 
Line 3 : Integer value of q
Output format :
true or false
Constraints :
1 <= N <= 10^5
Sample Input :
5 6 10 2 3 4 -1 -1 -1 -1 9 -1 -1 -1 -1
2
4
Sample Output :
true
*/



public class CheckCousins {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);

	}
    	public static boolean isSiblings(BinaryTreeNode<Integer> root,int node1,int node2) {

		if(root==null) {
			return false;
		}
		if(root.left!=null && root.right!=null) {
			
			if(root.left.data == node1 && root.right.data == node2) {
				return true;
			}
			
		}
		return isSiblings(root.left, node1, node2) || isSiblings(root.right, node1, node2);
		
	}
	public static int level(BinaryTreeNode<Integer> root,int k,int node1) {

		if(root==null)
			return -1;
		if(root.data == node1) {
			return k;
		}
		int left  = level(root.left, k+1, node1);
		int right = level(root.right, k+1, node1);
		if(left==-1) {
			return right;
		}
		if(right==-1) {
			return left;
		}
		
		return -1;
		
	}

}
