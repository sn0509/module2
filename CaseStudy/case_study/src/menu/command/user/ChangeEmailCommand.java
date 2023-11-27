package menu.command.user;

import menu.command.Command;
import validator_and_check.Validator.EmailValid;

import java.util.Scanner;

public class ChangeEmailCommand implements Command {
    Scanner SCANNER = new Scanner(System.in);
    private String newEmail;
    EmailValid emailValid = new EmailValid();
    @Override
    public void execute() {
        do {
            System.out.println("Enter your new Email: ");
            newEmail = SCANNER.nextLine();
        }while (!emailValid.isValid(newEmail));
    }
}
