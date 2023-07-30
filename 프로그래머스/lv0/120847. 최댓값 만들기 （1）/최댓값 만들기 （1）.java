class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int j = 0; j<numbers.length; j++){
            for(int i = 0; i<numbers.length; i++){
                if(i != j){
                    if(numbers[j] * numbers[i] > answer){
                        answer = numbers[j] * numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
}