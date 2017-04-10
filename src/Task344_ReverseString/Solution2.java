package Task344_ReverseString;

public class Solution2 {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        for (int i = 0; i < word.length / 2; i++) {
            char tmp = word[i];
            word[i] = word[word.length - 1 - i];
            word[word.length - 1 - i] = tmp;
        }
        return new String(word);
    }
}
