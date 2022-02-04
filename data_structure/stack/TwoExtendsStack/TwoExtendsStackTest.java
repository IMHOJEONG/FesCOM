package TwoExtendsStack;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

public class TwoExtendsStackTest {
    
    TwoExtendsStack stack;
    @BeforeEach
    public void setting(){
        
        stack = new TwoExtendsStack();
    }

    @DisplayName("두 배 확장 스택 생성")
    @Test
    public void test_makeTwoExtendsStack() {
        assertThat(stack.getCapacity())
            .isSameAs(1);
        assertThat(stack.getTop())
            .isSameAs(-1);
        assertThat(stack.getArray())
            .hasSize(1);
    }

    @DisplayName("두 배 확장 스택 isEmpty 메소드 테스트")
    @Test
    public void test_isEmpty(){
        assertThat(stack.isEmpty())
            .isSameAs(true);
        
    }

    @DisplayName("두 배 확장 스택 push 메소드 테스트")
    @Test
    public void test_PushFull(){
        stack.push(1);
        assertThat(stack.getArray()[0])
            .isSameAs(1);
    }

    @DisplayName("두 배 확장 스택 isStackFull 메소드 테스트")
    @Test 
    public void test_isStackFull(){
        assertThat(stack.isStackFull())
            .isSameAs(false);
        stack.push(1);
        assertThat(stack.isStackFull())
        .isSameAs(true);
    }
    
    @DisplayName("두 배 확장 스택 doubleStack 메소드 테스트")
    @Test
    public void test_doubleStack(){
        stack.doubleStack();
        assertThat(stack.getCapacity())
            .isSameAs(2);
        assertThat(stack.getTop())
            .isSameAs(-1);
        assertThat(stack.getArray())
            .hasSize(2);

    }

    @DisplayName("두 배 확장 스택 delete 메소드 테스트")
    @Test
    public void test_deleteStack(){
        stack.push(1);
        assertThat(stack.getArray()[0])
            .isSameAs(1);
        stack.deleteStack();
        assertThat(stack.getTop())
            .isSameAs(-1);
        assertThat(stack.getArray())
            .hasSize(1);
        assertThat(stack.getArray()[0])
            .isSameAs(0);

    }

    @DisplayName("꽉 차면 두 배 확장을 진행한다")
    @Test 
    public void test_pushIsFull(){
        stack.push(1);
        assertThat(stack.getArray())
            .hasSize(1);
        stack.push(1);
        assertThat(stack.getArray())
            .hasSize(2);
    }

}