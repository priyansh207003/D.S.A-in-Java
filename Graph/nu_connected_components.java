class Solution {

    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(ArrayList<Integer> edge : edges) {

            int u = edge.get(0);
            int v = edge.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[V];

        int count = 0;

        for(int i = 0; i < V; i++) {

            if(!visited[i]) {
                bfs(i, visited, adj);
                count++;
            }
        }

        return count;
    }

    public void bfs(int start, boolean[] visited,
                    ArrayList<ArrayList<Integer>> adj) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {

            int node = q.remove();

            for(int neighbor : adj.get(node)) {

                if(!visited[neighbor]) {

                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}
