
import java.util.Scanner;


public class Account1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = deposit(n);
        System.out.println(f);
    }
    
    static int deposit(int n){
        int total = 0;
        int balance = 10000;
        total = balance + n;
        return total;
    }
}