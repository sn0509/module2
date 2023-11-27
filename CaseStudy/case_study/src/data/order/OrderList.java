package data.order;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private static OrderList instance;
    private static List<Products> productsOrderedList;
    private OrderList (){
        productsOrderedList = new ArrayList<>();
    }
    public static OrderList getInstance(){
        if(instance == null){
            instance = new OrderList();
        }return instance;
    }
    public static void addProduct(Products orderedProduct){
        productsOrderedList.add(orderedProduct);
    }
    public static void releaseInstance(){
        instance = null;
    }
    public static List<Products> getProductsOrderedList(){
        return productsOrderedList;
    }
}
