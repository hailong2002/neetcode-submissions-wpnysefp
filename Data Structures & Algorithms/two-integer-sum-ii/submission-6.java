class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = 1;
        while (i < numbers.length) {
            if (j > numbers.length - 1) {
                i++;
                j = i + 1;
            }
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i+1, j+1};
            } 
            j++;
        }
        return new int[]{};
    }

   
}
