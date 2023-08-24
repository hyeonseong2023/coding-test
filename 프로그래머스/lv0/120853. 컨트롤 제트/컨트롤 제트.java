class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] ans = s.split(" ");
        
        for(int i = 0; i < ans.length; i++){
            
            if(ans[i].equals("Z")){
                answer -= Integer.parseInt(ans[i - 1]);
            }else{
                answer += Integer.parseInt(ans[i]);
            }
            
        }
        
        return answer;
    }
}