package menu.command.product;

import ProductsFunction.ProductsCategoryList;
import ProductsFunction.SortProducts;
import menu.command.Command;

public class SortAscendingProductCategoryCommand implements Command {
    @Override
    public void execute() {
        SortProducts sortProducts = new SortProducts();
        sortProducts.sortAscending(ProductsCategoryList.getInstance().getCategoryList());
        System.out.println(ProductsCategoryList.getInstance().getCategoryList());
    }
}
