
import java.util.Scanner;


public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] a = new int[R+1][C+1];
        
        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int L = sc.nextInt();
        int count = 1;
        int ago = -1;
        
        for(int i=0; i<L; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r<=R && r>0 && c<=C && c>0){
                if(a[r][c]==ago){
                    System.out.print("*");
                } else {
                    System.out.print(a[r][c]);
                    ago = a[r][c];
                }
                count=0;
            } else {
                count++;
                if(count<2){
                    System.out.println();
                    ago=-1;
                }
            }
        }
    }
}
