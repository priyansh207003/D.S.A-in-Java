class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) neg.add(num);
            else pos.add(num);
        }

        if (neg.size() == 0) {
            for (int i = 0; i < pos.size(); i++)
                pos.set(i, pos.get(i) * pos.get(i));
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        if (pos.size() == 0) {
            for (int i = 0; i < neg.size(); i++)
                neg.set(i, neg.get(i) * neg.get(i));
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        for (int i = 0; i < neg.size(); i++)
            neg.set(i, neg.get(i) * neg.get(i));
        Collections.reverse(neg);

        for (int i = 0; i < pos.size(); i++)
            pos.set(i, pos.get(i) * pos.get(i));

        int[] res = new int[nums.length];
        int i = 0, j = 0, k = 0;

        while (i < neg.size() && j < pos.size()) {
            if (neg.get(i) <= pos.get(j))
                res[k++] = neg.get(i++);
            else
                res[k++] = pos.get(j++);
        }

        while (i < neg.size()) res[k++] = neg.get(i++);
        while (j < pos.size()) res[k++] = pos.get(j++);

        return res;
    }
}
