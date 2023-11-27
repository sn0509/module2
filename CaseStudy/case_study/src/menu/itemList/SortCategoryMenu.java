package menu.itemList;

import menu.command.product.SortAscendingProductCategoryCommand;
import menu.command.product.SortDescendingProductCategoryCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortCategoryMenu implements Navigator {
    public void displaySortCategoryMenu() {
        Scanner SCANNER = new Scanner(System.in);
        Menu sortCategoryMenu = new MenuTemplate();
        sortCategoryMenu.addMenuItem(new MenuItem("Back", new ReturnCommand()));
        sortCategoryMenu.addMenuItem(new MenuItem("Sort by ascending price", new SortAscendingProductCategoryCommand()));
        sortCategoryMenu.addMenuItem(new MenuItem("Sort by descending price", new SortDescendingProductCategoryCommand()));
        try {
            int choice;
            do {
                sortCategoryMenu.displayMenu();
                System.out.println("Enter your choice");
                choice = SCANNER.nextInt();
                sortCategoryMenu.runCommand(choice);
            } while (choice != 0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice, please try again.");
            displaySortCategoryMenu();
        }

    }

    @Override
    public void navigate() {
        displaySortCategoryMenu();
    }
}
