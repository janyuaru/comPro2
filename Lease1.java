
import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        
        for(int i =0; i<n; i++){
            int y = scan.nextInt();
            a[i] = y;
        }
        
        int x = scan.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print((x+a[i]-1)+" ");
        }
        System.out.println();
    }
}
