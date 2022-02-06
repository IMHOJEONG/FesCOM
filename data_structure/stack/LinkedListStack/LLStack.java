package LinkedListStack;

import java.util.EmptyStackException;

import lombok.*;

@Getter
@Setter
class LLNode {
    private Integer data;
    private LLNode next;

    public LLNode(int data){
        this.data = data;
    }
}

@Getter
@Setter
public class LLStack {
    private LLNode headNode;

    public void push(int data){
        if(headNode == null){
            headNode = new LLNode(data);
        }
        else if(headNode.getData() == null){
            headNode.setData(1);
        }
        else{
            LLNode llNode = new LLNode(data);
            llNode.setNext(headNode);
            headNode = llNode;
        }
    }

    public Integer top() {
        if(headNode == null){
            return null;
        }

        else {
            return headNode.getData();
        }
    }

    public Integer pop() {
        if(headNode == null){
            throw new EmptyStackException();
        }
        else {
            int data = headNode.getData();
            headNode = headNode.getNext();
            return data;
        }
    }

    public boolean isEmpty() {
        return (headNode == null);
    }

    public void deleteStack() {
        headNode = null;
    }
    
}
