package Task557_ReverseWordsInStringIII;

public class Solution3 {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words)
            res.append(new StringBuffer(word).reverse().toString()).append(" ");
        return res.toString().trim();
    }
}