class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = 1;
        while (i < numbers.length) {
            j = 1;
            while (j < numbers.length) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i+1, j+1};
                } 
                j++;
            }
            i++;
        }
        return new int[]{};
    }
}
