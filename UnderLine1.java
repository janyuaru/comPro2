
import java.util.Scanner;


public class UnderLine1 {
    static void line1(){
        for(int i=0; i<20; i++){
            System.out.print("-");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            System.out.println(str);
            line1();
            System.out.println();
        }
    }
}
