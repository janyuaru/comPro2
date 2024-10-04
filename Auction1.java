
import java.util.Scanner;


public class Auction1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        
        int k = scan.nextInt();
        int[] b = new int[n*k];
        
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                int y = scan.nextInt();
                if(y>a[j]){
                    System.out.print(y+" ");
                    a[j] = y;
                } else if(y<=a[j]){
                    System.out.print(a[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
