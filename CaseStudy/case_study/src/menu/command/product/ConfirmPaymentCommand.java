package menu.command.product;

import ProductsFunction.CalculateAmount;
import ProductsFunction.UpdateProductQuantity;
import ProductsFunction.UpdateShopCartList;
import data.UpdateMyCartData;
import data.product.ProductsDataList;
import data.product.UpdateProductData;
import data.user.UpdateUserData;
import data.user.UserDataList;
import menu.command.Command;

import menu.itemList.CurrentShopCartList;
import ProductsFunction.ShopCartList;
import user.CurrentUser;

public class ConfirmPaymentCommand implements Command {
    private double orderTotal=0;
    @Override
    public void execute() {
        for (int i = 0; i < CurrentShopCartList.getInstance().getMyCartList().size(); i++) {
            orderTotal += CurrentShopCartList.getInstance().getMyCartList().get(i).getItemTotal();
        }
        if (CurrentUser.getCurrentUser().getBalance() >= orderTotal) {
            double remainingAmount = CurrentUser.getCurrentUser().getBalance() - orderTotal;
            CurrentUser.getCurrentUser().setBalance(remainingAmount);
            System.out.println("Payment successful.");

            CalculateAmount calculateAmount =new CalculateAmount();
            calculateAmount.calculate();

            UpdateProductQuantity updateProductQuantity = new UpdateProductQuantity();
            updateProductQuantity.update();

            UpdateShopCartList updateShopCartList = new UpdateShopCartList();
            updateShopCartList.update();

            UpdateUserData updateUserData = new UpdateUserData();
            updateUserData.updateUserData(UserDataList.getInstance().getUserList());

        }else {
            System.out.println("The balance in your wallet is not sufficient for payment.");
        }
        UpdateMyCartData updateMyCartData = new UpdateMyCartData();
        updateMyCartData.updateMyCart(ShopCartList.getInstance().getProductsList());
        ShopCartList.getInstance().releaseInstance();
        UpdateProductData updateProductData = new UpdateProductData();
        updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());

    }
}
