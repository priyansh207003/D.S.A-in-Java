public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    // Insert at last
    public void insertlast(int val){
      if(tail==null){
        insertfirst(val);
        return;
      }
      Node node = new Node(val);
      tail.next = node;
      tail=node;
      size++; 
    }
    //Insert at mid of element
    public void insert(int val,int index){
      if(index==0){
        insertfirst(val);
        return;
      }
      if(index==size){
        insertlast(val);
        return;
      }
      Node temp = head;
      for(int i=1;i<index;i++){
        temp = temp.next;
      }
      Node node = new Node(val, temp.next);
      temp.next = node;
      size++;
    }
    //Deletion first
    public int deletefirst(){
      int val  = head.value;
      head = head.next;
      if(head==null){
        tail=null;
      }
      size--;
      return val;
    }
    //Delete last
    public int deletelast(){
      if(size<=1){
        return deletefirst();
      }
      Node secondlast = get(size-2);
      int val  = tail.value;
      tail = secondlast;
      tail.next = null;
      return val;
    }
    //delete with index
    public int delete(int index){
      if(index==0){
        return deletefirst();
      }
      if(index==size-1){
        return deletelast();
      }
      Node prev = get(index-1);
      int val = prev.next.value;
      prev.next = prev.next.next;
      size--;
      return val;
    }
    //get function
    public Node get(int index){
      Node node = head;
      for(int i=0;i<index;i++){
        node = node.next;
      }
      return node;
    }
    //find node
    public Node find(int value){
      Node node  = head;
      while(node!=null){
        if(node.value==value){
          return node;
        }
        node=node.next;
      }
      return null;

    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
           }
        System.out.println("null");
    }

    // Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next){
          this.value=value;
          this.next=next;
        }
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertlast(33);
        list.insert(22, 2);
        list.deletefirst();
        list.deletelast();
        list.delete(2);
        list.find(0);
        list.display(); 
    }
}
