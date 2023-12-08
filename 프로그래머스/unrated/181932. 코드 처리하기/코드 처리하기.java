class Solution {
    public String solution(String code) {
        
        String answer = "";
        String mode = "0";
        String[] codeArr = code.split("");
        
        for(int i = 0; i < codeArr.length; i++){             
            if(mode.equals("0")){
                if(!codeArr[i].equals("1")){
                    if(i % 2 == 0) answer += codeArr[i];
                }else{
                    mode = "1";
                }
            }else if(mode.equals("1")){
                if(!codeArr[i].equals("1")){
                    if(i % 2 == 1) answer += codeArr[i];
                }else{
                    mode = "0";
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer ;
    }
}