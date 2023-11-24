class Solution {
    public String solution(String my_string, int[][] queries) {
        String temp = "";
        String[] list = my_string.split("");
        
        for(int k = 0; k < queries.length; k++){
            for (int i = queries[k][1], j = queries[k][0]; i >= j; i--, j++) {
                temp =  list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        
        return String.join("", list);
    }
}