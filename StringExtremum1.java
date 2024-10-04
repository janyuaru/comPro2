
import java.util.Scanner;


public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String x = new String();
        String y = new String();
        while(true){
            String str = sc.nextLine();
            int L = str.length();
            if(L==0){
                break;
            }
            if(n==1){
                if(L>=max){
                    max=L;
                    x = str;
                }
            }
            if(n==2){
                if(L<=min){
                    min=L;
                    y=str;
                }
            }
        }
        if(n==1){
            System.out.println(max);
            System.out.println(x);
        }
        if(n==2){
            System.out.println(min);
            System.out.println(y);
        }
    }
}
