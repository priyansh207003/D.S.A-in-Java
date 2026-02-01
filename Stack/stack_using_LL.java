public class StackUsingLL {

    private int length;
    private ListNode top;

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
    public StackUsingLL() {
        length = 0;
        top = null;
    }

    // Push operation (void + print)
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
        System.out.println(data + " pushed into stack");
    }

    // Pop operation (void + print)
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty. Cannot pop.");
            return;
        }
        int popped = top.data;
        top = top.next;
        length--;
        System.out.println(popped + " popped from stack");
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.println("Top element is: " + top.data);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Stack size
    public void size() {
        System.out.println("Stack size is: " + length);
    }

    // Print stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }
        ListNode current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.peek();
        stack.size();
    }
}
