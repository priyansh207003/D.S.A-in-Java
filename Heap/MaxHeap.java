 public class MaxHeap {
  private int[] heap;
  private int size;
  private int capacity;

  public MaxHeap(int capacity){
    this.capacity = capacity;
    heap = new  int [capacity];
    size = 0;
  }
  private int parent (int i){
    return (i-1)/2;
  }
  private int left(int i){
    return 2*i+1;
  }
  private int right(int i){
    return 2*i+2;
  }
  public void insert(int key){
    if(size==capacity){
      System.out.println(("Heap  Overflow"));
      return;
    }
    heap[size] = key;
    int i = size;
    size++;
    //Heapify
    while(i!=0 && heap[parent(i)]<heap[i]){
      swap(i,parent(i));
      i = parent(i);
    }
  }
  public int extractMax(){
    if(size<=0)return Integer.MIN_VALUE;
    if(size==1) return heap[--size];
    int root = heap[0];
    heap[0] = heap[size-1];
    size--;
    heapify(0);
    return root ;
  }
  //Heapify
  private void heapify(int i){
    int l = left(i);
    int r = right(i);
    int largest = i;

    if(l<size && heap[l]>heap[largest]) largest = l;

    if(r< size && heap[r]>heap[largest]) largest = r;

    if(largest !=i){
      swap(i,largest);
      heapify(largest);
    }
  }
  //Increase Key
  public void increasekey(int i,int newval){
    heap[i] = newval;
    while(i!=0 && heap[parent(i)]<heap[i]){
      swap(i,parent(i));
      i= parent(i);
    }
  }
  //delete Key
  public void deletekey(int i){
    increasekey(i, Integer.MAX_VALUE);
    extractMax();
  }
  //Swap helper
  private void swap(int i,int j){
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }
  //Print heap
  public void printheap(){
  for(int i = 0; i < size; i++){
    System.out.print(heap[i] + " ");
  }
  System.out.println(); 
}
  public static void main(String argc[]){
    MaxHeap h = new MaxHeap(10) ;
      h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(6);
        h.insert(1);

        h.printheap();
        System.out.println("Max "+ h.extractMax());
        h.printheap();
  }
}
 
