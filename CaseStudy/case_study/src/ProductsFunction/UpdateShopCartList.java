package ProductsFunction;

import products.MyCart;
import user.CurrentUser;

import java.util.List;

public class UpdateShopCartList {

    public List<MyCart> update(){
        for(int i = 0; i< ShopCartList.getInstance().getProductsList().size(); i++){
            if(ShopCartList.getInstance().getProductsList().get(i).getUID().equals(CurrentUser.getCurrentUser().getUserID())){
                ShopCartList.getInstance().getProductsList().remove(ShopCartList.getInstance().getProductsList().get(i));
            }
        }return ShopCartList.getInstance().getProductsList();
    }
}
