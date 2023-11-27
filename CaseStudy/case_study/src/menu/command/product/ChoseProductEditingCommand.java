package menu.command.product;

import ProductsFunction.ChoseProductToAdd;
import ProductsFunction.CurrentUserProductsList;
import menu.command.Command;
import menu.itemList.EditorProductMenu;
import products.CurrentProduct;

import java.util.Scanner;

public class ChoseProductEditingCommand implements Command {
    private Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Chose 1 product for editing. \n");
        for(int i = 0; i < CurrentUserProductsList.getInstance().getProductsList().size(); i++){
            System.out.println(i + ". " + CurrentUserProductsList.getInstance().getProductsList().get(i));
        }
        System.out.println("Enter the number of product: ");
        int choice = SCANNER.nextInt();
        for(int i = 0; i < CurrentUserProductsList.getInstance().getProductsList().size(); i++){
            if(i==choice){
                CurrentProduct.setCurrentProduct(CurrentUserProductsList.getInstance().getProductsList().get(i));
            }
        }
        System.out.println(CurrentProduct.getCurrentProduct()+ "\n");
        EditorProductMenu editorProductMenu = new EditorProductMenu();
        editorProductMenu.navigate();
    }
}
