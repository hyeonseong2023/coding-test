class Solution {
    public int solution(int[] num_list) {
        
        int multi = 1;
        int sumx = 0;
        
        for(int i = 0; i < num_list.length; i++){
            multi *= num_list[i];
            sumx += num_list[i];
        }        
        
        return multi < sumx * sumx ? 1 : 0;
    }
}