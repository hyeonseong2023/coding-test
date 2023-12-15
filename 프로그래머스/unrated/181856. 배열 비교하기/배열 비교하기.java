class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int arr11 = 0;
        int arr22 = 0;
       
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                arr11 += arr1[i];
                arr22 += arr2[i];
            }

            return arr11 == arr22 ? 0 : arr11 > arr22 ? 1 : -1; 
            
        } else {
            return arr1.length > arr2.length ? 1 : -1;              
        }

    }
}