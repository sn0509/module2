package data.product;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class SortedProductsList {
    private static SortedProductsList instance;
    private static List<Products> sortedProductsList;
    private SortedProductsList(){
        sortedProductsList = new ArrayList<>();
    }
    public static SortedProductsList getInstance(){
            if(instance == null){
                instance = new SortedProductsList();
            }
            return instance;
    }

    public void addProduct(Products product){
        sortedProductsList.add(product);
    }

    public static void releaseInstance(){
        instance = null;
    }
    public static List<Products> getSortedProductsList(){
        return sortedProductsList;
    }
}
