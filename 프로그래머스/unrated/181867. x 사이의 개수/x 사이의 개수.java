class Solution {
    public int[] solution(String myString) {
        String[] ans = myString.split("x");        
        int[] answer;
        
        if(myString.substring(myString.length() - 1).equals("x")){
            answer = new int[ans.length+1];
        } else{
            answer = new int[ans.length];
        }
    
        
        for(int i = 0; i < ans.length; i++){
            answer[i] = ans[i].length();   
        }
            
        return answer;
    }
}