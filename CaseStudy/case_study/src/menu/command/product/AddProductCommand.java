package menu.command.product;

import ProductsManager.AddProduct;
import menu.command.Command;

public class AddProductCommand implements Command {
    @Override
    public void execute() {
        AddProduct addProduct = new AddProduct();
        addProduct.execute();
    }
}
