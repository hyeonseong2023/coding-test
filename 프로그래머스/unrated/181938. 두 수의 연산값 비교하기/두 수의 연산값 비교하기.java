class Solution {
    public int solution(int a, int b) {
        
        int ab1 = Integer.parseInt(a + "" + b);
        int ab2 = a * b * 2;
        
        return ab1 > ab2 ? ab1 : ab2;
        
    }
}