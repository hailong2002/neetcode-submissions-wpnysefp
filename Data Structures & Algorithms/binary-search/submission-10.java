class Solution {
    public int search(int[] nums, int target) {
       int left = 0;
       int right = nums.length - 1;
       if (nums.length < 2) {
         return nums[0] == target ? 0 : -1;
       }
       return binarySearch(nums, target, left, right);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        int mid = (right + left + 1) / 2;
        if (left > right) return -1;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            left = mid + 1;
            return binarySearch(nums, target, left, right);
        }  else if (nums[mid] > target) {
            right = mid - 1;
            return binarySearch(nums, target, left, right);
        }
        return -1;
    }

}
