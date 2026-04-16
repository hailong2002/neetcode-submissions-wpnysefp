class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int[] lefts = new int[nums.length];
        int[] rights = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     int product = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (j == i) {
        //             continue;
        //         }
        //         product = product * nums[j];    
        //     }
        //     results[i] = product;
        // }
        int left = 1;
        lefts[0] = 1; rights[rights.length-1] = 1; 
        for (int i = 1; i < nums.length; i++) {
            left = left * nums[i-1];    
            lefts[i] = left;
        }
        int right = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            right = right * nums[i+1];    
            rights[i] = right;
        }
        for (int i = 0; i < results.length; i++) {
            results[i] = lefts[i] * rights[i];
        }
        return results;
    }
}  
