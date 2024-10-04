
import java.util.Scanner;


public class CharInRange1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = new String[4];
        String [] b = new String[4];
        
        for(int i=0; i<3; i++){
            a[i] = sc.next();
            b[i] = sc.next();
        }
        
        int count = 0;
        int nub = 0;
        
        for(int i=0; i<3; i++){
            String x = sc.next();
            count=0;
            int u = x.charAt(0);
            for(int j=0; j<3; j++){
                int q = a[j].charAt(0);
                int p = b[j].charAt(0);
                if(q<=p){
                    if(u>=q && u<=p){
                        System.out.print(j+1+" ");
                        count++;
                    }
                }
                if(q>p){
                    if(u>=p && u<=q){
                        System.out.print(j+1+" ");
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
