package menu.itemList;

import menu.command.user.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActiveUserMenu implements Navigator{
    public void displayActiveUserMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu activeUserMenu = new MenuTemplate();
        activeUserMenu.addMenuItem(new MenuItem("Back.",new ReturnCommand()));
        activeUserMenu.addMenuItem(new MenuItem("DeActive user.", new DeActiveUserCommand()));
        activeUserMenu.addMenuItem(new MenuItem("Reactive user.", new ReactiveUserCommand()));
        activeUserMenu.addMenuItem(new MenuItem("Ban user.", new BanUserCommand()));
        activeUserMenu.addMenuItem(new MenuItem("Unban user.",new UnbanUserCommand()));
        try{
            int choice;
            do{
                activeUserMenu.displayMenu();
                System.out.println("Enter your choice.");
                choice = SCANNER.nextInt();
                activeUserMenu.runCommand(choice);
            }while (choice != 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again.");
            displayActiveUserMenu();
        }
    }
    @Override
    public void navigate() {
        displayActiveUserMenu();
    }
}
