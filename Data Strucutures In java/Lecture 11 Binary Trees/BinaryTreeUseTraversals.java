import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUseTraversals {
	//A program for inorder Traversal
    public static void inOrder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	inOrder(root.left);
    	System.out.print(root.data+" ");
    	inOrder(root.right);
    	
    }
  //A program for Preorder Traversal
    public static void preOrder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data+" ");
    	preOrder(root.left);
    	preOrder(root.right);
    	
    }
    
  //A program for Postorder Traversal
    public static void postOrder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	postOrder(root.left); 
    	postOrder(root.right);
    	System.out.print(root.data+" ");
    }

    //construct a binary tree from preOrder and Inorder
    public static BinaryTreeNode<Integer> buildTreePreIn(int in[], int pre[]){
    	return buildTreeHelperPreIn(in, pre, 0, in.length-1, 0, pre.length-1);
    }
	private static BinaryTreeNode<Integer> buildTreeHelperPreIn(int[] in, int[] pre, int inStart, int inEnd, int preStart, int preEnd) {
		// TODO Auto-generated method stub
	  if(inStart > inEnd) {
		  return null;
	  }
	  int rootData = pre[preStart];
	  BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	  int rootInIndex = -1;
	  for(int i = inStart; i<= inEnd; i++) {
		  if(in[i] == rootData) {
			  rootInIndex = i;
			  break;
		  }
	  }
	  if(rootInIndex == -1) {
		  return null;
	  }
	  int leftInStart = inStart;
	  int leftInEnd = rootInIndex - 1;
	  int leftPreStart = preStart + 1;
	  int leftPreEnd = leftPreStart + leftInEnd-leftInStart;
	  int rightInStart = rootInIndex + 1;
	  int rightInEnd = inEnd;
	  int rightPreStart = leftPreEnd+1;
	  int rightPreEnd = preEnd;
	  root.left  = buildTreeHelperPreIn(in, pre, leftInStart, leftInEnd, leftPreStart, leftPreEnd);
	  root.right = buildTreeHelperPreIn(in, pre, rightInStart, rightInEnd, rightPreStart,rightPreEnd );
	  return root;
	}
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {4,2,5,1,3,7};
		int pre[] = {1,2,4,5,3,7};
		BinaryTreeNode<Integer> root = buildTreePreIn(in, pre);
		printTreeLevelWise(root);
    
	}
	

}
