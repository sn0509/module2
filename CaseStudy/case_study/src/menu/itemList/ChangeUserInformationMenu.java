package menu.itemList;

import menu.command.user.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeUserInformationMenu implements Navigator {
    private Menu changeInformationMenu = new MenuTemplate();
    public void displayChangeInformation() {
        Scanner SCANNER = new Scanner(System.in);
        changeInformationMenu.addMenuItem(new MenuItem("Back to main menu", new ReturnCommand()));
        changeInformationMenu.addMenuItem(new MenuItem("Change your Password", new ChangePasswordCommand()));
        changeInformationMenu.addMenuItem(new MenuItem("Change your full name", new ChangeFullNameCommand()));
        changeInformationMenu.addMenuItem(new MenuItem("Change your email", new ChangeEmailCommand()));
        changeInformationMenu.addMenuItem(new MenuItem("Change your phone number", new ChangePhoneNumberCommand()));
        changeInformationMenu.addMenuItem(new MenuItem("Save your new Information", new SaveInformationCommand()));
        int choice;
        try {
            do {
                changeInformationMenu.displayMenu();
                choice = SCANNER.nextInt();
                changeInformationMenu.runCommand(choice);
            } while (choice != 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again!");
            displayChangeInformation();
        }
    }
    @Override
    public void navigate() {
        displayChangeInformation();
    }
}
