class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int max = arr[i];
            int maxKey = 0;
            for (int j : map.keySet()) {
                if (map.get(j) > max) {
                    max = map.get(j);
                    arr[i] = j;
                    maxKey = j;
                }
            }
            map.remove(maxKey);
        }
        return arr;
        
    }
}
