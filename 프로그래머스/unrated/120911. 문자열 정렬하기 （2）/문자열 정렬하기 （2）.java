import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        String ans[] = my_string.split("");
        
        Arrays.sort(ans);
        
        for(String temp : ans)
            answer += temp;     
        
        return answer;
    }
}