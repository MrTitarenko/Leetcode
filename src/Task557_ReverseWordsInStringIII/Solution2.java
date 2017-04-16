package Task557_ReverseWordsInStringIII;

public class Solution2 {
    public String reverseWords(String s) {
        if (s == null)
            return null;

        String newStr = "";
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                int k = i - 1;
                for (; k >= tmp; k--) {
                    newStr += s.charAt(k);
                }
                newStr += " ";
                tmp = i + 1;
            } else if (i == s.length() - 1) {
                int k = i;
                for (; k >= tmp; k--) {
                    newStr += s.charAt(k);
                }
            }
        }
        return newStr;
    }
}