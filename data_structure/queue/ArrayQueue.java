import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayQueue {
    
    private int front;
    private int rear;
    private int capacity;
    private int[] array;

    private ArrayQueue(int size){
        capacity = size;
        front = -1;
        rear = -1;
        array = new int[size];
    }

    public static ArrayQueue createQueue(int size) {
        return new ArrayQueue(size);
    }


}
