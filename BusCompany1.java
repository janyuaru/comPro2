
import java.util.Scanner;

class Bus{
    String id;
    int type;
    private int numseats,numreserved;
    boolean status;
    Bus(String id, int type, int numseats){
        this.id = id; this.type = type;
        this.numseats = numseats; this.numreserved = 0;
        this.status = true;
    }
    void printStats(){
        System.out.println(id);
        switch (type){
            case 1 : System.out.println("Fan"); break;
            case 2 : System.out.println("P1"); break;
            case 3 : System.out.println("VIP"); break;
        }
        System.out.println(numreserved+" "+numseats);
        if(status) {System.out.println("Active");}
        else {System.out.println("Inactive");}
    }
    boolean reserve(int k){
        if(k<=0) return false;
        if(!status) return false;
        if(k>(numseats-numreserved)) return false;
        numreserved += k;
        return true;
    }
    void sendToRepair() {status = false;}
    void backToService() {status = true;}
}
public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Bus[] bus = new Bus[Q+1];
        for(int index=1; index<=Q; index++){
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            bus [index] = new Bus(id, type, seats);
        }
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if(P==1){//reserve
                boolean success = false;
                for(int j=1; j<=Q; j++)
                    if(bus[j].type==T)
                        if(bus[j].reserve(K)){
                            System.out.println(bus[j].id);
                            success = true;
                            break;
                        }
                if(!success)System.out.println("sorry");
            }else if (P==2)
                bus[T].sendToRepair();
            else if (P==3)
                bus[T].backToService();
        }
    }
}
