package ProductsManager;

import products.ProductsFactory;

public class GetProductType {
    private String productType;
    public String getProductType(String input){
        switch (input){
            case "1" :
                return productType = "System Software";
            case "2":
                return productType = "Operating System";
            case "3":
                return productType = "Application Software";
            default:
                System.out.println("Invalid Choice, please try again");
                return null;
        }
    }
}
