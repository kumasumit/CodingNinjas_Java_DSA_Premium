//creates a generic binary tree
public class BinaryTreeNode<T>{
    //We will create a generic class
    public BinaryTreeNode(T data){
        this.data = data;
    }
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    //we made all public so that visibility is not restricted
}