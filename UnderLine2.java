
import java.util.Scanner;


public class UnderLine2 {
    static void line1(int k){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<k; i++){
            System.out.print("-");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            int k = sc.nextInt();
            System.out.println(str);
            line1(k);
            System.out.println("");
        }
    }
}
