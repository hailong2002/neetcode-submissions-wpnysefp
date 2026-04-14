class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int right = heights.length - 1;
        int left = 0;
        while (left < right) {
            int height = heights[left] < heights[right] ? heights[left] : heights[right];
            int area = (right-left)*height;
            if (area > max) {
                max = area;
            } else {
                if (heights[left] < heights[right]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return max;
    }
}
