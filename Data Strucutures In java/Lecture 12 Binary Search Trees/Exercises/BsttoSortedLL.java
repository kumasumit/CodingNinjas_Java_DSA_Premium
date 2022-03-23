package binarysearchtrees;

/*Code: BST to Sorted LL
Send Feedback
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10
*/
public class BsttoSortedLL {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	// LinkedList Node Class

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}

	class Pair {
		LinkedListNode<Integer> head;
		LinkedListNode<Integer> tail;
	}

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair ans = helper(root);
		return ans.head;
	}

	public static Pair helper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair output = new Pair();
			output.head = null;
			output.tail = null;
			return output;
		}
		Pair lefttree = helper(root.left);
		LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
		Pair righttree = helper(root.right);
		Pair output = new Pair();
		if (lefttree.head != null) {
			output.head = lefttree.head;
			lefttree.tail.next = newNode;

		} else {
			output.head = newNode;
		}
		newNode.next = righttree.head;
		if (righttree.head == null) {
			output.tail = newNode;

		} else {
			output.tail = righttree.tail;
		}
		return output;
	}
}
