class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int i = 0, j = 1;
        // while (i < numbers.length) {
        //     if (j > numbers.length - 1) {
        //         i++;
        //         j = i + 1;
        //     }
        //     if (numbers[i] + numbers[j] == target) {
        //         return new int[] {i+1, j+1};
        //     } 
        //     j++;
        // }
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[] {left+1, right+1};
            }
        }
        return new int[]{};
    }

   
}
