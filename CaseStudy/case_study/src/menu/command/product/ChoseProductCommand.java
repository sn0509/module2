package menu.command.product;
import ProductsFunction.ChoseProductToAdd;
import data.user.CustomerProductsList;
import menu.command.Command;
import menu.itemList.ConfirmAddToShopCartMenu;

public class ChoseProductCommand implements Command {

    @Override
    public void execute() {
        ChoseProductToAdd choseProductToAdd = new ChoseProductToAdd();
        choseProductToAdd.getProduct(CustomerProductsList.getProductList());
        ConfirmAddToShopCartMenu confirmAddToShopCartMenu = new ConfirmAddToShopCartMenu();
        confirmAddToShopCartMenu.navigate();
    }
}
