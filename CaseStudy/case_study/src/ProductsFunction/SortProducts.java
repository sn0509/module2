package ProductsFunction;

import products.Products;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortProducts {
    public void sortAscending(List<Products> productsList){
        Collections.sort(productsList, new Comparator<Products>() {
            @Override
            public int compare(Products product1, Products products2) {
                return Double.compare(product1.getPrice(),products2.getPrice());
            }
        });
    }

    public void sortDescending(List<Products> productsList){
        Collections.sort(productsList, new Comparator<Products>() {
            @Override
            public int compare(Products product1, Products product2) {
                return Double.compare(product2.getPrice(),product1.getPrice());
            }
        });
    }
}
