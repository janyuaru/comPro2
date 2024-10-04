 
import java.util.Scanner;


public class CharSweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int L = str.length();
        char c1 = str.charAt(n);
        //System.out.println(c);
        if(m==1){
            for(int i=n; i<L; i++){
                char c2 = str.charAt(i);
                if(c1<=c2){
                    System.out.print(c2);
                }
            }
            for(int i=0; i<n; i++){
                char c2 = str.charAt(i);
                if(c1<=c2){
                    System.out.print(c2);
                }
            }
        } else {
            for(int i=n; i>=0; i--){
                char c2 = str.charAt(i);
                if(c1<=c2){
                    System.out.print(c2);
                }
            }
            for(int i=L-1; i>n; i--){
                char c2 = str.charAt(i);
                if(c1<=c2){
                    System.out.println(c2);
                }
            }
        }
        System.out.println("");
    }
}
