import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArrayQueueTest {
    
    public ArrayQueue arrayQueue;

    @BeforeEach
    public void setting() {
        arrayQueue = new ArrayQueue(3);
    }

    @DisplayName("ArrayQueue 생성 및 초기화 테스트")
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
}
