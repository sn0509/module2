package menu.itemList;

import menu.command.product.ShowAllProductsCommand;
import menu.command.product.ShowApplicationProductCommand;
import menu.command.product.ShowOperatingProductsCommand;
import menu.command.product.ShowSystemProductCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewProductMenu implements Navigator{
    public void displayViewProductMenu(){
         final Scanner SCANNER = new Scanner(System.in);
         Menu viewProductMenu = new MenuTemplate();
         viewProductMenu.addMenuItem(new MenuItem("Back",new ReturnCommand()));
         viewProductMenu.addMenuItem(new MenuItem("View all product", new ShowAllProductsCommand()));
         viewProductMenu.addMenuItem(new MenuItem("View product type operation system",new ShowSystemProductCommand()));
         viewProductMenu.addMenuItem(new MenuItem("View product type application software", new ShowApplicationProductCommand()));
         viewProductMenu.addMenuItem(new MenuItem("View product type utility system",new ShowOperatingProductsCommand()));
        try {


            int choice;
            do {
                viewProductMenu.displayMenu();
                choice = SCANNER.nextInt();
                viewProductMenu.runCommand(choice);
            } while (choice != 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again!");
            displayViewProductMenu();
        }
    }
    @Override
    public void navigate() {
        displayViewProductMenu();
    }
}
