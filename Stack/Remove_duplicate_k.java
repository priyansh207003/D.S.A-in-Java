class Solution {
  //Leetcode 1209
    public String removeDuplicates(String s, int k) {
       Stack <int[]>main = new Stack <>();
       for(char ch : s.toCharArray()){
        if(!main.isEmpty() && main.peek()[0]==ch){
            main.peek()[1]++;
        }
        else{
            main.push(new int[]{ch,1});
        }
        if(main.peek()[1]==k){
            main.pop();
        }
       }
       StringBuilder sb = new StringBuilder();
       while(!main.isEmpty()){
        int top[]=main.pop();
        while(top[1]-->0){
            sb.append((char)top[0]);
        }
       }
        return sb.reverse().toString();
        

    }
}
