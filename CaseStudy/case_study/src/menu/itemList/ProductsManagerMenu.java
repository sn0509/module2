package menu.itemList;

import menu.command.product.*;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductsManagerMenu implements Navigator {

    private void displayProductMenu() {
        Scanner SCANNER = new Scanner(System.in);
        Menu productsMenu = new MenuTemplate();
        productsMenu.addMenuItem(new MenuItem("Back.", new ReturnCommand()));
        productsMenu.addMenuItem(new MenuItem("Add new Product.", new AddProductCommand()));
        productsMenu.addMenuItem(new MenuItem("Select the product for editing.",new ChoseProductEditingCommand()));
        try {
            int choice;
            do {
                productsMenu.displayMenu();
                choice = SCANNER.nextInt();
                productsMenu.runCommand(choice);
            } while (choice != 0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice, please try again!");
            displayProductMenu();
        }
    }


    @Override
    public void navigate() {
        displayProductMenu();
    }
}
