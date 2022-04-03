package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T> {

	public BinaryTreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;

	}

	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;

}

public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;

	// insert functions
	// private insertHelperFunction
	private BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if (data < root.data) {
			// insert in the left
			root.left = insertData(data, root.left);
		} else {
			// if data >= root.data
			// insert it on the right side
			root.right = insertData(data, root.right);
		}
		return root;
	}

	public void insertData(int data) {
		root = insertData(data, root);
		// here root is the private root varibale of teh bst class.

	}

	// delete function
	public void deleteData(int data) {
		root = deleteData(data, root);

	}

	// delete helper function
	private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		} else { // if (data == root.data)
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				// if both left and right are not null, pick minimum from right subtree and make
				// that as root
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
	}

	// search function;
	// private helper function for search
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			// here root is the local variable, not the private variable in BST class
			return false;
		}
		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			// call right
			return hasDataHelper(data, root.right);
		} else {
			// call left
			return hasDataHelper(data, root.left);
		}

	}

	public boolean hasData(int data) {
		return hasDataHelper(data, root);
		// here root is the private variable of the BST class.

	}

	// print function for Binary Tree Level wise,
	private void printTree(BinaryTreeNode<Integer> root) {
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

			} 
			if (frontNode.right != null) {
				System.out.print("R:" + frontNode.right.data);
				queue.add(frontNode.right);
			} 
			System.out.println();
		}
	}

	// tree print function
	public void printTree() {
		printTree(root);
	}

}
