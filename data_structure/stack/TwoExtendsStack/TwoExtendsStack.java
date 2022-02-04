package TwoExtendsStack;

import lombok.Getter;
import lombok.Setter;

class StackException extends Exception {
    public StackException(String msg){
        super(msg);
    }
}

@Getter
@Setter
public class TwoExtendsStack {
    private int top;
    private int capacity;
    private int[] array;
    
    public TwoExtendsStack() {  
        capacity = 1;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int data) throws StackException{
        
            array[++top] = data;
        
    }
}
