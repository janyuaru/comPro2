
import java.util.Scanner;

class Train{
    //build name for use with constructor
    String[] stopName;
    int[] distances;
    int n;
    Train(String[] a, int[] b,int n){
        stopName = a;
        distances = b;
        this.n = n;
    }
    void getStopInfo(int x){
        if(x>0 && x<=n){
            System.out.println(stopName[x]+" "+distances[x]);
        } else {
            System.out.println("invalid number");
        }
    }
    void summarizeroute(){
        int total = 0;
        for(int i=1; i<=n; i++){
            total+=distances[i];
        }
        System.out.println(stopName[1] +" "+ stopName[n]+ " " + total);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n+1];
        int[] b = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = sc.next();
            b[i] = sc.nextInt();
        }
        Train route = new Train(a,b,n); // send to constructor
        route.summarizeroute(); //send to method
    }
}
