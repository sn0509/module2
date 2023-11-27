package ProductsManager;

import ProductsFunction.ProductsCategoryList;
import data.product.ProductsDataList;
import products.Products;

import java.util.List;

public class SearchForProduct {
    private List<Products> productsDataList = ProductsDataList.getInstance().getProductsList();
    public List<Products> searchProducts(List<Products> productsList, String keyword){

        for(Products product : productsDataList){
            if (product.getName().toLowerCase().contains(keyword.toLowerCase()) && product.isActive()){
                ProductsCategoryList.getInstance().addProduct(product);
            }
        }
        if (!ProductsCategoryList.getInstance().getCategoryList().isEmpty()){
            System.out.println("Here is a list of products close to your search results. \n " + ProductsCategoryList.getInstance().getCategoryList());
            return ProductsCategoryList.getInstance().getCategoryList();
        }
        System.out.println("No results found");
        return null;
    }
}
