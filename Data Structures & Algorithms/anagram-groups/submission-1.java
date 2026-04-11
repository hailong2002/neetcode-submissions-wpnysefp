class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        List<String> newArr = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = "";
            for (Character c : charArray) {
               key += c;
            }
   
            List<String> group = new ArrayList<>();
            if (map.get(key) != null) {
                group = map.get(key);
            }
            group.add(str);
            map.put(key, group);
        }

        for (String key : map.keySet()) {
            results.add(map.get(key));
        }
        return results;
    }

    
} 
