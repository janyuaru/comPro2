
import java.util.Scanner;


public class SubMatch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String x = scan.nextLine();
        
        for(int i=0; i<x.length()-2; i++){
            String a = x.substring(i, i+3);
            //System.out.print(a+" ");
            int index = str.indexOf(a);
            //System.out.println(index+" ");
            if(index==-1){
                System.out.println("No");
            } else {
                System.out.println(index+1);
            }
        }
    }
}
