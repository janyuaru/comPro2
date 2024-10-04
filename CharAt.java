
import java.util.Scanner;


public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int L = str.length();
        if(n>L || n<=0){
            System.out.println("invalid position");
        } else {
            char c = str.charAt(n-1);
            System.out.println(c);
        }
    }
}
