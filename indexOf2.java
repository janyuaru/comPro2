
import java.util.Scanner;


public class indexOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String x = scan.nextLine();
        int i = str.indexOf(x,0);
        //System.out.println(i);
        if(i==-1){
            System.out.print("string not found");
        } else {
            while(i!=-1){
                System.out.print(i+1+" ");
                i = str.indexOf(x,i+1);
                //System.out.println(i);
            }
        }
        System.out.println();
    }
}
