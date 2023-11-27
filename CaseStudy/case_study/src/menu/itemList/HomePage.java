package menu.itemList;
import menu.command.*;
import menu.command.ExitCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomePage implements Navigator {


    private  void displayHomepage() {
        Scanner SCANNER = new Scanner(System.in);
        Menu homePage = new MenuTemplate();
        homePage.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        homePage.addMenuItem(new MenuItem("Login", new LoginCommand()));
        homePage.addMenuItem(new MenuItem("Register",new RegisterCommand()));
        homePage.addMenuItem(new MenuItem("Forgot password",new ForgotPasswordCommand()));
        homePage.addMenuItem(new MenuItem("View products List", new ShowProductCommand()));
        homePage.addMenuItem(new MenuItem("Search(seller or product)", new SearchCommand()));
        int choice;
        try{
            do {
                homePage.displayMenu();
                choice = SCANNER.nextInt();
                homePage.runCommand(choice);
            } while (choice != 0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice, please try again");
            displayHomepage();
        }

    }


    @Override
    public void navigate() {
        displayHomepage();
    }
}
