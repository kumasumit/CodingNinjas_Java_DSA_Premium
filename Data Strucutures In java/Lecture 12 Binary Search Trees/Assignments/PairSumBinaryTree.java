package binarysearchtrees;
/*Pair Sum Binary Tree
Send Feedback
Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
Note:
1. Assume the given binary tree contains all unique elements.
2. In a pair, print the smaller element first. Order of different pairs doesn't matter.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of S.
Output Format :
Print each pair in a new line, as described in the task. 
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
15
Sample Output 1:
5 10
6 9
*/
import java.util.ArrayList;
import java.util.Collections;
public class PairSumBinaryTree {

	 static void pairSum(BinaryTreeNode<Integer> root, int sum) {

	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
	        if(root==null) {
	            return ;
	        }
	        ArrayList<Integer> arr = convertTreeToArray(root);
	        Collections.sort(arr);
	        int i=0,j=arr.size()-1;
	        while(i<j) {

	            if(arr.get(i)+ arr.get(j)==sum) {
	                System.out.println(arr.get(i) +" " + arr.get(j));
	                i++;
	                j--;
	            }
	            else if(arr.get(i) + arr.get(j) < sum ) {
	                i++;
	            }
	            else {
	                j--;
	            }

	        }

	    }
	    //helper function to convert  tree into Array. 
	    private static ArrayList<Integer> convertTreeToArray(BinaryTreeNode<Integer> root) {
			
			if(root==null) {
				return new ArrayList<>();
			}
			
			ArrayList<Integer> leftArrayList = convertTreeToArray(root.left);
			ArrayList<Integer> rightArrayList = convertTreeToArray(root.right);
			ArrayList<Integer> ansArrayList = new ArrayList<>();
			for(int i : leftArrayList) {
				ansArrayList.add(i);
			}
			for(int i : rightArrayList) {
				ansArrayList.add(i);
			}
			ansArrayList.add(root.data);
			return ansArrayList;
			
		}

	}   