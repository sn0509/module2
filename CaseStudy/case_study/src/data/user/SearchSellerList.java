package data.user;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class SearchSellerList {
    private static SearchSellerList instance;
    private static List<User> searchUserList;

    private SearchSellerList(){
        searchUserList = new ArrayList<>();
    }
    public static SearchSellerList getInstance(){
        if(instance == null){
            instance = new SearchSellerList();
        }return instance;
    }
    public static void addSeller(User user){
        searchUserList.add(user);
    }
    public static void releaseInstance(){
        instance = null;
    }
    public static List<User> getSellerList(){
        return searchUserList;
    }

}
