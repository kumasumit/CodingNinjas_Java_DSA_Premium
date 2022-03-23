package binarysearchtrees;
/*
Longest Leaf to root path
Send Feedback
Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
Input format :

Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Line 1 : Binary Tree 1 (separated by space)

Sample Input 1 :
 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1 :
9
3
6
5
*/
import java.util.ArrayList;

public class LongestRootToLeafPath {

	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
		ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);
		
		if(leftArrayList.size()>=rightArrayList.size()) {
			
			leftArrayList.add(root.data);
			return leftArrayList;
			
		}
		else {
			rightArrayList.add(root.data);
			return rightArrayList;
		}
		
		
	}
}