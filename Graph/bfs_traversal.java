class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean [] visited = new boolean[v];
        Queue<Integer>q = new LinkedList<>();
        ArrayList<Integer>ans = new ArrayList<>();
        
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int node =  q.poll();
            ans.add(node);
            for(int i: adj.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        return ans;
        
         
    }
}
