package ProductsManager;

import data.product.ProductsDataList;
import data.product.UpdateProductData;
import products.CurrentProduct;
import products.Products;

public class ActiveProduct {
    private final UpdateProductData updateProductData = new UpdateProductData();
    public void deActive(Products currentProduct){

        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(product.getName().equals(CurrentProduct.getCurrentProduct().getName())){
                if (product.isActive()){
                    product.setActive(false);
                    System.out.println("Your product has been deActive, and now users can't view it.");
                    updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());
                    break;
                }else {
                    System.out.println("Your product has been deactivated previously.");
                    break;
                }
            }
        }

    }

    public void reActive(Products currentProduct){
        for(Products product : ProductsDataList.getInstance().getProductsList()){
            if(product.getName().equals(CurrentProduct.getCurrentProduct().getName())){
                if(!product.isActive()){
                    product.setActive(true);
                    System.out.println("Your product has been reactivated, and now users can view it.");
                    updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());
                    break;
                }
                System.out.println("Your product has been deactivated previously.");
                break;
            }
        }
    }
}
