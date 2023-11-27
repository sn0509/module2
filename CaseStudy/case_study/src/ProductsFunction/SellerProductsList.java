package ProductsFunction;

import data.product.ProductsDataList;
import data.product.ProductsReaderData;
import products.Products;
import user.CurrentUser;

import java.util.List;

public class SellerProductsList {
    public List<Products> getProductsList(){
        ProductsReaderData productsReaderData = new ProductsReaderData();
        productsReaderData.readDataFromFile();
        ProductsDataList.getInstance().getProductsList();
        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(product.getUid().equals(CurrentUser.getCurrentUser().getUserID())){
                CurrentUserProductsList.getInstance().addProduct(product);
            }
        }
        return CurrentUserProductsList.getInstance().getProductsList();
    }
}
