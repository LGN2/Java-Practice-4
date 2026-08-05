import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductInventorySystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();
        //p1
        productNames.add("Laptop");
        productQuantities.add(5);
        productPrices.add(750.10);
        //p2
        productNames.add("Iphone");
        productQuantities.add(10);
        productPrices.add(550.20);
        //p3
        productNames.add("MacBook");
        productQuantities.add(20);
        productPrices.add(1750.30);
        //p4
        productNames.add("TV");
        productQuantities.add(40);
        productPrices.add(450.40);
        //p5
        productNames.add("Ipad");
        productQuantities.add(50);
        productPrices.add(850.50);
        //p6
        productNames.add("Watch");
        productQuantities.add(60);
        productPrices.add(650.60);
        //p7
        productNames.add("Speaker");
        productQuantities.add(4);
        productPrices.add(150.10);
        //p8
        productNames.add("Keyboard");
        productQuantities.add(15);
        productPrices.add(50.90);
        //p9
        productNames.add("Mouse");
        productQuantities.add(15);
        productPrices.add(40.90);
        //p10
        productNames.add("Monitor");
        productQuantities.add(20);
        productPrices.add(250.80);

        Integer choice;

        do {

            System.out.println("\n========== PRODUCT INVENTORY SYSTEM ==========");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Search Product");
            System.out.println("5. Inventory Statistics");
            System.out.println("6. Stock Status");
            System.out.println("7. Remove Product");
            System.out.println("8. Sort Products By Name");
            System.out.println("9. Sort Products By Price");
            System.out.println("10. Exit");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
    }
}
