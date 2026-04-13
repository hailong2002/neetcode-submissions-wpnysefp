class Solution {
    public boolean isPalindrome(String s) {
        String cleanedText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String[] arr = cleanedText.replace(" ", "").split("");
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (Objects.equals(arr[i], arr[j])) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
