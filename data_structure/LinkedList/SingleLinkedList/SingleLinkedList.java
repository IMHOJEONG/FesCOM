import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class ListNode {
    private int data;
    private ListNode next;
    public ListNode(int data){
        this.data = data;
    }

}

@Getter
@Setter
public class SingleLinkedList {
    private ListNode headNode;

    public SingleLinkedList() {
        this.headNode = new ListNode(1);
    }
}
