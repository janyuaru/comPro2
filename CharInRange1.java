
import java.util.Scanner;


public class CharInRange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = new String[4];
        String [] b = new String[4];
        
        for(int i=0; i<3; i++){
            a[i] = sc.next();
            b[i] = sc.next();
            //System.out.print(a[i]+" ");
            //System.out.println(b[i]);
        }
        boolean found = false;
        for(int i=0; i<3; i++){
            String x = sc.next();
            int q = a[i].charAt(0);
            int p = b[i].charAt(0);
            System.out.print(q+" ");
            System.out.println(p);
            int u = x.charAt(0);
            System.out.println(u);
            if(q<=p){
                if(u>=q && u<=p){
                    System.out.print("1"+" ");
                    found = true;
                }
                if(u>=q && u<=p){
                    System.out.print("1"+" ");
                    found = true;
                }
            }
            if(q>p){
                if(u>=p && u<=q){
                    System.out.print("2"+" ");
                    found = true;
                }
            }
            if(found==false){
                System.out.print("0");
            }
            found = false;
            System.out.println();
        }
    }
}
