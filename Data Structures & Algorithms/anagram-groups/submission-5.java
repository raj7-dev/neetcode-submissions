class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsListMap = new HashMap<>();
        for (String string : strs) {
            int[] charCount = new int[26];

            for (int i = 0; i < string.length(); i++) {
                charCount[string.charAt(i) - 'a']++;
            }
            StringBuilder strBuilder = new StringBuilder();
            for (int charValue : charCount) {
                strBuilder.append("#");
                strBuilder.append(charValue);
            }
            String key = strBuilder.toString();

            anagramsListMap.computeIfAbsent(key, k -> new ArrayList()).add(string);
        }

        return new ArrayList(anagramsListMap.values());
    }
}
