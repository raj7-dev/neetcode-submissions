class Solution { 
    public boolean isAnagram(String s, String t) { 
        // 1. Defensive programming: Handle null checks upfront
        if (s == null || t == null) {
            return s == t; // returns true if both are null, false if only one is null
        }

        // 2. Early exit optimization 
        if (s.length() != t.length()) {
            return false; 
        }

        int[] charCounts = new int[26]; 


        for (int i = 0; i < s.length(); i++) { 
            charCounts[s.charAt(i) - 'a']++; 
            charCounts[t.charAt(i) - 'a']--; 
        } 

        // 6. Modern Java / Readability approach:
        for (int count : charCounts) { 
            if (count != 0) {
                return false; 
            }
        } 

        return true; 
    } 
}
