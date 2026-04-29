class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String>pq = new PriorityQueue<>(
            (a,b)->{
                if(map.get(a).equals(map.get(b))){
                    return b.compareTo(a);
                }
                return map.get(a)-map.get(b);
            }
        );
        for(String w  : map.keySet()){
            pq.offer(w);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
            while(!pq.isEmpty()){
                res.add(pq.poll());

            }
            Collections.reverse(res);
            return res;
        
    }
}
