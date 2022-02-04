package BinaryTree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int data){
        this.data = data;
    }

    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right){
        this.left = left;
        this.right = right;
    }
}

@Getter
@Setter
public class BinaryTree {
    
    BinaryTreeNode[] nodes;
    
    public BinaryTree() {
        
        nodes = new BinaryTreeNode[7];
        for(int i = 0 ; i < nodes.length ; i++){
            nodes[i] = new BinaryTreeNode(i+1);
        }
        for(int i = 1 ; i <= nodes.length / 2  ; i++){
            
            int left = 2 * i ;
            int right = 2 * i + 1;

            nodes[i-1].setLeft(nodes[left-1]);
            nodes[i-1].setLeft(nodes[right-1]);

        }
        
    }
    // preorder
    public void PreOrder(BinaryTreeNode root){
        if(root != null){

        }
    }

}
