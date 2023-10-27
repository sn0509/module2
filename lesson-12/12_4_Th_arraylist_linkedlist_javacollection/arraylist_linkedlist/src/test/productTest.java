package test;

import Menu.UserInput;
import entity.Product;
import service.ProductManager;

public class productTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        UserInput ui = new UserInput();
        Product product1 = productManager.createProduct(1, "iphone", 100);
        productManager.addProduct(product1);
        System.out.println("Create product 2");
        int product2Id = productManager.getNewId();
        System.out.println("Input product name:");
        String product2Name = ui.setName();
        System.out.println("Input product price");
        double product2Price = ui.setPrice();
        productManager.addProduct(new Product( product2Id, product2Name, product2Price));
        productManager.getAllProductInformation();
    }
}
