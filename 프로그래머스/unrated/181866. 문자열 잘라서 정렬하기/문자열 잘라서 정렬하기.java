import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        List<String> strList = new ArrayList<>(Arrays.asList(answer));
        strList.removeAll(Arrays.asList(""));
        answer = strList.toArray(new String[0]);
        
        return answer;
    }
}