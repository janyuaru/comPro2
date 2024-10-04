
import java.util.Scanner;


public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char m = (char) n;
        if(n<(int)'A' || n>(int)'Z'){
            System.out.println("unsupported code");
        } else {
            System.out.println(m);
        }
    }
}
