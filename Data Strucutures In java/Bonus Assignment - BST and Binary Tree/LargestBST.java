package binarysearchtrees;
/*Largest BST
Send Feedback
Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format:
The first and only line of output contains the height of the largest BST.
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
2
*/
class Pair<T,V>{
	T first;
	V second;

}
public class LargestBST {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
         return largestBSTSubtree1(root).second.second;
	}
      public static Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> largestBSTSubtree1(BinaryTreeNode<Integer> root) {

        if(root==null) {
            Pair<Integer,Integer> innerPair1 = new Pair<>();
            innerPair1.first =Integer.MIN_VALUE;
            innerPair1.second = Integer.MAX_VALUE;
            Pair<Boolean,Integer> innerPair2= new Pair<>();
            innerPair2.first =true;
            innerPair2.second = 0;
            Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> ansPair = new Pair<>();
            ansPair.first = innerPair1;
            ansPair.second = innerPair2;
            return ansPair;
        }

        Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> leftAnsPair = largestBSTSubtree1(root.left);
        Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> rightAnsPair = largestBSTSubtree1(root.right);
        Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> ansPair = new Pair<>();
        Pair<Integer,Integer> innerPair1 = new Pair<>();
        Pair<Boolean,Integer> innerPair2= new Pair<>();
        innerPair1.first = Math.max( Math.max( leftAnsPair.first.first  , rightAnsPair.first.first ),
                                    root.data
                                   );
        innerPair1.second = Math.min( Math.min( leftAnsPair.first.second  , rightAnsPair.first.second ),
                                     root.data
                                    );
        innerPair2.first = leftAnsPair.second.first && rightAnsPair.second.first && 
            ( leftAnsPair.first.first < root.data  ) &&
            (rightAnsPair.first.second > root.data);
        
        if( innerPair2.first) {
            innerPair2.second = Math.max( leftAnsPair.second.second  , rightAnsPair.second.second
                                        ) + 1;
        }
        else{
            innerPair2.second = Math.max(leftAnsPair.second.second , rightAnsPair.second.second);
        }
        ansPair.first = innerPair1;
        ansPair.second = innerPair2;

        return ansPair;




    }

}