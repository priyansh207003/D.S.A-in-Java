class Solution {
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        
        int v = adj.size();
        
        boolean[] visited = new boolean[v];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfstraversal(0, adj, visited, ans);
        
        return ans;
    }

    public void dfstraversal(int node,
                             ArrayList<ArrayList<Integer>> adj,
                             boolean[] visited,
                             ArrayList<Integer> ans) {
        
        visited[node] = true;
        
        ans.add(node);

        for(int i : adj.get(node)) {
            
            if(!visited[i]) {
                dfstraversal(i, adj, visited, ans);
            }
        }
    }
}
