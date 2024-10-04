
import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        
        for(int i=0; i<n; i++){
            int y = scan.nextInt();
            a[i] = y;
        }
        
        int x = scan.nextInt();
        int[] b = new int[n+1];
        for(int i=0; i<n; i++){
            //System.out.print((x+a[i]-1)+" ");
            b[i] = (x+a[i]-1);
            //System.out.print(b[i]+" ");
        }
        //System.out.println();
        
        
        int u = scan.nextInt();
        int[] c = new int[u+1];
        for(int i=0; i<u; i++){
            int p = scan.nextInt();
            c[i] = p;
            //System.out.print(c[i]+" ");
        }
        //System.out.println();
        int count = 0;
        for(int i=0; i<u; i++){
            for (int j=0; j<n; j++){
                if(b[j]<c[i]){
                    System.out.print((j+1)+" ");
                    count+=1;
                }
            }
            if(count==0){
                System.out.print("full");
            }
            count=0;
            System.out.println();
        }
    }
}
