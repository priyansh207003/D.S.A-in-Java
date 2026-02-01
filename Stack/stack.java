// Simple array based implementation of stack
public class Fixedarraystack {

    protected int capacity;
    public static final int CAPACITY = 10;
    protected int[] stackrep;
    protected int top = -1;

    // Default constructor
    public Fixedarraystack() {
        capacity = CAPACITY;
        stackrep = new int[capacity];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top < 0;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Push element
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackrep[++top] = data;
        System.out.println(data + " pushed");
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = stackrep[top--];
        System.out.println(data + " popped");
        return data;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackrep[i]);
            if (i < top) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method
    public static void main(String[] args) {

        Fixedarraystack stack = new Fixedarraystack();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();
    }
}
