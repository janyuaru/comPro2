
import java.util.Scanner;


public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(true){
            String str = sc.nextLine();
            int L = str.length();
            if(L==0){
                break;
            } else {
                if(L>=max){
                    if(L!=max){
                        count=0;
                    }
                    max=L;
                    count++;
                } 
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
