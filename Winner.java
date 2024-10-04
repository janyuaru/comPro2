
import java.util.Scanner;


public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] a = new int[R][C];
        
        int count = 0;
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j]==1){
                    count++;
                }
            }
        }
        
        int k = sc.nextInt();
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;
        int point5 = 0;
        int atta = 0;
        int win = 0;
        int boat = 0;
        
        for(int i=0; i<k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r>0 && c>0 && r<=R && c<=C){
                if(a[r-1][c-1]==1){
                    point1++;
                    atta++;
                    if(atta-count==0){
                        win=i;
                    }
                    a[r-1][c-1]=2;
                    boat = i;
                } 
                else if(a[r-1][c-1]==0){
                    point2++;
                    a[r-1][c-1]=3;
                }
                else if(a[r-1][c-1]==2){
                    atta++;
                    if(atta-count==0){
                        win=i;
                    }
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
        //System.out.println(count);
        //ystem.out.println(atta);
        if(atta-count>=0){
            System.out.println("attacker "+(win+1));
        }
        if(atta-count<0){
            if(boat==0){
                System.out.println("battleship -1");
            } else {
                System.out.println("battleship "+boat);
            }
        }
    }
}
