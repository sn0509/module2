//package menu.command.product;
//
//import ProductsFunction.ShopCartList;
//import ProductsFunction.UpdateShopCartList;
//import data.UpdateMyCartData;
//import menu.command.Command;
//import menu.itemList.CurrentShopCartList;
//
//import java.util.Scanner;
//
//public class ChangeProductQuantityCommand implements Command {
//    @Override
//    public void execute() {
//        System.out.println("Enter the number of product to change.");
//        Scanner SCANNER = new Scanner(System.in);
//        int choice = SCANNER.nextInt();
//        for (int i =0; i < CurrentShopCartList.getInstance().getMyCartList().size(); i++){
//            System.out.println(i + ". " + CurrentShopCartList.getInstance().getMyCartList().get(i));
//            if (choice == i){
//                System.out.println("Enter the new quantity:");
//                int newQuantity = SCANNER.nextInt();
//                CurrentShopCartList.getInstance().getMyCartList().get(i).setQuantity(newQuantity);
//                UpdateMyCartData updateMyCartData = new UpdateMyCartData();
//                updateMyCartData.updateMyCart(ShopCartList.getInstance().getProductsList());
//                break;
//            }
//        }
//    }
//}
