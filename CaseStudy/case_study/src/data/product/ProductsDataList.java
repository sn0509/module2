package data.product;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsDataList {
    private static ProductsDataList instance;
    private static List<Products> productsList;
    private ProductsReaderData productsReaderData;

    private ProductsDataList(){
        productsList = new ArrayList<>();
    }

    public static synchronized ProductsDataList getInstance(){
        if(instance == null){
            instance = new ProductsDataList();
        }
        return instance;
    }

    public static void releaseInstance(){
        instance = null;
    }
    public  void addProduct(Products product){
        productsList.add(product);
    }
    public  List<Products> getProductsList(){
        return productsList;
    }
    public void removeProduct(Products currentProduct){
        productsList.remove(currentProduct);
    }

    @Override
    public String toString() {
        return "ProductsDataList{" +
                "productsList=" + productsList +
                ", productsReaderData=" + productsReaderData +
                '}';
    }
}
