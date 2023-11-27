package menu.command.product;

import data.user.CustomerProductsList;
import data.user.GetCustomerProductsList;
import menu.command.Command;
import menu.itemList.SortAllMenu;

public class ShowAllProductsCommand implements Command {
    private int i=0;

    @Override
    public void execute() {
        CustomerProductsList.releaseInstance();
        GetCustomerProductsList getList = new GetCustomerProductsList();
        getList.getCustomerProductsList();
        for(int i = 0; i < CustomerProductsList.getProductList().size(); i++){
            System.out.println(i + ". " + CustomerProductsList.getProductList().get(i));
        }
        SortAllMenu sortAllMenu = new SortAllMenu();
        sortAllMenu.navigate();
    }
}
