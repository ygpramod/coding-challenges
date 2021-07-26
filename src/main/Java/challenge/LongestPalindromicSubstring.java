package challenge;

public class LongestPalindromicSubstring {

    public String find(String string) {
        String longestPalindromicSubstring = "";
        for (int i = 0; i < string.length(); i++) {
            int j = i + 1;
            if (j == string.length())
                j--;
            String palindromicSubstring = helper(i, i, string);
            if (palindromicSubstring.length() > longestPalindromicSubstring.length())
                longestPalindromicSubstring = palindromicSubstring;

            if (string.charAt(i) == string.charAt(j) && i != j)
                palindromicSubstring = helper(i, j, string);
            if (palindromicSubstring.length() > longestPalindromicSubstring.length())
                longestPalindromicSubstring = palindromicSubstring;
        }

        return longestPalindromicSubstring;
    }

    private String helper(int from, int to, String string) {
        String longestSubstring = "";
        if(to < string.length())
            longestSubstring = string.substring(from, to + 1);
        int j = from - 1, k = to + 1;
        while (j >= 0 && k < string.length()) {
            if (string.charAt(j) != string.charAt(k))
                break;
            longestSubstring = string.substring(j, k + 1);
            j--;
            k++;
        }
        return longestSubstring;
    }
}
