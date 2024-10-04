
import java.util.Scanner;

class Route{
    //build name for use with constructor
    String[] stopName;
    int[] distances;
    Route(String[] a, int[] b){
        stopName = a;
        distances = b;
    }
    void getStopInfo(int x, int n){
        if(x>0 && x<=n){
            System.out.println(stopName[x]+" "+distances[x]);
        } else {
            System.out.println("invalid number");
        }
    }
}

public class BusRoute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n+1];
        int[] b = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = sc.next();
            b[i] = sc.nextInt();
        }
        // send to constructor
        Route route = new Route(a,b);
        int k = sc.nextInt();
        for(int i=1; i<=k; i++){
            int x = sc.nextInt();
            route.getStopInfo(x,n);
        }
    }
}
