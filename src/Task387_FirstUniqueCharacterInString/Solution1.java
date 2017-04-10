package Task387_FirstUniqueCharacterInString;

public class Solution1 {
    public int firstUniqChar(String s) {
        if (s != null && !s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                    return i;
            }
        }
        return -1;
    }
}