class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] ans = my_string.split("");
        
        for(int i = 0; i < indices.length; i++){
            ans[indices[i]] = "";
        }
        
        for(String temp : ans){
            answer += temp;
        }
        
        return answer;
    }
}