
import java.util.Scanner;


public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String str = sc.next();
        char a = str.charAt(0);
        int v = a;
        System.out.println(v);
        */
        
        String str = sc.next();
        int a = str.length();
        System.out.println(str);
        int[] c = new int[100];
        System.out.println(c);
        
        for(int i=0; i<a; i++){
            int b = str.charAt(i);
            System.out.print(b);
            System.out.print((char) b);
            c[i] = 0;
            System.out.println(c[i]);
        }
    }
}
