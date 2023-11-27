package data;

import data.user.UserDataList;
import products.Products;
import user.User;

import java.util.List;

public class GetSellerName {
    public String getSellerName(Products product) {
        for (User user : UserDataList.getInstance().getUserList()) {
            if (user.getUserID().equals(product.getUid())) {
                return user.getFullName();
            }
        }
        return null;
    }
}

