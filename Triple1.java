
import java.util.Scanner;


public class Triple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]a = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int v = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<r; i++){
            //count = 0;
            for(int j=0; j<c; j++){
                if(a[i][j]==v){
                    count++;
                } else {
                    count=0;
                }
                if(count==3){
                    System.out.print(i+1+" ");
                    count=0;
                    break;
                }
            }
        }
    }
}
