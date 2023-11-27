package menu.command.product;

import ProductsFunction.ProductsCategoryList;
import ProductsFunction.SortProducts;
import menu.command.Command;

public class SortDescendingProductCategoryCommand implements Command {
    @Override
    public void execute() {
        SortProducts sortProducts = new SortProducts();
        sortProducts.sortDescending(ProductsCategoryList.getInstance().getCategoryList());
        System.out.println(ProductsCategoryList.getInstance().getCategoryList());
    }
}
