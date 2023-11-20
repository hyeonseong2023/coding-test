class Solution {
    public int solution(String my_string) {
        String[] cut = my_string.split(" ");
        int answer = Integer.parseInt(cut[0]);
        
        for(int i = 1; i < cut.length; i += 2){
            if(cut[i].indexOf("+") != -1){
                answer += Integer.parseInt(cut[i + 1]);
            } else {
                answer -= Integer.parseInt(cut[i + 1]);
            }
        }
        
        return answer;

    }
}