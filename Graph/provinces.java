//Leetcode 547
class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n = isConnected.length;
       int res = 0;
       boolean [] visited = new boolean[n];

       for(int i=0;i<n;i++){
        if(!visited[i]){
            res++;
            dfs(isConnected,visited,i);
        }
       } 
       return res;
    }
    private void dfs(int[][]isConnected,boolean[]visited,int node){
        visited[node] = true;
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[node][i]==1 && !visited[i]){
                dfs(isConnected,visited,i);
            }
        }
    }
}
