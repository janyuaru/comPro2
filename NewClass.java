
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cut = sc.nextLine();
        int L = str.indexOf(cut);
        System.out.println(L);
    }
}
