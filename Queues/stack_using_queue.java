//Lettcode number 225 
class MyStack {
  Queue <Integer>queue;
  public MyStack(){
    queue = new LinkedList();
  }

  public void push(int x){
    int size = queue.size();
    queue.add(x);
    while(size-->0){
        queue.add(queue.poll());
    }
  }

    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
  
}
