package data.user;

import data.product.ProductsDataList;
import data.product.ProductsReaderData;
import products.Products;

public class GetCustomerProductsList {
    public void getCustomerProductsList(){
        CustomerProductsList.releaseInstance();
        ProductsDataList.releaseInstance();
        CustomerProductsList.getInstance();
        ProductsReaderData productsReaderData = new ProductsReaderData();
        productsReaderData.readDataFromFile();
        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(product.isActive()){
                CustomerProductsList.addProduct(product);
            }
        }
    }
}
