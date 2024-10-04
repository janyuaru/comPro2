
import java.util.Scanner;


public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        //String zero = "";
        while(true){
            String str = sc.nextLine();
            int L = str.length();
            if(L==0){
                //if(str.length(zero))
                break;
            } else {
                if(L>=max){
                    max = L;
                    longestStr = str;
                }
            }
        }
        System.out.println(longestStr);
    }
}
