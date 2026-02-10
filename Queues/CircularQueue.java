class CircularQueue {
    int size;
    int front, rear;
    int[] queue;

    CircularQueue(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int value) {

        // Check if full
        if ((front == (rear + 1) % size)) {
            System.out.println("Queue is Full");
            return;
        }

        // First element insertion
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = value;

        System.out.println(value + " inserted");
    }

    // Dequeue operation
    void dequeue() {

        // Check if empty
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int removed = queue[front];
        System.out.println(removed + " removed");

        // If only one element left
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display queue
    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;

        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }

        System.out.println(queue[rear]);
    }
     public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        cq.display();

        cq.dequeue();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);

        cq.display();
    }
}
