package ProductsFunction;

import products.Products;
import user.CurrentUser;

import java.util.ArrayList;
import java.util.List;

public class CurrentUserProductsList {
    private static CurrentUserProductsList instance;
    private static List<Products> productsList;

    private CurrentUserProductsList(){
        productsList = new ArrayList<>();
    }
    public static CurrentUserProductsList getInstance(){
        if(instance == null){
            instance = new CurrentUserProductsList();
        }return instance;
    }

    public  void addProduct(Products product){
        productsList.add(product);
    }
    public void removeProduct(Products products){
        productsList.remove(products);
    }

    public List<Products> getProductsList(){
        return productsList;
    }
}
