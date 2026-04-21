class Solution {
   public int lengthOfLongestSubstring(String s) {
    int max = 1;
    int i = 0, j = 1;
    int currLength = 1;
    if (s.isEmpty()) return 0;
    StringBuilder curr = new StringBuilder(String.valueOf(s.charAt(i)));
    while (j < s.length()) {
      if (s.charAt(i) != s.charAt(j) && !curr.toString().contains(String.valueOf(s.charAt(j)))) {
        currLength += 1;
        curr.append(s.charAt(j));
      } else {
        currLength = 1;
        i++;
        j = i;
        curr = new StringBuilder(String.valueOf(s.charAt(i)));
      }
      if (currLength > max) max = currLength;
      j++;
    }
    return max;
  
  }
}
