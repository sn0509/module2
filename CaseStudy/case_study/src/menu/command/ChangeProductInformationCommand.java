package menu.command;

import ProductsFunction.ChangeProductInformation;

public class ChangeProductInformationCommand implements Command {

    @Override
    public void execute() {

        ChangeProductInformation changeProductInformation = new ChangeProductInformation();
        changeProductInformation.changeInformation();
    }
}
