package ProductsManager;

import java.util.Scanner;

public class GetProductsInput {
    private final Scanner SCANNER = new Scanner(System.in);
    private int quantity;
    private double price;
    private String productDescription;
    private GetProductType getType = new GetProductType();


    public String getName() {
        System.out.println("Enter your product name: ");
        String productName;
        return  productName=SCANNER.nextLine();
    }

    public int getQuantity() {
        System.out.println("Enter quantity product: ");
        int quantity;
        return quantity = SCANNER.nextInt();
    }

    public double getPrice() {
        System.out.println("Enter the price of your product: ");
        return SCANNER.nextDouble();
    }

    public String getProductDescription() {
        System.out.println("Please describe your product: ");
        SCANNER.nextLine();
       return SCANNER.nextLine();
    }
    public String getUserChoice() {
        System.out.println("""
                Your product falls into the type?
                1.System Software.
                2.Operating System.
                3.Application Software.
                """);
        String userChoice;
         return userChoice = SCANNER.nextLine();
    }
}
