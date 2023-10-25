import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        
        while(n != 1){
            ansList.add(n);
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = 3 * n + 1;
            }  
        }
        ansList.add(1);
        
        int answer[] = new int[ansList.size()];
        
        for(int i = 0; i < ansList.size(); i++){
            answer[i] = ansList.get(i).intValue();
        }
        
        return answer;
    }
}