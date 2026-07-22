class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty())
            return false;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }
            if (toLowerCase(s.charAt(left)) != toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }
}
