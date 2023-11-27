package menu.command.product;

import ProductsFunction.ProductsCategory;
import ProductsFunction.ProductsCategoryList;
import menu.command.Command;
import menu.itemList.SortCategoryMenu;
import products.Products;

public class ShowOperatingProductsCommand implements Command {
    @Override
    public void execute() {
        ProductsCategory categoryList = new ProductsCategory();
        categoryList.getCategoryProductsList("Operating Software");
        for(Products product : ProductsCategoryList.getInstance().getCategoryList()){
            System.out.println(product);
        }
        SortCategoryMenu sortCategoryMenu = new SortCategoryMenu();
        sortCategoryMenu.navigate();
    }
}
