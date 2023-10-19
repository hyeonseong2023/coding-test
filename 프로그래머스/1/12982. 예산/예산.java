import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        int sum = 0;
        
        if(Arrays.stream(d).sum()<budget) return d.length;
        
        Arrays.sort(d);
        
        while(sum<budget){
            sum += d[answer];
            answer++;
        }
        
        if(sum==budget) return answer;
        
        return --answer;
    }
}