package ProductsFunction;

import data.user.UserDataList;
import products.MyCart;
import user.User;

import java.util.List;

public class CalculateAmount {
    private double currentBalance = 0;
    private double afterSold = 0;
    public List<User> calculate(){

        for(MyCart myCart : ShopCartList.getInstance().getProductsList()){
            for(User user : UserDataList.getInstance().getUserList()){
               if(myCart.getUID().equals(user.getUserID())){
                    currentBalance = user.getBalance();
                    afterSold = currentBalance + myCart.getItemTotal();
                    user.setBalance(afterSold);
                }
            }
        }
        return UserDataList.getInstance().getUserList();
    }
}
