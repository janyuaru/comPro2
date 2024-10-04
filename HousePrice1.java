
import java.util.Scanner;

class House {
    int landSize,quality,floors,houseArea;
    public int price;
    House(int landSize,int quality,int floors,int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice(landSize,quality,floors,houseArea);
    }
    
    int computePrice(int landSize,int quality,int floors,int houseArea){
        int qualPrice = 0;
        qualPrice += landSize*10000;
        if(floors>=2){
            qualPrice += floors*200000-200000;
        }
        if(quality==1){
            qualPrice += 10000*houseArea;
        } else if(quality==2){
            qualPrice += 8000*houseArea;
        } else if(quality==3){
            qualPrice += 5000*houseArea;
        }
        return qualPrice;
    }
}

public class HousePrice1 {
    // Do not change the code below this line.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        House[] houses = new House[n];
        for(int i=0; i<n; i++){
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            houses[i] = new House(landSize, quality, floors, houseArea);
        
        }
        
        int maxPrice = scan.nextInt();
        int minArea = scan.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            House house = houses[i];
            if(house.price <= maxPrice && house.houseArea >= minArea){
                System.out.print(house.landSize + " "
                + house.quality + " " + house.floors + " "
                + house.houseArea+" ");
                System.out.println(house.price);
                count++;
            }
        }
        if(count==0){
            System.out.println("none");
        }
    }
}
