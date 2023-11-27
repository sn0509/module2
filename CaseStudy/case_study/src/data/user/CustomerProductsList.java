package data.user;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class CustomerProductsList {
    private static CustomerProductsList instance;
    private static List<Products> productsList;

    private CustomerProductsList (){
        productsList = new ArrayList<>();
    }
    public static CustomerProductsList getInstance(){
        if(instance == null){
            instance = new CustomerProductsList();
        }return instance;
    }
    public static List<Products> getProductList(){
        return productsList;
    }
    public static void addProduct(Products product){
        productsList.add(product);
    }
    public static void releaseInstance(){
        instance = null;
    }
}
