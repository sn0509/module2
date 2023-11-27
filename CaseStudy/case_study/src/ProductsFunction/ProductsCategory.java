package ProductsFunction;

import data.product.ProductsDataList;
import data.product.ProductsReaderData;
import products.Products;

import java.util.List;

public class ProductsCategory {
    private ProductsReaderData productsReaderData = new ProductsReaderData();
    public List<Products> getCategoryProductsList(String softwareClassification){
        productsReaderData.readDataFromFile();
        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(product.getSoftwareClassification().equalsIgnoreCase(softwareClassification) && product.isActive()){
                ProductsCategoryList.getInstance().addProduct(product);
            }
        }
        if(!ProductsCategoryList.getInstance().getCategoryList().isEmpty()) {
            return ProductsCategoryList.getInstance().getCategoryList();
        }
        System.out.println("No products found in this category. \n");
        return null;
    }
}
