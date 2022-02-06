package LinkedListStack;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class LLStackTest {
    
    LLStack llstack;
    @BeforeEach
    public void setting()
    {
        llstack = new LLStack();
    }

    @DisplayName("연결 리스트 스택 생성 테스트")
    @Test
    public void test_makeLLStack() {
        assertThat(llstack.getHeadNode())
            .isSameAs(null);
        
    }

    @DisplayName("연결 리스트 push 테스트")
    @Test
    public void test_PushLLStack() {
        assertThat(llstack.getHeadNode())
            .isSameAs(null);
        llstack.push(1);
        assertThat(llstack.getHeadNode().getData())
        .isSameAs(1);
        llstack.push(2);
        assertThat(llstack.getHeadNode().getNext().getData())
            .isSameAs(1);
    }

    @DisplayName("연결 리스트 top 메소드 테스트")
    @Test
    public void test_topLLStack(){
        assertThat(llstack.top())
            .isSameAs(null);
        llstack.push(1);
        assertThat(llstack.top())
        .isSameAs(1);
    }
    
    @DisplayName("연결 리스트 스택 pop 메소드 테스트")
    @Test
    public void test_popLLStack() {
        llstack.push(1);
        assertThat(llstack.pop())
            .isSameAs(1);
    }

    @DisplayName("연결 리스트 isEmpty 테스트")
    @Test
    public void test_isEmpty(){
        assertThat(llstack.isEmpty())
            .isSameAs(true);
            llstack.push(1);
            assertThat(llstack.isEmpty())
            .isSameAs(false);
            
        }
        
        @DisplayName("연결 리스트 deleteStack 테스트")
        @Test
        public void test_deleteStack() {
            llstack.push(1);
            assertThat(llstack.isEmpty())
            .isSameAs(false);
            
            llstack.deleteStack();
            assertThat(llstack.getHeadNode())
            .isSameAs(null);
            
        }
}
