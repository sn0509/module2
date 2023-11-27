package menu.command.user;

import data.product.ProductsDataList;
import data.product.ProductsReaderData;
import data.product.UpdateProductData;
import data.user.UpdateUserData;
import data.user.UserDataList;
import menu.command.Command;

import java.util.Scanner;

public class UnbanUserCommand implements Command {
    @Override
    public void execute() {
        ProductsReaderData productsReaderData = new ProductsReaderData();
        productsReaderData.readDataFromFile();
        Scanner SCANNER = new Scanner(System.in);
        for(int i = 0; i < UserDataList.getInstance().getUserList().size(); i++ ){

            System.out.println(i + ". " +UserDataList.getInstance().getUserList().get(i));
        }
        System.out.println("Enter the number of user to Unban:");
        int choice = SCANNER.nextInt();
        for (int i = 0; i < UserDataList.getInstance().getUserList().size(); i++){
            if(choice == i){
                UserDataList.getInstance().getUserList().get(i).setBan(false);
                System.out.println("This user have been Unban.");
                break;
            }
        }
        UpdateUserData updateUserData = new UpdateUserData();
        updateUserData.updateUserData(UserDataList.getInstance().getUserList());
        UpdateProductData updateProductData = new UpdateProductData();
        updateProductData.updateProductData(ProductsDataList.getInstance().getProductsList());
    }
}
