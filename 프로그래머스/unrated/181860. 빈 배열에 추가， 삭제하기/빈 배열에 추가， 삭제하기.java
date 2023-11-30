import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int j = 0; j < flag.length; j++){
            if(flag[j]){
                for(int i = 0; i < arr[j] * 2; i++) ans.add(arr[j]);
            } else {
                for(int i = 0; i < arr[j]; i++) ans.remove(ans.size() - 1);
            }
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < answer.length; i++) answer[i] = ans.get(i);
        
        return answer;
    }
}