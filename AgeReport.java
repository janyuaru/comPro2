
import java.util.Scanner;


public class AgeReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int[]b = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(b[i]>=x && b[i]<=y){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.print("There are ");
        System.out.print(count);
        System.out.print(" persons in age range of ");
        System.out.print(x);
        System.out.print(" to ");
        System.out.println(y);
    }
}
