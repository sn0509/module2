package menu.command.user;

import menu.command.Command;
import user.CurrentUser;

import java.util.Scanner;

public class ChangeFullNameCommand implements Command {
    private Scanner SCANNER = new Scanner(System.in);
    String newFullName;
    @Override
    public void execute() {
        System.out.println("Enter your new Full Name: ");
        newFullName = SCANNER.nextLine();
        CurrentUser.getCurrentUser().setFullName(newFullName);
    }
}
