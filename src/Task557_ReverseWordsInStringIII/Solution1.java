package Task557_ReverseWordsInStringIII;

import java.util.StringTokenizer;

public class Solution1 {
    public String reverseWords(String s) {
        if (s == null) return null;

        String newStr = "";
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuffer buffer;
        while (tokenizer.hasMoreTokens()) {
            buffer = new StringBuffer(tokenizer.nextToken());
            newStr += buffer.reverse();
            if (tokenizer.hasMoreTokens())
                newStr += " ";
        }
        return newStr;
    }
}