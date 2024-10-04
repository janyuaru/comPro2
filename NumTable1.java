
import java.util.Scanner;


public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]a = new int[r+1][c+1];
        
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int k = sc.nextInt();
        
        for(int i=0; i<k; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p>0 && p<=r && q>0 && q<=c){
                System.out.print(a[p][q]);
            } else {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
