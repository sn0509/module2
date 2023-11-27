package menu.command.user;

import ProductsFunction.CurrentUserProductsList;
import ProductsFunction.SellerProductsList;
import menu.command.Command;
import menu.itemList.ProductsManagerMenu;

public class ProductManagerCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Here are all the products you have for sale: \n");
        SellerProductsList sellerProductsList = new SellerProductsList();
        sellerProductsList.getProductsList();
        for(int i = 0; i < CurrentUserProductsList.getInstance().getProductsList().size(); i++){
            System.out.println(i + ". " + CurrentUserProductsList.getInstance().getProductsList().get(i));
        }
        System.out.println("\n");
        ProductsManagerMenu productsManagerMenu = new ProductsManagerMenu();
        productsManagerMenu.navigate();
    }
}
