class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String temp = "";
        
        for(int i = 0; i < my_string.length(); i++){
            temp += my_string.substring(i, i + 1);
            if(temp.equals(is_prefix)) return 1;
        }
        
        return answer;
    }
}