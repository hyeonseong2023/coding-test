class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        
        while(true){
            int times = 0;
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    times++;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                    times++;
                }
            }
            if(times == 0) {
                System.out.println(cnt);
                return cnt;
            }
            cnt++;
        }
    }
}