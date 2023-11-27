package menu.command.user;

import menu.command.Command;
import validator_and_check.Validator.PasswordValid;
import validator_and_check.Validator.PhoneNumberValid;

import java.util.Scanner;

public class ChangePhoneNumberCommand implements Command {
    Scanner SCANNER = new Scanner(System.in);
    private String newPhoneNumber;
    private PhoneNumberValid phoneNumberValid;
    @Override
    public void execute() {
        do{
            System.out.println("Please enter your new phone number: ");
            newPhoneNumber = SCANNER.nextLine();
        }while (!phoneNumberValid.isValid(newPhoneNumber));
        System.out.println("Your phone number have been change.");
    }
}
