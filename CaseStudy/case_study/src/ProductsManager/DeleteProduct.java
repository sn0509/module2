package ProductsManager;

import products.Products;

import java.util.List;

public class DeleteProduct {
    List<Products> productsList;
    public List<Products> deleteProduct(int index){
       productsList = CurrentProductList.getInstance().getCurrenProductsList();
       productsList.remove(index);
       return productsList;
    }
}
