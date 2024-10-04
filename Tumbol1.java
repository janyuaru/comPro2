
import java.util.Scanner;
/*
class Tumbol{
    String name;
    int latitude;
    int longtitude;
    int people;
    int availBudget;
    boolean none = true;
    Tumbol(String name,int latitude,int longtitude,int people){
        this.name = name;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.people = people;
        availBudget = people*5000;
    }
    
    void allocateBudget(int[] budget){
        for(int i=0; i<budget.length; i++){
            if (budget[i] <= availBudget) {
                System.out.print((i+1)+ " ");
                availBudget -= budget[i];
                none = false;
            }
        }
        if (none) {
            none = false;
            System.out.println("none");
        }
    }
}
*/
public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int latitude = sc.nextInt();
        int longtitude = sc.nextInt();
        int people = sc.nextInt();
        Tumbol T = new Tumbol(name,latitude,longtitude,people);
        int count = sc.nextInt();
        int[] budget = new int[count];
        for(int i=0; i<count; i++){
            budget[i] = sc.nextInt();
        }
        T.allocateBudget(budget);
    }
}
