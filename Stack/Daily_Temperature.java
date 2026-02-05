//Leetcode 739
import java.util.Stack;
public class daily_temperature {

    public static int[] dailytemperature(int[] t) {

        int n = t.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

       
        for (int i = n - 1; i >= 0; i--) {

            
            while (!stack.isEmpty() && t[stack.peek()] <= t[i]) {
                stack.pop();
            }

          
            if (stack.isEmpty()) {
                res[i] = 0;
            } 
            else {
                res[i] = stack.peek() - i;
            }

            
            stack.push(i);
        }

        return res;
    }
    public static void main (String argc[]){
      int t[] = {10,20,30,40,50};
      int res [] = dailytemperature(t);
      for (int i : res) {
        System.out.print(i+" ");
      }
    }
}
