
import java.util.Scanner;


public class Partition1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        
        for(int i=1; i<=n; i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        
        int middle = (n/2)+1;
        int center = 0;
        
        for(int i=1; i<=n; i++){
            if(i==middle){
                center=a[i];
            }
        }
        
        for(int i=1; i<=n; i++){
            if(a[i]<=center){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        
        for(int i=1; i<=n; i++){
            if(a[i]>center){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}
