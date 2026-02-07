//leetcode 1475
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int res [] = new int [n];

        for(int i=0;i<n;i++){
            res[i]=prices[i];
        }
        Stack <Integer> stack = new Stack <>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                int idx = stack.pop();
                res[idx]=prices[idx]-prices[i];
            }
            stack.push(i);
        }
        return res;
        
    }
}
