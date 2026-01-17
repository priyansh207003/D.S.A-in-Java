public class DLL {
  private Node head;
  //Insert at first
  public void insertfirst(int val){
    Node node = new Node(val);
    node.next =head;
    node.prev = null;
    if(head!=null){
      head.prev = node;
    }
    head = node;
  }
  //Insert Last 
  public void insertlast(int val){
    Node node = new Node (val);
    Node last = head;
    node.next=null;
    if(head==null){
      node.prev = null;
      head = node;
      return;
    }
    while(last.next!=null){
      last = last.next;
    }
    last.next = node;
    node.prev = last;
  }

 //Find  
 public Node find(int val){
  Node node = head;
  while(node!=null){
    if(node.val==val){
      return node;
    }
    node  = node.next;
  }
  return null;
 }
 //Insert at after index
 public void insert(int after, int val){
  Node p = find(after);
  if(p==null){
    System.out.println("Does not exist");
    return;
  }
  Node node = new Node(val);
  node.next = p.next;
  p.next = node;
  node.prev = p;
  if(node.next!=null){
    node.next.prev = node;
  } 
 }

  // Print Reverse
public void reverselist() {
  if (head == null) {
    System.out.println("List is empty");
    return;
  }

  Node node = head;

  // move to last node
  while (node.next != null) {
    node = node.next;
  }

  // print in reverse using prev
  while (node != null) {
    System.out.print(node.val + "<-");
    node = node.prev;
  }
  System.out.println("START");
}

  //Display
  public void display(){
    Node node = head;
    while(node!=null){
      System.out.print(node.val+"<->");
      node=node.next;
    }
    System.out.println("Null");
  }
  //Initiallising Doubly linked list
  private class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
      this.val = val;
    }
    public Node(int val, Node next, Node prev){
      this.val = val;
      this.next = next;
      this.prev = prev;
    }
  }
  public static void main(String argc[]){
    DLL list = new DLL();
    list.insertfirst(10);
    list.insertfirst(20);
    list.insertfirst(30); 
    list.insertfirst(40);
    list.display();
    list.insertlast(80);
    list.display();
    list.insert(30, 33);
    list.display();
    //list.reverselist();
  }
  
}
