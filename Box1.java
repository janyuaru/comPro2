
import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        
        for(int i=1; i<n+1; i++){
            int x = scan.nextInt();
            b[i] = x;
        }
        
        for(int i=1; i<n+1; i++){
            a[i] = 0;
        }
        
        int k = scan.nextInt();
        
        for(int i=1; i<k+1; i++){
            int A = scan.nextInt();
            int Q = scan.nextInt();
            int B = scan.nextInt();
            if(A==1){
                a[B] += Q;
                if(a[B]>b[B]){
                    System.out.print("-1");
                    a[B] -= Q;
                    System.out.println();
                } else {
                    System.out.println(a[B]);
                    /*
                    for(int j=1; j<n+1; j++){
                        System.out.print(a[j]+" ");
                    }
                    */
                }
            }
            //System.out.println();  
            
            if(A==2){
                if(Q<=a[B]){
                    a[B] -= Q;
                    System.out.println(a[B]);
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}
