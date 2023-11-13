package service;

import entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManager {
//    entity.Product products = new entity.Product(Menu.UserInput.setID(),Menu.UserInput.setName(),Menu.UserInput.setPrice() );

    List<Product>productsList;

    Map<String,Product>listOfProducts =new HashMap<>();
    public ProductManager() {
        this.productsList = new ArrayList<>();
    }
    public Product createProduct(int id, String name, double price) {
        return new Product(id, name, price);
    }



    public void addProduct(Product product) {
        productsList.add(product);
    }
    public void getAllProductInformation() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
    public int getNewId(){
        int max = 0;
        for (Product product : productsList) {
            if(max < product.getId()) {
                max = product.getId();
            }
        }
        return max + 1;
    }

//    public void RemoveByID(){
//        productsList.remove(Menu.UserInput.removeByID());
//    }
//
//    public void ChangeByID(){
//        productsList.set(Menu.UserInput.changeByID(),);
//    }

    public void ShowProduct(){

    }

    public void SearchByName(){

    }

    public void SortByPrice(){

    }



}
