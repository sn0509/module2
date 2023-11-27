package data.product;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class SearchProductList {
    private static SearchProductList instance;
    private static List<Products> searchProductList;
    private SearchProductList(){
        searchProductList = new ArrayList<>();
    }
    public static SearchProductList getInstance(){
        if(instance == null){
            instance = new SearchProductList();
        }return instance;
    }
    public static void addProduct(Products product){
        searchProductList.add(product);
    }
    public static void releaseInstance(){
        instance = null;
    }
    public static List<Products> getSearchProductList(){
        return searchProductList;
    }
}
