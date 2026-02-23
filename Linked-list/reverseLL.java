class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;  // store next node
            curr.next = prev;       // reverse link
            prev = curr;            // move prev forward
            curr = next;            // move curr forward
        }

        return prev;  // new head
    }

    // Example usage
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head = reverse(head);

        // Print reversed list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
