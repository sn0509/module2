package menu.command.product;

import ProductsFunction.CurrentUserProductsList;
import data.product.ProductsDataList;
import data.product.UpdateProductData;
import menu.command.Command;
import products.CurrentProduct;

public class RemoveProductCommand implements Command {
    @Override
    public void execute() {
        CurrentUserProductsList.getInstance().removeProduct(CurrentProduct.getCurrentProduct());
        ProductsDataList.getInstance().removeProduct(CurrentProduct.getCurrentProduct());
        UpdateProductData updateProductData = new UpdateProductData();
        updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());
    }
}
