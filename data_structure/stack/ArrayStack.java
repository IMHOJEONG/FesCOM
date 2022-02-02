import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayStack {


    private int top;
    private int capacity;
    private int[] array;

    public ArrayStack() {
        capacity = 1;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isStackFull() {
        return (top == capacity-1);
    }

    public void push(int data) {

        try {
            if(isStackFull()){
                throw new Exception("스택이 꽉 참");
            }
            else{
                array[++top] = data; 
            }
        }
        catch( Exception e){
            e.printStackTrace();
        }
    }

    


}