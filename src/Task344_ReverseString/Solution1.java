package Task344_ReverseString;

public class Solution1 {
    public String reverseString(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        return String.valueOf(stringBuffer.reverse());
    }
}
