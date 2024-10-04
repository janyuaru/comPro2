
import java.util.Scanner;


public class indexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String card = scan.nextLine();
        int n = str.indexOf(card,0);
        if(n==-1){
            System.out.println("string not found");
        } else {
            System.out.println(n+1);
        }
    }
}
