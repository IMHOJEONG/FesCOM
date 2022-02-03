import lombok.Getter;
import lombok.Setter;


class QueueException extends Exception {
    public QueueException(String msg){
        super(msg);
    } 
}

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

    public boolean isEmpty(){
        return (front == -1);
    }

    public boolean isFull(){
        return ((rear+1)%capacity == front);
    }

    public void enQueue(int data) throws QueueException{
        
        try{

            if(isFull()){
                throw new QueueException("Queue Overflow");
            }
            else {
                
                rear = (rear+1) % capacity;
                
                array[rear] = data;

                if(front == -1){
                    front = rear;
                }
    
            }

        }
        catch(QueueException e){
            e.printStackTrace();
            throw e;
        }

    }

    public int getQueueSize(){
        return ((capacity-front+rear+1)%capacity);
    }

    
    public int deQueue() throws QueueException {
        
        try{
            
            if(isEmpty()){
                throw new QueueException("Queue Empty");
            }   
            else {
                
                int data = array[front];

                if(front == rear) {
                    front = rear - 1; 
                }
                else {
                    front = (front+1)%capacity;
                }
                return data;
            }
            
        }
        catch(QueueException e){
            e.printStackTrace();
            throw e;
        }   

    }

    




}
