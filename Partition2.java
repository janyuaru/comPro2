
import java.util.Scanner;


public class Partition2 {
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
        
        int count = 0;
        int[] b = new int[n+1];
        
        for(int i=1; i<=n; i++){
            if(a[i]<=center){
                //System.out.print(a[i]+" ");
                //b[i] = a[i];
                count++;
                b[count] = a[i];
                //System.out.print(b[i]+" ");
            }
        }
        //System.out.println();
        
        int stand = (count/2)+1;
        //System.out.println(stand);
        
        int base = 0;
        
        for(int i=1; i<=count; i++){
            if(i==stand){
                base=b[i];
            }
            //System.out.print(b[i]+" ");
        }
        //System.out.println(base);
        
        for(int i=1; i<=count; i++){
            if(b[i]<=base){
                System.out.print(b[i]+" ");
            } 
        }
        System.out.println();
        
        for(int i=1; i<=count; i++){
            if(b[i]>base){
                System.out.print(b[i]+" ");
            } 
        }
        System.out.println();
    }
}