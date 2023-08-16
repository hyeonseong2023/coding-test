class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2];
        
        int a = 0;
        int b = intervals[0][1]-intervals[0][0] + 1;
        
        for(int i = 0; i < arr.length; i++){
            if(intervals[0][0] <= i && intervals[0][1] >= i){
                answer[a] = arr[i];
                a++;
            }
            
            if(intervals[1][0] <= i && intervals[1][1] >= i){
                answer[b] = arr[i];
                b++;
            }
        }
        
        return answer;
    }
}