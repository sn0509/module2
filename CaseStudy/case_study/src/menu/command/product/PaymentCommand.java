package menu.command.product;

import menu.command.Command;
import menu.itemList.ConfirmPaymentMenu;

public class PaymentCommand implements Command {
    @Override
    public void execute() {
        ConfirmPaymentMenu confirmPaymentMenu  =new ConfirmPaymentMenu();
        confirmPaymentMenu.displayConfirmOrder();
    }
}
