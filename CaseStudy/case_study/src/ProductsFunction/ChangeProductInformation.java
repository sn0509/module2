package ProductsFunction;

import ProductsManager.GetProductType;
import data.product.ProductsDataList;
import data.product.UpdateProductData;
import products.CurrentProduct;
import products.Products;

import java.util.Scanner;

public class ChangeProductInformation {
    private String userChoice;
    private final Scanner SCANNER = new Scanner(System.in);
    private GetProductType productType = new GetProductType();
    private String newSoftwareClassification;
    public void changeInformation(){
        System.out.println("Leave the fields blank if you don't want to make any changes. \n" +
                "---------------------------------------------------------------------------- ");
        System.out.println("Enter your new product name: ");
        String newProductName = SCANNER.nextLine();

        System.out.println("Enter new product quantity:");
        String newQuantityInput = SCANNER.nextLine();
        int newQuantity = Integer.parseInt(newQuantityInput);

        System.out.println("Enter new produc price:");
        String newPriceInput = SCANNER.nextLine();
        double newPrice = Double.parseDouble(newPriceInput);

        System.out.println("Enter your new product description: ");
        String newDescription = SCANNER.nextLine();
        do {
            System.out.println("""
                Choice softwareClassification:
                1.System Software.
                2.Operating System.
                3.Application Software.
                """);
            userChoice = SCANNER.nextLine();
            newSoftwareClassification = productType.getProductType(userChoice);
        }while(productType!=null);

        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(CurrentProduct.getCurrentProduct().getName().equals(product.getName())){
                if(newProductName != null && !newProductName.isEmpty()) {
                    product.setName(newProductName);
                }
                if(newQuantityInput!= null &&!newQuantityInput.isEmpty()) {
                    product.setQuantity(newQuantity);
                }
                if (newPriceInput!= null &&!newPriceInput.isEmpty()) {
                    product.setPrice(newPrice);
                }
                if (newDescription!= null && !newDescription.isEmpty() ) {
                    product.setProductDescription(newDescription);
                }
                product.setSoftwareClassification(newSoftwareClassification);
                break;
            }
        }
        UpdateProductData updateProductData = new UpdateProductData();
        updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());
    }
}
