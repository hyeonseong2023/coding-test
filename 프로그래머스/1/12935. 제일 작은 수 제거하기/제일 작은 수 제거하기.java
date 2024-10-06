import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        int min = arr[0];
        
        if(arr.length == 1){
            answer = new int[] {-1};
        } else{
            
            int[] ans = Arrays.copyOf(arr, arr.length);
            Arrays.sort(ans);
            min = ans[0];
            
            List<Integer> numList = new ArrayList<>();
            
            for (int value : arr) {
                numList.add(value);
            }

            numList.remove((Integer) min);
            
            answer = new int[numList.size()];
            
            for(int i = 0; i < numList.size(); i++) {
                answer[i] = numList.get(i);
            }
            
        }
        
        return answer;
    }
}