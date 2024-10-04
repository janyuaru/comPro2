
import java.util.Scanner;


public class CountBetween1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0; i<n; i++){
            if(a[i]>=x1 && a[i]<=x2){
                count1++;
            } else if(a[i]>=y1 && a[i]<=y2){
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
