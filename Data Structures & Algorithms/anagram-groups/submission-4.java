class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for(String str: strs) {
            char[] charArr = str.toCharArray();

            Arrays.sort(charArr);

            String sortedStr = Arrays.toString(charArr);

            if(!myMap.containsKey(sortedStr)) {
                myMap.put(sortedStr, new ArrayList<>());
            }

            myMap.get(sortedStr).add(str);
        }

        // List<List<String>> result = myMap.values();

        return new ArrayList<>(myMap.values());
    }
}
