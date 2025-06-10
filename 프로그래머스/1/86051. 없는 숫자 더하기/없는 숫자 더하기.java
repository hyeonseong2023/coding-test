class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < num.length; i++){
            for(int number : numbers){
                if(num[i] == number) num[i] = 0;
            }
        }
        
        for(int i : num) answer += i;
        
        return answer;
    }
}