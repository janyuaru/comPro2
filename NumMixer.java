
import java.util.Scanner;


public class NumMixer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = scan.nextInt();
        }
        
        int q =scan.nextInt();
        
        for(int i=0; i<n; i++){
            if(q>0){
                System.out.print(a[i]+" ");
                System.out.print(b[n-1-i]+" ");
            }
            if(q<=0){
                System.out.print(b[n-1-i]+" ");
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}
