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

    public void push(int data){
            
        if(isStackFull()) {
            doubleStack();
        }
        array[++top] = data;
    
    }

    public boolean isStackFull() {
        return (top == capacity-1);
    }   

    public void doubleStack(){
        int[] newArray = new int[capacity*2];
        System.arraycopy(array, 0, newArray, 0, capacity);
        capacity = capacity * 2;
        array = newArray;
    }

    public void deleteStack() {
        array = new int[capacity];
        top = -1;
    }
}
