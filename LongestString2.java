
import java.util.Scanner;


public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longestStr = " ";
        int max = Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
             String str = sc.nextLine();
             int L = str.length();
             if(L > max){
                 max = L;
                 longestStr = str;
             }
        }
        System.out.println(longestStr);
    }
}
