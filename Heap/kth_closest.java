class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>heap = new PriorityQueue<>((a,b)->{
            return b[0]-a[0];
        });
        for(int i=0;i<points.length;i++){
            int[]point = points[i];
            int x = point[0];
            int y = point[1];

            int dist = (x*x)+(y*y);
            heap.add(new int[]{
                dist,
                i
            });
            if(heap.size()>k){
                heap.poll();
            }
        }
        int [][] res = new int[k][2];
        int i=0;
        while(i<k){
            int []ele = heap.poll();
            int dist = ele[0],cordIdx=ele[1];

            res[i][0] = points[cordIdx][0];
            res[i][1] = points[cordIdx][1];
            i++;
        }
        return res;
    }
}
