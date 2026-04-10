class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int i = 0, j = 1;
        while (i < nums.length - 1) {
            if (j > nums.length - 1) {
                i++;
                j = i + 1;
                if (i == nums.length - 1) break;
            } 
            if (nums[i] == nums[j]) return true;
            j++;
        }
        return false;
    }
}