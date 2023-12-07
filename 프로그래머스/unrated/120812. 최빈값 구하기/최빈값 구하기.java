import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] array2 = new int[1000];
        int max=0;
		int mk=0;

		if (array.length == 1) return array[0];

		for (int i = 0; i < array.length; i++) array2[array[i]]++;
		
		for(int i =0; i < array2.length; i++) {
			if(max < array2[i]) {
				max=array2[i];
				mk=i;
			}
		}
		
		for(int i = 0; i < array2.length; i++) {
			if(i != mk) {
				if(array2[i] == max) return -1;
			}
		}
		
		answer = mk;
		
        
        return answer;
    }
}