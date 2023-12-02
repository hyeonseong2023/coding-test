import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int cnt = 2;
        
        while(n != 1){
            if(n % cnt == 0){
                if(!ans.contains(cnt)) ans.add(cnt);
                n /= cnt;
                cnt = 2;
            } else {
                cnt++;
            }     
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < answer.length; i++) answer[i] = ans.get(i);
        
        return answer;
    }
}