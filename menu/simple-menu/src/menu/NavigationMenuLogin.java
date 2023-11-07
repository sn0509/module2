package menu;

import service.ExitCommand;
import service.LoginCommand;

import java.util.Scanner;

public class NavigationMenuLogin {
    private final Scanner SCANNER = new Scanner(System.in);
    public void navigationMenuLogin() {
        Menu menuLogin = new MenuMain();

        menuLogin.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        menuLogin.addMenuItem(new MenuItem("Login", new LoginCommand()));
        int choice;
        do {
            menuLogin.displayMenu();
            choice = SCANNER.nextInt();
            menuLogin.runCommand(choice);
        } while (choice!=0);
    }
}
