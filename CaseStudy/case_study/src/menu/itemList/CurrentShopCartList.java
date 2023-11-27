package menu.itemList;

import products.MyCart;

import java.util.ArrayList;
import java.util.List;

public class CurrentShopCartList {
    private static CurrentShopCartList instance;
    private List<MyCart> myCartList;

    private CurrentShopCartList(){
        myCartList = new ArrayList<>();
    }
    public static synchronized CurrentShopCartList getInstance(){
        if(instance == null){
            instance = new CurrentShopCartList();
        }return instance;
    }
    public void addProduct(MyCart mycart){
        myCartList.add(mycart);
    }
    public List<MyCart> getMyCartList(){
        return myCartList;
    }
    public void releaseInstance(){
        instance = null;
    }
}
