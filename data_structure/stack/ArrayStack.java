import java.util.EmptyStackException;

import lombok.Getter;
import lombok.Setter;

class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

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
        return (top == capacity - 1);
    }

    public void push(int data) throws StackException {

        try {
            if (isStackFull()) {
                throw new StackException("스택 꽉 참");
            } else {
                array[++top] = data;
            }
        } catch (StackException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public int pop() {

        try {
            if (isEmpty()) {
                throw new EmptyStackException();
            } else {
                return array[top--];
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
            throw e;
        }

    }

}