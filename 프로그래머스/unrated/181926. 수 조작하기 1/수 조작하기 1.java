class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        String str = "";
        
        for(int i = 0; i < control.length(); i++){
            str = control.substring(i, i + 1);
            if(str.equals("w")){
                answer += 1;
            } else if(str.equals("s")){
                answer -= 1;
            } else if(str.equals("d")){
                answer += 10;
            } else {
                answer -= 10;
            }
        }
        
        return answer;
    }
}