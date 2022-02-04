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

}
