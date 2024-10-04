
import java.util.Scanner;


public class StringMerge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = sc.nextInt();
        
        int L1 = str1.length();
        int L2 = str2.length();
       
        int p = 0;
        
        if(L1<L2){
            p=L1;
        } 
        if(L2<L1){
            p=L2;
        }
        
        for(int i=0; i<p; i++){
            int shoot1 = str1.charAt(i);
            int shoot2 = str2.charAt(i); 
            if(Character.isUpperCase(shoot1)==true && Character.isUpperCase(shoot2)==true){
                if(n==1){
                    System.out.print((char)shoot1);
                } else if(n==2){
                    System.out.print((char)shoot2);
                }
            }
            if(Character.isLowerCase(shoot1)==true && Character.isLowerCase(shoot2)==true){
                if(n==1){
                    System.out.print((char)shoot1);
                } else if(n==2){
                    System.out.print((char)shoot2);
                }
            }
            if(Character.isUpperCase(shoot1)==true && Character.isUpperCase(shoot2)==false){
                System.out.print((char)shoot1);
            }
            if(Character.isUpperCase(shoot1)==false && Character.isUpperCase(shoot2)==true){
                System.out.print((char)shoot2);
            }
        }
    }
}
