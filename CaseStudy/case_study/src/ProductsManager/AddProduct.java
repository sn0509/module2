package ProductsManager;

import data.product.ProductWrite;
import data.product.ProductsDataList;
import data.product.ProductsReaderData;
import menu.command.Command;
import products.IsProductExist;
import products.Products;
import products.ProductsFactory;
import user.CurrentUser;

public class AddProduct implements Command {
    private String productName;
    private int quantity;
    private double price;
    private String productDescription;
    private String softwareClassification;
    private GetProductsInput input ;
    private GetProductID getId;
    private final boolean isActive = true;
    private ProductWrite writerData;
    private Products products;
    private String userChoice;
    private IsProductExist isExist = new IsProductExist();
    GetProductType productType = new GetProductType();
    @Override
    public void execute() {
        ProductsReaderData productsReaderData = new ProductsReaderData();
        productsReaderData.readDataFromFile();
        input = new GetProductsInput();
        do {
            productName = input.getName();
        }while (!isExist.isNameExist(productName,ProductsDataList.getInstance().getProductsList()));

        quantity = input.getQuantity();
        price = input.getPrice();
        productDescription = input.getProductDescription();
        userChoice = input.getUserChoice();
        softwareClassification = productType.getProductType(userChoice);
        getId = new GetProductID();
                 products = ProductsFactory.createProduct(getId.getProductsID(), CurrentUser.getCurrentUser().getUserID()
                         , productName, quantity, price, productDescription, softwareClassification, isActive);
                ProductsDataList.getInstance().getProductsList().add(products);
        writerData = new ProductWrite();
        writerData.writerProductToCSVFile(products);
    }
}
