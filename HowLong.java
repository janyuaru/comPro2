
import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            arr[i] = x;
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        
        for(int i=0; i<n; i++){
            if(i>=a-1 && arr[i]==0){
                break;
            } else if(i>=a-1 && arr[i]!=0){
                countA++;
            }
        }
    
        for(int i=0; i<n; i++){
            if(i>=b-1 && arr[i]==0){
                break;
            } else if(i>=b-1 && arr[i]!=0){
                countB++;
            }
        }
        
        for(int i=0; i<n; i++){
            if(i>=c-1 && arr[i]==0){
                break;
            } else if(i>=c-1 && arr[i]!=0){
                countC++;
            }
        }
        
        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);
    }
}
