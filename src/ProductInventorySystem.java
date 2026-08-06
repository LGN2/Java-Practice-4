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

            IO.println("\n========== PRODUCT INVENTORY SYSTEM ==========");
            IO.println("1. Display Inventory");
            IO.println("2. Add Product");
            IO.println("3. Update Product");
            IO.println("4. Search Product");
            IO.println("5. Inventory Statistics");
            IO.println("6. Stock Status");
            IO.println("7. Remove Product");
            IO.println("8. Sort Products By Name");
            IO.println("9. Sort Products By Price");
            IO.println("10. Exit");


            IO.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    displayInventory(
                            productNames,
                            productQuantities,
                            productPrices
                    );
                    break;

                case 2:

                    IO.println("Enter Product Name: ");
                    String name = sc.nextLine();

                    IO.println("Enter Quantity: ");
                    String quantity = sc.nextLine();

                    IO.println("Enter Price: ");
                    String price = sc.nextLine();

                    addProduct(
                            productNames,
                            productQuantities,
                            productPrices,
                            name,
                            quantity,
                            price
                    );
                    break;

                case 3:

                    IO.println("Enter Product Index: ");
                    Integer updateIndex = sc.nextInt();
                    sc.nextLine();

                    IO.println("Enter New Product Name: ");
                    String newName = sc.nextLine();

                    IO.println("Enter New Quantity: ");
                    Integer newQuantity = sc.nextInt();

                    IO.println("Enter New Price: ");
                    Double newPrice = sc.nextDouble();

                    updateProduct(
                            productNames,
                            productQuantities,
                            productPrices,
                            updateIndex,
                            newName,
                            newQuantity,
                            newPrice
                    );
                    break;

                case 4:

                    IO.println("Enter Product Name: ");
                    String searchName = sc.nextLine();

                    searchProduct(
                            productNames,
                            productQuantities,
                            productPrices,
                            searchName
                    );
                    break;

                case 5:

                    inventoryStatistics(
                            productNames,
                            productQuantities,
                            productPrices
                    );
                    break;

                case 6:

                    stockStatus(
                            productNames,
                            productQuantities
                    );
                    break;
                case 7:

                    IO.println("Enter Product Index To Remove: ");
                    Integer removeIndex = sc.nextInt();

                    removeProduct(
                            productNames,
                            productQuantities,
                            productPrices,
                            removeIndex
                    );
                    break;

                case 8:

                    sortByName(
                            productNames,
                            productQuantities,
                            productPrices
                    );
                    break;

                case 9:

                    sortByPrice(
                            productNames,
                            productQuantities,
                            productPrices
                    );
                    break;

                case 10:

                    IO.println("Program Ended.");
                    break;

                default:

                    IO.println("Invalid Choice.");
            }
        }while(choice != 10);

        sc.close();
    }

    public static void displayInventory(
            ArrayList<String> names,
            ArrayList<Integer> quantities,
            ArrayList<Double> prices) {

        IO.println("\n========== INVENTORY ==========");


        for (Integer i = 0; i < names.size(); i++) {


            IO.println("Product " + i);
            IO.println("Name: " + names.get(i));
            IO.println("Quantity: " + quantities.get(i));
            IO.println("Price: " + prices.get(i));

            IO.println();

        }
    }

    public static void addProduct(
            ArrayList<String> names,
            ArrayList<Integer> quantities,
            ArrayList<Double> prices,
            String name,
            Integer quantity,
            Double price) {
        names.add(name);
        quantities.add(quantity);
        prices.add(price);

        IO.println("product added successfully.");
    }

    
}
