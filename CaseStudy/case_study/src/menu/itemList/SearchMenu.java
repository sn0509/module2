package menu.itemList;

import menu.command.SearchProductsCommand;
import menu.command.user.ReturnCommand;
import menu.command.user.SearchSellerCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchMenu implements Navigator{
    public void displaySearchMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu searchMenu = new MenuTemplate();
        searchMenu.addMenuItem(new MenuItem("Back",new ReturnCommand()));
        searchMenu.addMenuItem(new MenuItem("Search for seller",new SearchSellerCommand()));
        searchMenu.addMenuItem(new MenuItem("Search for product", new SearchProductsCommand()));
        try{
            int choice;
            do {searchMenu.displayMenu();
                choice = SCANNER.nextInt();
                searchMenu.runCommand(choice);
            }while(choice!= 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again!");
            displaySearchMenu();
        }
    }
    @Override
    public void navigate() {
        displaySearchMenu();
    }
}
