class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        int length = 0;
        for (String str : strs) {
            length = str.length();
            encodedString.append(length).append("#").append(str);
        }
        return encodedString.toString();
    }


    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int length = 0;
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            length = Integer.parseInt(str.substring(i,j));
            String string = str.substring(j+1, length + j + 1);
            decodedStrings.add(string);
            i = length + j + 1;
        }
        return decodedStrings;
    }

    
}
