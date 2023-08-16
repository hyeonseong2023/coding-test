import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> arr = new ArrayList<String>();
            
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].indexOf("ad")==-1){
                arr.add(strArr[i]);
            }
        }
        
        String[] answer = new String[arr.size()];

        int size = 0;

        for(String temp : arr){
            answer[size++] = temp;
        }
                
        return answer;
    }
}