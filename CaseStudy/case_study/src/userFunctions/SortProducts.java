package userFunctions;

import data.product.ProductsDataList;
import products.Products;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortProducts {
    List<Products> sortProductsList;
    public List<Products> sortByName(){
        sortProductsList = ProductsDataList.getInstance().getProductsList();
        Collections.sort(sortProductsList, Comparator.comparing(products -> products.getName()));
        return sortProductsList;
    }
    public List<Products> sortByQuantity(){
        sortProductsList = ProductsDataList.getInstance().getProductsList();
        Collections.sort(sortProductsList, Comparator.comparing(products -> products.getQuantity()));
        return sortProductsList;
    }
    public List<Products> sortByPrice(){
        sortProductsList = ProductsDataList.getInstance().getProductsList();
        Collections.sort(sortProductsList, Comparator.comparing(products -> products.getPrice()));
        return sortProductsList;
    }
}
