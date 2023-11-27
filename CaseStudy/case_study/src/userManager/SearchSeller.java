package userManager;

import data.user.SearchSellerList;
import user.User;

import java.util.List;

public class SearchSeller {

    public List<User> searchSeller(List<User> sellers, String keyword ){
        SearchSellerList.getInstance();
        for(User user : sellers){
            if(user.getFullName().toLowerCase().contains(keyword.toLowerCase())){
                SearchSellerList.addSeller(user);
            }
        }
        if (!SearchSellerList.getSellerList().isEmpty()){
            System.out.println("Here is a list of sellers close to your search results. \n " + SearchSellerList.getSellerList());
            return SearchSellerList.getSellerList();
        }
        System.out.println("No results found");
        return null;
    }
}
