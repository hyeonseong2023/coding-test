import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] be = before.toCharArray();
        Arrays.sort(be);
        
        char[] af = after.toCharArray();
        Arrays.sort(af);
                    
        return Arrays.equals(be, af) ? 1 : 0;
        
    }
}