import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            char charValue = a.charAt(i);
            if(Character.isUpperCase(charValue)){
                b.append(Character.toLowerCase(charValue));
            }else{
                b.append(Character.toUpperCase(charValue));
            }
        }

        System.out.print(b);
    }
}
