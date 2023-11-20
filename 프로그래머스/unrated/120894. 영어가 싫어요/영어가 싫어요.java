class Solution {
    public long solution(String numbers) {
        String ansTemp = "";

        while(numbers.length() != 0){
            String numTemp = numbers.substring(0, 3);
            if(numTemp.equals("zer")){
                ansTemp += "0";
                numbers = numbers.substring(4);
            }else if(numTemp.equals("one")){
                ansTemp += "1";
                numbers = numbers.substring(3);
            }else if(numTemp.equals("two")){
                ansTemp += "2";
                numbers = numbers.substring(3);
            }else if(numTemp.equals("thr")){
                ansTemp += "3";
                numbers = numbers.substring(5);
            }else if(numTemp.equals("fou")){
                ansTemp += "4";
                numbers = numbers.substring(4);
            }else if(numTemp.equals("fiv")){
                ansTemp += "5";
                numbers = numbers.substring(4);
            }else if(numTemp.equals("six")){
                ansTemp += "6";
                numbers = numbers.substring(3);
            }else if(numTemp.equals("sev")){
                ansTemp += "7";
                numbers = numbers.substring(5);
            }else if(numTemp.equals("eig")){
                ansTemp += "8";
                numbers = numbers.substring(5);
            }else if(numTemp.equals("nin")){
                ansTemp += "9";
                numbers = numbers.substring(4);
            }
        }
        return Long.parseLong(ansTemp);
    }
}