
public class Solution {
   //A program to check whether a node is present or not in a binary tree.
   public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	   if(root == null) {
		   return false;
	   }
	   else if(root.data==x) {
		   return true;
	   }
	   else {
		   return (isNodePresent(root.left,x) || isNodePresent(root.right,x));
	   }
	   
   }
   
   //A program to find height of a binary tree.
   public static int height(BinaryTreeNode<Integer> root) {
	   if(root == null) {
		   return 0;
	   }
	   int smallLeftOutput = height(root.left);
	   int smallRightOutput = height(root.right);
	   if(smallLeftOutput > smallRightOutput) {
		   return smallLeftOutput+1; //here 1 is for the root node 
	   }
	   else {
		   return smallRightOutput+1;
	   }
	   
   }
   
   //A program to create a mirror of a Binary tree
   public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {

	   //base case to check if root node is null
	   if(root == null) {
		   return;
	   }
	   if(root.left ==null && root.right ==null) {
		   return;
	   }
	   mirrorBinaryTree(root.left);
	   mirrorBinaryTree(root.right);
	   //swap the left and the right subtrees
	   BinaryTreeNode<Integer> temp = root.left;
	   root.left = root.right;
	   root.right = temp;
	   
   }
   
   //A program to get diameter of a Binary Tree
   public static int diameter(BinaryTreeNode<Integer> root) {
	   if(root == null) {
		   return 0;
	   }
	   int option1 = height(root.left)+ height(root.right); //when 2 nodes are from left and right subtrees
	   int option2 = diameter(root.left); //when both nodes with largest distance are present in left subtree
	   int option3 = diameter(root.right); //when both nodes with largest distance are present in right subtree
	   return Math.max(option1, Math.max(option2, option3));
	   //return the largest values of these three
   }
   
   //A program to get both diameter and height using a Pair Class
   public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
	   if(root==null) { //base case
		   Pair<Integer, Integer> output = new Pair<>();
		   output.first = 0;
		   output.second = 0;
		   return output;
	   }
	   Pair<Integer, Integer> leftOutput = heightDiameter(root.left);
	   Pair<Integer, Integer> rightOutput = heightDiameter(root.right);
	   int height = 1 + Math.max(leftOutput.first, rightOutput.first);
	   //now for diameter we have 3 cases
	   int option1 = leftOutput.first+ rightOutput.first;
	   int option2 = leftOutput.second;
	   int option3 = rightOutput.second;
	   int diameter = Math.max(option1, Math.max(option2, option3));
	   Pair<Integer, Integer> output = new Pair<>();
	   output.first = height;
	   output.second = diameter;
	   return output;
   }
   
}
