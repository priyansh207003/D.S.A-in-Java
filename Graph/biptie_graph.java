class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int [n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!colors(i,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean colors(int node , int[][] graph,int[] color){
        Queue<Integer>queue = new LinkedList<>();
        queue.offer(node);
        color[node]=0;
        while(!queue.isEmpty()){
            int take = queue.poll();
            for(int neighbour: graph[take]){
                if(color[neighbour]==-1){
                    color[neighbour]=1-color[take];
                    queue.offer(neighbour);
                }
                else if (color[neighbour]==color[take]){
                    return false;
                }
            }
        }
        return true;
    }
}
