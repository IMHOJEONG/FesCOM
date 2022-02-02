import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArrayStackTest {

    @DisplayName("ArrayStack 첫 생성테스트")
    @Test
    public void first_makeStack(){

        ArrayStack array = new ArrayStack();
 
        assertThat(array.getArray())
            .hasSize(1);
        assertThat(array.getCapacity())
            .isSameAs(1);
        assertThat(array.getTop())
            .isSameAs(-1);
        
    }

}
