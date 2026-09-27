class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for(String str: strs) {
            String freqStr = getFrequencyString(str);

            if(!myMap.containsKey(freqStr)) {
                myMap.put(freqStr, new ArrayList<>());
            }

            myMap.get(freqStr).add(str);
        }


        return new ArrayList<>(myMap.values());
    }


    public String getFrequencyString(String str) {
        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        return Arrays.toString(freq);
    }

}
