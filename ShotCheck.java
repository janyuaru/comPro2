
import java.util.Scanner;


public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<K; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r>0 && c>0 && r>=R && c<=C){
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
