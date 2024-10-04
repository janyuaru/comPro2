
import java.util.Scanner;

class Product {
    String name;
    String sku;
    double prices;
    int weight;
    boolean valid;
    Product(String name, String sku, double prices, int weight){
        this.name = name;
        this.sku = sku;
        this.prices = prices;
        this.weight = weight;
    }
    boolean chechValidity(){
        boolean valid = true;
        if(this.name == null || this.name.length()== 0){
            System.out.println("name is invalid");
            valid = false;
        }
        if(this.sku == null || this.sku.length() == 0){
            System.out.println("sku is invalid");
            valid = false;
        }
        if(this.prices < 0){
            System.out.println("price is invalid");
            valid = false;
        }
        if(this.weight < 0){
            System.out.println("weight is invalid");
            valid = false;
        }
        this.valid = valid;
        return valid;
    }
    void printInfo(){
        System.out.print(this.name+", ");
        System.out.print(this.sku+", ");
        System.out.print(this.prices+", ");
        System.out.print(this.weight);
        if(this.valid==false){
            System.out.print(", Invalid");
        }
        System.out.println("");
    }
}

public class ProductStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Product[] pr = new Product[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            pr[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            boolean valid = pr[i].chechValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            pr[i].printInfo();
        }
    }
}
