class Solution {
    public int solution(int[] sides) {
        
        int n = 0; // 가장 큰 수가 저장될 곳
        int m = 0; // 가장 큰 수의 인덱스번호가 저장될 곳
        
        for(int i = 0; i < sides.length; i++){
            if(sides[i] > n){
                n = sides[i];
                m = i;
            }
        }
        
        switch(m){
            case 0 : return sides[1] + sides[2] > sides[0] ? 1 : 2;
            case 1 : return sides[0] + sides[2] > sides[1] ? 1 : 2;
            case 2 : return sides[1] + sides[0] > sides[2] ? 1 : 2;
            default : return 0;
        }

    }
}