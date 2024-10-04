
import java.util.Scanner;


public class StartBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][]a = new int[R][C];
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int k = sc.nextInt();
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;
        int point5 = 0;
        for(int i=0; i<k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r>0 && c>0 && r<=R && c<=C){
                if(a[r-1][c-1]==1){
                    point1++;
                    a[r-1][c-1]=2;
                }
                else if(a[r-1][c-1]==0){
                    point2++;
                    a[r-1][c-1]=3;
                }
                else if(a[r-1][c-1]==2){
                    point3++;
                }
                else if(a[r-1][c-1]==3){
                    point4++;
                }
            } else {
                point5++;
            }
        }
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);
        System.out.println(point5);
    }
}
