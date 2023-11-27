package menu.itemList;


import menu.command.product.ConfirmPaymentCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConfirmPaymentMenu implements Navigator{
    public void displayConfirmOrder(){
        Scanner SCANNER = new Scanner(System.in);
        Menu confirmPaymentMenu = new MenuTemplate();
        System.out.println("Are your sure to payment for this?");
        confirmPaymentMenu.addMenuItem(new MenuItem("Cancel",new ReturnCommand()));
        confirmPaymentMenu.addMenuItem(new MenuItem("Yes", new ConfirmPaymentCommand()));

        try{
            int choice;
            do {
                confirmPaymentMenu.displayMenu();
                System.out.println("Enter your choice.");
                choice = SCANNER.nextInt();
                confirmPaymentMenu.runCommand(choice);
            }while (choice < 0 || choice > 1);
        }catch (InputMismatchException e){
            displayConfirmOrder();
        }
    }

    @Override
    public void navigate() {
        displayConfirmOrder();
    }
}
