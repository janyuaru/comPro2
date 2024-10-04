
import java.util.Scanner;


public class OutBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n+1];
        
        
        for(int i=0; i<n; i++){
            int v = scan.nextInt();
            a[i] = v;
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean count = false;
        
        for(int i=0; i<n; i++){
            if(a[i]<x){
                System.out.print(a[i]+" ");
                count = true;
            } else if(a[i]>y) {
                System.out.print(a[i]+" ");
                count = true;
            }
        }
        if(count==false){
            System.out.print("no data");
        }
        System.out.println();
    }
}
