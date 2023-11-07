package menu;

import service.ExitCommand;
import service.UserProfileCommand;

import java.util.Scanner;

public class NavigationMenuProfile implements Command {
    private final Scanner SCANNER = new Scanner(System.in);
    public void navigationMenuProfile() {
        Menu menuProfile = new MenuMain();
        menuProfile.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        menuProfile.addMenuItem(new MenuItem("User profile", new UserProfileCommand()));
        int choice;
        do{
            menuProfile.displayMenu();
            choice = SCANNER.nextInt();
            menuProfile.runCommand(choice);
        } while (choice != 0);
    }

    @Override
    public void execute() {
        navigationMenuProfile();
    }
}
