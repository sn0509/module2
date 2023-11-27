package menu.command.user;

import data.MyCartReaderData;
import menu.command.Command;
import menu.itemList.CurrentShopCart;
import menu.itemList.CurrentShopCartList;
import menu.itemList.ShopCartMenu;
import ProductsFunction.ShopCartList;
import products.MyCart;

public class CheckShopCartCommand implements Command {
    public double orderTotal = 0;
    @Override
    public void execute() {
        ShopCartList.getInstance().releaseInstance();
        MyCartReaderData readerData = new MyCartReaderData();
        readerData.readDataFromFile();
        CurrentShopCart currentShopCart = new CurrentShopCart();
        currentShopCart.getCurrentShopCartList();
        for(int i = 0; i < CurrentShopCartList.getInstance().getMyCartList().size(); i++){
            System.out.println(i + ". " + CurrentShopCartList.getInstance().getMyCartList().get(i));
            orderTotal += CurrentShopCartList.getInstance().getMyCartList().get(i).getItemTotal();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Order total: " + orderTotal);
        System.out.println(" ");
        ShopCartMenu shopCartMenu = new ShopCartMenu();
        shopCartMenu.navigate();
    }
}
