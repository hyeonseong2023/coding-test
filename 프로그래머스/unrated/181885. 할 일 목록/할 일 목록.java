import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answerList = new ArrayList<>();

        int c = 0;
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answerList.add(todo_list[i]);
                c++;
            }
        }
        String[] answer = answerList.toArray(new String[0]);
        
        return answer;
    }
}