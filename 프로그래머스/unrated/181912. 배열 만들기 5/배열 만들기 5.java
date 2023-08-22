import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            if(Integer.parseInt(intStrs[i].substring(s, s + l)) > k){
                ans.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
            }
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < ans.size(); i++) answer[i] = ans.get(i);
        
        return answer;
    }
}