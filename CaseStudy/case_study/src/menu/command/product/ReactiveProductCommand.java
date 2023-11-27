package menu.command.product;

import ProductsManager.ActiveProduct;
import menu.command.Command;
import products.CurrentProduct;

public class ReactiveProductCommand implements Command {
    @Override
    public void execute() {
        ActiveProduct reactiveProduct = new ActiveProduct();
        reactiveProduct.reActive(CurrentProduct.getCurrentProduct());
    }
}
