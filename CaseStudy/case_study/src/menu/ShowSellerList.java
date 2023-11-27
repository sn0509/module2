package menu;

import data.user.SellerList;
import data.user.UserReaderData;
import user.User;

import java.util.List;

public class ShowSellerList {
    private String username;
    private UserReaderData userReaderData;
    public List<User> showSellerList() {
        SellerList.getInstance().getSellerList();
        System.out.println("Enter seller name you want to search.");
        for (User user : userReaderData.readDataFromFile()){
            if(user.getUserType().equals("Seller")){
                SellerList.add(user);
            }
        }
        return SellerList.getInstance().getSellerList();
    }
}
