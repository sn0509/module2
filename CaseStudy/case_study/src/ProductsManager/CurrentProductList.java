package ProductsManager;

import data.product.ProductsReaderData;
import products.Products;

import java.util.ArrayList;
import java.util.List;

public class CurrentProductList {
    private static CurrentProductList instance;
    private List<Products> currentProductsList;

    private CurrentProductList(){
        currentProductsList = new ArrayList<>();
    }
    public static CurrentProductList getInstance(){
        if(instance == null){
            instance = new CurrentProductList();
        }
        return instance;
    }

    public void addProduct(Products product){
        currentProductsList.add(product);
    }

    public List<Products> getCurrenProductsList(){
        ProductsReaderData readerData = new ProductsReaderData();
        currentProductsList = readerData.readDataFromFile();
        return currentProductsList;
    }

}
