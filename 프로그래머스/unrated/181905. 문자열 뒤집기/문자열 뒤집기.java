class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int cnt = 0;

        String[] ans = my_string.split("");
        
        for(int i = 0; i < ans.length; i++){
            if(i < s || i > e){
                answer += ans[i];
            }else{
                answer += ans[e - cnt];
                cnt++;
            }
        }
        
        return answer;
    }
}