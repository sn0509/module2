package products;

import ProductsManager.GetProductsInput;
import data.product.ProductsDataList;

import java.util.List;

public class IsProductExist {
    GetProductsInput input = new GetProductsInput();
    public boolean isNameExist(String input , List<Products> productsList){
        for(Products products : ProductsDataList.getInstance().getProductsList()){
            if(!products.getName().equals(input)){
                return true;
            }
        }
        System.out.println("Product name already exists in your products list, please chose another one.");
        return false;
    }
}
