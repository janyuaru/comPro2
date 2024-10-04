
import java.util.Scanner;

class Swich{
    int joint(int n, int p, int k){
        if(k>90){
            int f = k-90+65-1;
            return f;
        } else {
            return k;
        }
    }
}

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int q = str.length();
        Swich test = new Swich();
        
        for(int i=0; i<q; i++){
            int n = sc.nextInt();
            int p = str.charAt(i);
            int k = p+n;
            int j = test.joint(n,p,k);
            System.out.print((char)j);
        }
    }
}
