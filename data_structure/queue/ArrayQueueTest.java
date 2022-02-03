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
    @AfterEach
    public void resetQueue() {
        arrayQueue = null;
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

    @DisplayName("ArrayQueue add 메소드 테스트")
    @Test
    public void test_isFull() throws QueueException{

        arrayQueue.enQueue(1);
        arrayQueue.enQueue(1);
        arrayQueue.enQueue(1);
        assertThat(arrayQueue.isFull())
            .isSameAs(true);
            
        }
        
        @DisplayName("ArrayQueue getQueueSize 메소드 테스트")
        @Test
        public void test_getQueueSize() throws QueueException {
            arrayQueue.enQueue(1);
            arrayQueue.enQueue(1);
            assertThat(arrayQueue.getQueueSize())
            .isSameAs(2);
        }
    
        @DisplayName("ArrayQueue dequeue 메소드 테스트")
        @Test
        public void test_Dequeue() throws QueueException {
            
            arrayQueue.enQueue(1);
            arrayQueue.enQueue(1);
            arrayQueue.deQueue();
            arrayQueue.deQueue();
            assertThat(arrayQueue.getQueueSize())
                .isSameAs(2);

        } 
}
