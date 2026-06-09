class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>(); // 1:1 2:2 3:3
        List<Integer>[] list = new List[nums.length + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : count.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = list.length-1; index < k && i > 0; i--) {
            for (int num : list[i]) {
                res[index++] = num;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
