//Leetcode 933
public class recent_call {
  //Leetcode 933
  class RecentCounter{
     Queue<Integer> queue;
    public RecentCounter(){
      queue = new LinkedList<>();
    }
    public int ping(int t){
      queue.offer(t);
      while(queue.peek() < t - 3000){
        queue.poll();
      }
      return queue.size();
  }
}
}
