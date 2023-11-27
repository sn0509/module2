package menu.itemList;

import menu.command.ChangeProductInformationCommand;
import menu.command.product.DeActiveProductCommand;
import menu.command.product.ReactiveProductCommand;
import menu.command.product.RemoveProductCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EditorProductMenu implements Navigator{
    public void displayEditorMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu editorMenu = new MenuTemplate();
        editorMenu.addMenuItem(new MenuItem("Back", new ReturnCommand()));
        editorMenu.addMenuItem(new MenuItem("Edit product information", new ChangeProductInformationCommand()));
        editorMenu.addMenuItem(new MenuItem("DeActive product", new DeActiveProductCommand()));
        editorMenu.addMenuItem(new MenuItem("Active product",new ReactiveProductCommand()));
        editorMenu.addMenuItem(new MenuItem("Remove Product",new RemoveProductCommand()));
        try{
            int choice;
            do{
                editorMenu.displayMenu();
                System.out.println("Enter your choice.");
                choice=SCANNER.nextInt();
                editorMenu.runCommand(choice);
            }while(choice != 0);
        }catch (InputMismatchException e){
            displayEditorMenu();
        }
    }
    @Override
    public void navigate() {
        displayEditorMenu();
    }
}
