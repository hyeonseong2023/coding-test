class Solution {
    public long solution(long n) {

        long m = n/2;
        long l = 1;
        while(m<=n){
            if(l*l==n){
                return (l+1)*(l+1);
            }
            l++;
            m++;
        }
        return -1;
    }
}