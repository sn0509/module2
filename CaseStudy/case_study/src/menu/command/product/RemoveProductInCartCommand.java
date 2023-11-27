//package menu.command.product;
//
//import ProductsFunction.ShopCartList;
//import ProductsFunction.UpdateShopCartList;
//import data.UpdateMyCartData;
//import data.product.ProductsDataList;
//import menu.command.Command;
//import menu.itemList.CurrentShopCartList;
//
//import java.util.Scanner;
//
//public class RemoveProductInCartCommand implements Command {
//    @Override
//    public void execute() {
//        Scanner SCANNER = new Scanner(System.in);
//        System.out.println("Enter the number of product to remove.");
//        int choice = SCANNER.nextInt();
//        for(int i = 0; i< CurrentShopCartList.getInstance().getMyCartList().size(); i++){
//            System.out.println(i + ". " + CurrentShopCartList.getInstance().getMyCartList());
//            if(choice == i){
//                CurrentShopCartList.getInstance().getMyCartList().remove(CurrentShopCartList.getInstance().getMyCartList().get(i));
//                UpdateShopCartList updateShopCartList = new UpdateShopCartList();
//                updateShopCartList.update();
//                UpdateMyCartData updateMyCartData = new UpdateMyCartData();
//                updateMyCartData.updateMyCart(ShopCartList.getInstance().getProductsList());
//                break;
//            }
//        }
//        System.out.println("Remove Successful");
//    }
//}
