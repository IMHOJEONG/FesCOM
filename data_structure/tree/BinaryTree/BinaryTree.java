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
    StringBuilder preorderStringBuilder;
    StringBuilder inorderStringBuilder;
    
    public BinaryTree() {
        
        nodes = new BinaryTreeNode[7];
        for(int i = 0 ; i < nodes.length ; i++){
            nodes[i] = new BinaryTreeNode(i+1);
        }
        for(int i = 1 ; i <= nodes.length / 2  ; i++){
            
            int left = 2 * i ;
            int right = 2 * i + 1;

            nodes[i-1].setLeft(nodes[left-1]);
            nodes[i-1].setRight(nodes[right-1]);

        }

        preorderStringBuilder = new StringBuilder();
        inorderStringBuilder = new StringBuilder();
    }

    // preorder
    public void PreOrderWithRecursion(BinaryTreeNode root){

        if(root != null){
            preorderStringBuilder.append(root.getData());
            PreOrderWithRecursion(root.left);
            PreOrderWithRecursion(root.right);
        }   
    }

    // InOrder
    public void InOrderWithRecursion(BinaryTreeNode root) {
        if(root != null){
            InOrderWithRecursion(root.left);
            inorderStringBuilder.append(root.getData());
            InOrderWithRecursion(root.right);
        }
    }

}
