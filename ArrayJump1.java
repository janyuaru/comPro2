
import java.util.Scanner;


public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        
        for(int i=1; i<=n; i++){
            a[i] = scan.nextInt();
        }
        
        int count = 0;
       
        for(int i=1; i<=n; i++){
            if(i==1){
                System.out.println(i+" "+a[i]+" ");
            } else {
                System.out.println(i+" "+a[i]+" ");
            }
            i+=(a[i]-1);
            if(i>n-1){
                System.out.println("out of bounds");
            }
            count++;
            if(count==5){
                break;
            }
        }
    }
}
