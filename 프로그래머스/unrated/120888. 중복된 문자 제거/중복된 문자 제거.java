class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(answer.indexOf(my_string.substring(i, i + 1)) == -1){
                answer += my_string.substring(i, i + 1);
            }            
        }
        
        return answer;
    }
}