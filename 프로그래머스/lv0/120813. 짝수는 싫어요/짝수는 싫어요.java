class Solution {
    public int[] solution(int n) {

        // int[] answer = {};
        
        int count = 0;
        int odd = 0;
                
        odd = n % 2 == 0 ? n / 2 : n / 2 + 1;
        
		int[] answer = new int[odd];

		for (int i = 1; i <= n; i += 2) {
			answer[count] = i;
			count++;
		}
        
        return answer;
    }
}