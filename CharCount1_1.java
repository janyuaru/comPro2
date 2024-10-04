
import java.util.Scanner;


public class CharCount1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
        int[] c = new int[100];
        int[] q = new int[100];
        
        for(int i=0; i<a; i++){
            int b = str.charAt(i);
            q[b]++;
            c[b] = b;
        }
        
        for(int j=0; j<100; j++){
            if(c[j]>0){
                System.out.print((char)c[j]+" "); 
                System.out.println(q[j]);
            }
        }
    }
}
