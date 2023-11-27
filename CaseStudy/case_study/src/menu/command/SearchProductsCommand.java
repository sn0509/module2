package menu.command;

import ProductsFunction.ProductsCategoryList;
import ProductsManager.SearchForProduct;
import data.product.ProductsDataList;
import data.product.ProductsReaderData;

import java.util.Scanner;

public class SearchProductsCommand implements Command{
    @Override
    public void execute() {
        ProductsReaderData productsReaderData = new ProductsReaderData();
        productsReaderData.readDataFromFile();
        System.out.println("Enter your keyword hear: ");
        Scanner SCANNER = new Scanner(System.in);
        String keyWord = SCANNER.nextLine();
        SearchForProduct searchForProduct = new SearchForProduct();
        searchForProduct.searchProducts(ProductsDataList.getInstance().getProductsList(),keyWord);
        ProductsCategoryList.releaseInstance();
        ProductsDataList.releaseInstance();
    }
}
