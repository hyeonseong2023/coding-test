import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (!list.contains(i)) list.add(i);
        }
        
        for(int i = 0; i < answer.length; i++) answer[i] = -1;
        
        for(int i = 0; i < (list.size() > k ? k : list.size()); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}