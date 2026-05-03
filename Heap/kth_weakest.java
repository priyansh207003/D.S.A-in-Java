//Leetcode 1337
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<int[]>pq = new PriorityQueue<>(
        (a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return b[0]-a[0];
        }
       ); 
       int m = mat.length;
       for(int i=0;i<m;i++){
        int ones = search(mat[i]);
        pq.offer(new int[]{ones,i});
        if(pq.size()>k){
            pq.poll();
        }
       }
       int res[] = new int[k];
       for(int i = k-1;i>=0;i--){
        res[i]=pq.poll()[1];
       } 
       return res;
    }
    private int search(int[]row){
        int start=0, end = row.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(row[mid]==1){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }

}
