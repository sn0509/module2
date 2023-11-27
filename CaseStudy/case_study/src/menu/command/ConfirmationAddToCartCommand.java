package menu.command;

import data.MyCartWriterData;
import menu.itemList.CurrentShopCartList;
import products.CurrentProduct;
import products.MyCart;
import user.CurrentUser;

public class ConfirmationAddToCartCommand implements Command{
    @Override
    public void execute() {
        MyCart myCart =new MyCart();
        myCart.setUID(CurrentUser.getCurrentUser().getUserID());
        myCart.setPID(CurrentProduct.getCurrentProduct().getId());
        myCart.setProductName(CurrentProduct.getCurrentProduct().getName());
        myCart.setItemPrice(CurrentProduct.getCurrentProduct().getPrice());
        myCart.setQuantity(CurrentProduct.getCurrentProduct().getQuantity());
        myCart.setItemTotal(CurrentProduct.getCurrentProduct().getPrice() * CurrentProduct.getCurrentProduct().getQuantity());
        CurrentShopCartList.getInstance().addProduct(myCart);
        System.out.println("Product has been successfully added to the cart." +
                " You can check the information of the products in the cart.");
        MyCartWriterData writerData = new MyCartWriterData();
        writerData.writerMyCartToCSVFile(myCart);
    }
}
