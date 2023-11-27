package menu.itemList;

import products.MyCart;
import ProductsFunction.ShopCartList;
import user.CurrentUser;

import java.util.List;

public class CurrentShopCart {
    public List<MyCart> getCurrentShopCartList(){
        CurrentShopCartList.getInstance().releaseInstance();
        for(MyCart myCart : ShopCartList.getInstance().getProductsList()){
            if(myCart.getUID().equals(CurrentUser.getCurrentUser().getUserID())){
                CurrentShopCartList.getInstance().addProduct(myCart);
            }
        }
        return CurrentShopCartList.getInstance().getMyCartList();
    }
}
