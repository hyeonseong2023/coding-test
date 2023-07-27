class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i = 0; i < num_list.length; i++){
            int a = num_list[i] % 2 == 0 ? answer[0]++ : answer[1]++;
            //     answer[0]++;
            // } else{
            //     answer[1]++;
            // }
        }

        return answer;
        
    }
}