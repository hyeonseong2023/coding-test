class Solution {
    public int solution(int[] numbers, int n) {
        
        int answer = 0;
        int count = 0;
        
        while(answer <= n){
            answer += numbers[count];
            count++;
        }
        
        return answer;
    }
}