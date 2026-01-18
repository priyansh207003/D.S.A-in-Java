public class CLL {
  private class Node{
    int val;
    Node next;
    public Node (int val){
      this.val = val;
    }
  }
  private Node head;
  private Node tail;
   
  //First they are null
  public CLL(){
    this.head = null;
    this.tail = null;
  }
  public void insert(int val){
    Node node  = new Node(val);
    if(head == null){
      head = node;
      tail = node;
      return;
    }
      tail.next = node;
      node.next = head;
      tail = node;
  }
  //Delete the val
  public void delete(int val){
    Node node = head;
    if(node==null){
      return;
    }
    if(node.val==val){
      head = head.next;
      tail.next = head;
      return ;
    }
    do{
      Node n = node.next;
      if(n.val == val){
        node.next = n.next;
        break;
      }
      node = node.next;
    }while(node!=head);

  }
  public void display(){
    Node node = head;
    if(head!=null){
      do{
        System.out.print(node.val+"->");
        node = node.next;
      }while(node!=head);
    }
    System.out.println("Head");
  }
  public static void main(String argc[]){
    CLL list = new CLL();
    list.insert(22);
    list.insert(88);
    list.insert(44);
    list.insert(34);
    list.insert(11);
    list.display();
    list.delete(11);
    list.display();
  }
}
