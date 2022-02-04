package BinaryTree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        assertThat(binaryTree.getNodes())
            .hasSize(7);

        int target = 1;
        for(BinaryTreeNode data : binaryTree.getNodes()){
            assertEquals(data.getData(), target++);
        }
    }
}
