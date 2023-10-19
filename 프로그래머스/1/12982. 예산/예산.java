import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        // 1. 낮은 순으로 정렬
        // 2. 앞에서부터 하나씩 더해가면서 바퀴마다 answer++
        // 3. 숫자 넘으면 나가고 반환
        // ** sort, while문 사용
        int answer = 0;
        int sum = 0;
        
        if(Arrays.stream(d).sum()<budget) return d.length;
        
        Arrays.sort(d);
        
        while(sum<budget){
            sum += d[answer];
            answer++;
            System.out.println(sum);
        }
        
        if(sum==budget){
            return answer;
        }
        
        
        return --answer;
    }
}