class Solution {
    public int solution(String num_str) {
        int answer = 0;
		String[] arrS = new String[num_str.length()];
		int[] arrN = new int[num_str.length()];
		arrS = num_str.split("");
		
		for(int i = 0; i < num_str.length(); i++) {
			arrN[i] = Integer.parseInt(arrS[i]);
			answer += arrN[i];
		}
                
        return answer;
    }
}