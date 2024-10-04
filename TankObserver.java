
import java.util.Scanner;

class WaterTank{
    int fill(int capacity,int volume){
        int q = 0;
        if(volume<=capacity){
            q = 1;
        } else {
            q = -1;
        }
        return q;
    }
}
public class TankObserver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        int height = sc.nextInt();
        int capacity = width*length*height;
        int volume = 0;
        WaterTank tank = new WaterTank();
        
        for(int i=0; i<5; i++){
            int k = sc.nextInt();
            volume += k;
            int test = tank.fill(capacity,volume);
            if(test==1){
                System.out.println(volume);
            } else {
                System.out.println("Cannot fill the tank");
                System.out.println("-1");
                volume-=k;
            }
        }
    }
}
