package binarysearchtrees;
/*Pair sum in a BST
Send Feedback
Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).
Note:
1. Assume BST contains all unique elements.
2. In a pair, print the smaller element first.
Input Format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of S.
Output format:
You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.
Constraints:
Time Limit: 1 second   
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 1:
2 10
5 7
*/
import java.util.Stack;
public class PairSuminBST {
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
	
	   public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        if(root==null) {
            return ;
        }

      
        Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
        BinaryTreeNode<Integer> temp = root;
        while(temp!=null){
            stack1.push( temp  );
            temp = temp.left;
        }
        temp =root;
        while(temp!=null){
            stack2.push( temp  );
            temp = temp.right;
        }


        // Assume BST contains all unique elements
        while( !stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek().data < stack2.peek().data) ) {

            BinaryTreeNode<Integer> frontNode1 = stack1.peek(),frontNode2 = stack2.peek();

            if(frontNode1.data + frontNode2.data == s) {

                System.out.println( frontNode1.data +" " + frontNode2.data );
                stack1.pop();
                stack2.pop();
                    
                

                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }

                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                  
                }


            }

            else if( frontNode1.data + frontNode2.data  < s  ) {
                stack1.pop();
                
                
                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }



            }
            else {
                stack2.pop();
                    
                
                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                }

            }


        }

    }	
	
}