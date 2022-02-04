package TwoExtendsStack;

import lombok.Getter;
import lombok.Setter;

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
}
