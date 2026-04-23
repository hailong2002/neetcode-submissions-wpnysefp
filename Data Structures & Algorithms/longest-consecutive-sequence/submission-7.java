class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0; 
        // Arrays.sort(nums);
        int i =0;
        int curr = 1;
        int longest = 1;
        // while (i < nums.length && j < nums.length) {
        //     if (i == j) {
        //         j++;
        //         continue;
        //     }
        //     if (nums[j-1] == nums[j]) {
        //         j++;
        //         i++;
        //         continue;
        //     }
        //     if (nums[i] - nums[j] == -1) {
        //         curr += 1;
        //         j++;
        //     } else {
        //         i++;
        //         if (nums[j] - nums[j-1] > 1) {
        //             curr = 1;
        //         }
        //     }
        //     if (longest < curr) longest = curr;
        // }
        Set<Integer> arrSet = new HashSet<>();
        for (int n : nums) {
            arrSet.add(n);
        }
        while (i < nums.length) {
            int num = nums[i];
            int j = 0;
            if (!arrSet.contains(nums[i]-1)) {
                while (arrSet.contains(num+1)) {
                        curr++;
                        num = num + 1;
                }
                
            }
            if (curr > longest) longest = curr;
            curr = 1;
            i++;
        }

        return longest;
    }
}
