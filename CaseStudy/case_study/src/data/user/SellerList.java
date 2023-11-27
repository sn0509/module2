package data.user;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class SellerList {
    private static SellerList instance;
    private static List<User> sellerList;

    private SellerList(){
        sellerList = new ArrayList<>();
    }

    public static SellerList getInstance(){
        if(instance == null){
            instance = new SellerList();
        }return instance;
    }

    public static void add(User user){
        sellerList.add(user);
    }
    public List<User> getSellerList(){
        return sellerList;
    }
}
