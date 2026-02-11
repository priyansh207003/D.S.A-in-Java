//Queue implement using Linked List 
public class LLQueue {

    // Queue implemented using Linked List
    private int length;
    private ListNode front, rear;

    // Node class
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public LLQueue() {
        length = 0;
        front = rear = null;
    }

    // Enqueue operation (Insert)
    public void enqueue(int data) {
        ListNode node = new ListNode(data);

        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }

        rear = node;
        length++;
    }

    // Dequeue operation (Remove)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        int result = front.data;
        front = front.next;
        length--;

        // If queue becomes empty
        if (isEmpty()) {
            rear = null;
        }

        return result;
    }

    // Peek first element
    public int first() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        return front.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Size of queue
    public int size() {
        return length;
    }
    public static void main(String[] args) {

        LLQueue q = new LLQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.first());   // 20
        System.out.println(q.size());    // 2
    }
}
