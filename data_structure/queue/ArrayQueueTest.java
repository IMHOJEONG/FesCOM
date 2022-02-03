import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class ArrayQueueTest {
    
    public ArrayQueue arrayQueue;

    @BeforeEach
    public void setting() {
        arrayQueue = ArrayQueue.createQueue(3);
    }

    @DisplayName("ArrayQueue 생성 및 초기화 createQueue 테스트")
    @Test
    public void makeArrayQueue() {
        assertThat(arrayQueue.getArray())
            .hasSize(3);
        assertThat(arrayQueue.getCapacity())
            .isSameAs(3);
        assertThat(arrayQueue.getFront())
            .isSameAs(-1);    
        assertThat(arrayQueue.getRear())
            .isSameAs(-1);    
    }  
    @DisplayName("ArrayQueue isEmpty 메소드 테스트")
    @Test
    public void test_isEmpty(){

        assertThat(arrayQueue.isEmpty())
            .isSameAs(true);
    }


}
