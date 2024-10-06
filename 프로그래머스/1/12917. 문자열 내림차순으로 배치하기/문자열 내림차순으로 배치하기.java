import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        
        return new String(chars);
 
    }
}