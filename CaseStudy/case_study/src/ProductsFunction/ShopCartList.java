package ProductsFunction;

import products.MyCart;

import java.util.ArrayList;
import java.util.List;

public class ShopCartList {
    private static ShopCartList instance;
    private List<MyCart> productsList;
    private ShopCartList(){
        productsList = new ArrayList<>();
    }
    public static ShopCartList getInstance(){
        if(instance == null){
            instance = new ShopCartList();
        }
        return instance;
    }
    public void releaseInstance(){
        instance = null;
    }
    public void addProduct(MyCart product){
        productsList.add(product);
    }
    public List<MyCart> getProductsList(){
        return productsList;
    }
}
