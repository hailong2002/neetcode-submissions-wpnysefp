class Solution {
    public boolean isAnagram(String s, String t) {
        for (String str : s.split("")) {
            String string = t;
            int index = t.indexOf(str);
            if (index < 0) return false;
            t = string.substring(0, index) + t.substring(index+1, t.length());

        }
        return t.isEmpty();

    }

}
