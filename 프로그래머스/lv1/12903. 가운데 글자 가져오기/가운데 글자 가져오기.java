class Solution {
    public String solution(String s) {
        int str = s.length();
                       
        return str % 2 == 0 ? s.substring(str / 2 - 1, str / 2 + 1) : s.substring(str / 2, str / 2 + 1);
        
    }
}