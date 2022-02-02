import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArrayStackTest {
    public ArrayStack array;
    @BeforeEach
    public void setting() {
        array = new ArrayStack();
    }

    @DisplayName("ArrayStack 첫 생성테스트")
    @Test
    public void first_makeStack(){

        assertThat(array.getArray())
            .hasSize(1);
        assertThat(array.getCapacity())
            .isSameAs(1);
        assertThat(array.getTop())
            .isSameAs(-1);
        
    }

    @DisplayName("ArrayStack isEmpty 테스트")
    @Test
    public void isEmpty_ArrayStack(){
        assertThat(array.getTop())
            .isSameAs(-1);
    }

}
