
import java.util.Scanner;


public class Account3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = deposit(n);
        if(f==0 || f==-1){
            System.out.println("Error");
        } else {
            System.out.println(f);
        }
    }
    
    static int deposit(int n){
        int balance = 10000;
        if(n==0){
            return 0;
        } else if (n<0){
            return -1;
        } else if(n>0){
           int total = balance+n;
           return total;
        }
        return 0;
    }
}
