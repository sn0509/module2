package ProductsFunction;

import data.product.ProductsDataList;
import data.user.CustomerProductsList;
import products.CurrentProduct;
import products.Products;

import java.util.List;
import java.util.Scanner;

public class ChoseProductToAdd {
    public Products getProduct(List<Products> productsList) {
        ProductsDataList.getInstance().getProductsList();
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Enter the number of product.");
        int choice = SCANNER.nextInt();
        int quantityInput;
        for (int index = 0; index < productsList.size(); index++) {
            if (choice == index) {

                CurrentProduct.setCurrentProduct(CustomerProductsList.getProductList().get(index));
                break;
            }
        }
        do {
            System.out.println("Enter the number of products you want add to shop cart");
            quantityInput = SCANNER.nextInt();
            if (quantityInput >= CurrentProduct.getCurrentProduct().getQuantity()){
                System.out.println("The quantity of the selected product exceeds the current available quantity.");
            }
        }while (quantityInput >= CurrentProduct.getCurrentProduct().getQuantity());

            CurrentProduct.getCurrentProduct().setQuantity(quantityInput);
        return CurrentProduct.getCurrentProduct();
    }
}
