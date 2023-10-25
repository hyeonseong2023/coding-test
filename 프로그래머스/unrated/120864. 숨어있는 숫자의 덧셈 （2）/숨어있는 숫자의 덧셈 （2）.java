class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String intStr = my_string.replaceAll("[^0-9]", " ");
        String ans[] = intStr.split(" ");
        
        for(String a : ans){
            if(!a.equals("")) answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}