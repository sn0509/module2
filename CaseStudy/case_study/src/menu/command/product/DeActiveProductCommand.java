package menu.command.product;

import ProductsManager.ActiveProduct;
import menu.command.Command;
import products.CurrentProduct;

public class DeActiveProductCommand implements Command {
    @Override
    public void execute() {
        ActiveProduct activeProduct = new ActiveProduct();
        activeProduct.deActive(CurrentProduct.getCurrentProduct());
    }
}
