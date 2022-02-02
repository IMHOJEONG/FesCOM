import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArrayStackTest {
    public ArrayStack arrayStack;
    @BeforeEach
    public void setting() {
        arrayStack = new ArrayStack();
    }

    @DisplayName("ArrayStack 첫 생성테스트")
    @Test
    public void first_makeStack(){

        assertThat(arrayStack.getArray())
            .hasSize(1);
        assertThat(arrayStack.getCapacity())
            .isSameAs(1);
        assertThat(arrayStack.getTop())
            .isSameAs(-1);
        
    }

    @DisplayName("ArrayStack isEmpty 테스트")
    @Test
    public void isEmpty_ArrayStack(){
        assertThat(arrayStack.isEmpty())
            .isSameAs(true);
    }

    @DisplayName("ArrayStack isStackFull 테스트")
    @Test
    public void isStackFull_ArrayStack() {
        assertThat(arrayStack.isStackFull())
            .isSameAs(false);
    }

    @DisplayName("ArrayStack push 테스트")
    @Test
    public void push_ArrayStack()
    {
        arrayStack.push(1);
        assertThat(arrayStack.getArray())
            .hasSize(1)
            .contains(1);
    }

}
