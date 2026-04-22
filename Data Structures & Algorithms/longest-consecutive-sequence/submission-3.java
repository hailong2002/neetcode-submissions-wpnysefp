class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0; 
        Arrays.sort(nums);
        int i =0, j = 1;
        int curr = 1;
        int longest = 1;
        while (i < nums.length && j < nums.length) {
            if (i == j) {
                j++;
                continue;
            }
            if (nums[j-1] == nums[j]) {
                j++;
                i++;
                continue;
            }
            if (nums[i] - nums[j] == -1) {
                curr += 1;
                j++;
            } else {
                i++;
                if (nums[j] - nums[j-1] > 1) {
                    curr = 1;
                }
            }
            if (longest < curr) longest = curr;
        }
        return longest;
    }
}
