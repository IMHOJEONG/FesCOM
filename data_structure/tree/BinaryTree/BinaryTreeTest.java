package BinaryTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class BinaryTreeTest {
    
    public BinaryTree binaryTree;

    @BeforeEach
    public void setting() {
        binaryTree = new BinaryTree();
    } 

    @DisplayName("BinaryTree 생성 확인")
    @Test
    public void test_makeBinaryTree() {
        
        BinaryTreeNode[] result = binaryTree.getNodes();

        assertThat(result)
            .hasSize(7);
            
            int target = 1;
            for(BinaryTreeNode data : result){
                assertEquals(data.getData(), target++);
            }
        
        for(int i = 1 ; i <= result.length / 2; i++){
            
            assertThat(result[i-1].left.data)
                .isSameAs(2*i);
            assertThat(result[i-1].right.data)
                .isSameAs(2*i+1);
        }

    }

    @DisplayName("PreOrder 재귀 작성")
    @Test 
    public void test_PreorderWithRecursion(){
        binaryTree.PreOrderWithRecursion(binaryTree.nodes[0]);
        StringBuilder result = binaryTree.getPreorderStringBuilder();
        assertEquals(result.toString(), "1245367");
    }

    @DisplayName("InOrder 재귀 작성")
    @Test
    public void test_InorderWithRecursion(){
        binaryTree.InOrderWithRecursion(binaryTree.nodes[0]);
        StringBuilder result = binaryTree.getInorderStringBuilder();
        assertEquals(result.toString(), "4251637");
    }

    @DisplayName("PostOrder 재귀 작성")
    @Test
    public void test_PostOrderWithRecursion() {
        binaryTree.PostOrderWithRecursion(binaryTree.nodes[0]);
        StringBuilder result = binaryTree.getPostorderStringBuilder();
        assertEquals(result.toString(), "4526731");
    }
}
