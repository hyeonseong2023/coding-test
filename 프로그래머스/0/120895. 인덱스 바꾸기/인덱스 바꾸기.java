class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String numA = String.valueOf(my_string.charAt(num1));
        String numB = String.valueOf(my_string.charAt(num2));
        
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                answer += numB;
            } else if(i == num2){
                answer += numA;
            } else {
                answer += my_string.substring(i,i+1);
            }
        }
        
        return answer;
    }
}