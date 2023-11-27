package ProductsFunction;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsCategoryList {
    private static ProductsCategoryList instance;
    private static List<Products> categoryList;

    private ProductsCategoryList(){
        categoryList = new ArrayList<>();
    }
    public static ProductsCategoryList getInstance(){
        if(instance == null){
            instance = new ProductsCategoryList();
        }return instance;
    }
    public static void releaseInstance(){
        instance = null;
    }
    public void addProduct(Products product){
        categoryList.add(product);
    }
    public List<Products> getCategoryList(){
        return categoryList;
    }
}
