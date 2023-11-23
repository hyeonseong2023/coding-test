import java.util.*;

class Solution {
    public String solution(String s) {     
        
        String answer = "";
        
        String[] ans = s.split("");

        List<String> list = new ArrayList<>();
 
        for (String i : ans) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                s = s.replace(i, "");
            }
        }
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        
        return s;
    }
}