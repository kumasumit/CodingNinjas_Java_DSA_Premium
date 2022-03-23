/*
 * Check if a Binary Tree is BST
Send Feedback
Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
Note: Duplicate elements should be kept in the right subtree.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format :
The first and only line of output contains either true or false.
Constraints :
Time Limit: 1 second
Sample Input 1 :
3 1 5 -1 2 -1 -1 -1 -1
Sample Output 1 :
true
Sample Input 2 :
5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
Sample Output 2 :
false
*/


package binarysearchtrees;


class Pair<T,V> {
	public T first;
	public V second;
}

public class Solution {
public static int minimum(BinaryTreeNode<Integer> root) {

	if (root == null) {
		return Integer.MAX_VALUE;
	}
	return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));

}

public static int maximum(BinaryTreeNode<Integer> root) {

	if (root == null) {
		return Integer.MIN_VALUE;
	}
	return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));

}

public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
	if (root == null) {
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
		output.first = true;
		output.second = new Pair<Integer, Integer>();
		output.second.first = Integer.MAX_VALUE;
		output.second.second = Integer.MIN_VALUE;
		return output;
	}
	Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
	Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
	int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
	int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
	boolean isBST = (root.data > leftOutput.second.second) 
			&& (root.data <= rightOutput.second.first)
			&& leftOutput.first && rightOutput.first;
	Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
	output.first = isBST;
	output.second = new Pair<Integer, Integer>();
	output.second.first = min;
	output.second.second = max;
	return output;
}

public static boolean isBST(BinaryTreeNode<Integer> root) {

	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
 	 * Taking input and printing output is handled automatically.
    */
	return isBST2(root).first;
    
}



}
