package menu.command.product;

import ProductsFunction.SortProducts;
import data.user.CustomerProductsList;
import data.product.ProductsDataList;
import menu.command.Command;

public class AllSortDescendingCommand implements Command {
    @Override
    public void execute() {
        SortProducts sortProducts = new SortProducts();
        sortProducts.sortDescending(CustomerProductsList.getProductList());
        for(int i = 0; i < CustomerProductsList.getProductList().size(); i++){
            System.out.println(i + ". " +ProductsDataList.getInstance().getProductsList().get(i) );
        }
    }
}
