
import java.util.Scanner;

class Number{
    int test(int a, int b, int c, int q){
        int point = 0;
        if(q==-1){
            if(a<b && a<c){
                point=a;
            }
            if(b<a && b<c){
                point=b;
            }
            if(c<a && c<b){
                point=c;
            }
        }
        if(q==1){
            if(a>=b && a>=c){
                point=a;
            }
            if(b>=a && b>=c){
                point=b;
            }
            if(c>=a && c>=b){
                point=c;
            }
        }
        if(q==0){
            if(a>b && a<c || a>c && a<b){
                point=a;
            }
            if(b>a && b<c || b<a && b>c){
                point=b;
            }
            if(c>a && c<b || c<a && c>b){
                point=c;
            }
        }
        return point;
    }
}

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int q = sc.nextInt();
        Number nub = new Number();
        int win = nub.test(a,b,c,q);
        System.out.println(win);
    }
}
