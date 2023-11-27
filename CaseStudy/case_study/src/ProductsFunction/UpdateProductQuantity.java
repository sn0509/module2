package ProductsFunction;

import data.product.ProductsDataList;
import data.user.CustomerProductsList;
import menu.itemList.CurrentShopCartList;
import products.Products;

import java.util.List;

public class UpdateProductQuantity {
    public List<Products> update(){
        for(int i = 0 ; i< CurrentShopCartList.getInstance().getMyCartList().size(); i++){
            for(int j =0; j < ProductsDataList.getInstance().getProductsList().size(); j++){
                if(CurrentShopCartList.getInstance().getMyCartList().get(i).getPID().equals(
                        ProductsDataList.getInstance().getProductsList().get(j).getId())){
                   int initialQuantity = ProductsDataList.getInstance().getProductsList().get(j).getQuantity();
                   int quantityAfterChange = initialQuantity- CurrentShopCartList.getInstance().getMyCartList().get(i).getQuantity();
                    ProductsDataList.getInstance().getProductsList().get(j).setQuantity(quantityAfterChange);
                }
            }
        }return ProductsDataList.getInstance().getProductsList();
    }
}
