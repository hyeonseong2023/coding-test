import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        int temp = 1;
        
        for(int i = 0; i < arr.length; i++) ans.add(arr[i]);
        
        // if(arr.length == 1) return arr;
        
        while(true){
            if(temp > ans.size()){
                ans.add(0);
            } else if(temp < ans.size()) {
                temp *= 2;
            } else {
                break;
            }
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < ans.size(); i++) answer[i] = ans.get(i);
        
        return answer;
    }
}