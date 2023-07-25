class Solution {
    public int solution(int n, int k) {
        
        int yang = 12000;
        int drink = 2000;
            
        return n < 10 ? yang * n + drink * k : yang * n + drink * k - n / 10 * drink;
    }
}