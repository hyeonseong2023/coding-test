class Solution {
    public String solution(String n_str) {
        String answer = "";
        int a = 0;
        
        for(int i = 0; i < n_str.length(); i++){
            if(Integer.parseInt(n_str.substring(i, i+1)) != 0){
                a = i;
                break;
            }
        }
        
        for(int i = a; i < n_str.length(); i++){
            answer += n_str.substring(i, i+1);
        }
        
        return answer;
    }
}