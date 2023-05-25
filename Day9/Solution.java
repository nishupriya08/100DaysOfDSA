package Day9;

public class Solution {
    public void reverseString(char[] s) {
        char[] newArray = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            newArray[i] = s[s.length - i - 1];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = newArray[i];
        }
    }
}
