
import java.util.Scanner;

class Tumbol{
    String name;
    int latitude;
    int longtitude;
    int people;
    int availBudget;
    boolean none = true;
    Tumbol(String name,int x,int y,int population){
        this.name = name;
        latitude = x;
        longtitude = y;
        people = population;
        availBudget = people*5000;
    }
    
    int allocateBudget(int[] budget){
        int total = availBudget;
        for(int i=0; i<budget.length; i++){
            if (budget[i] <= availBudget) {
                System.out.print((i+1)+ " ");
                availBudget -= budget[i];
                none = false;
            }
        }
        if (none) {
            none = false;
            System.out.print("none");
        }
        System.out.println("");
        return total-availBudget;
    }
}
public class Tumbol2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tumbol[] tumbols = new Tumbol[k];
        for (int i = 0; i < k; ++i) {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i] = new Tumbol(name,x,y,population);
        }

        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = scan.nextInt();
            int[] budget = new int[N];
            for(int j=0; j<N; j++){
                budget[j] = scan.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}
