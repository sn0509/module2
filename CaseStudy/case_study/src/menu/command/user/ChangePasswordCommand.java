package menu.command.user;

import menu.command.Command;
import org.mindrot.jbcrypt.BCrypt;
import user.CurrentUser;
import userManager.Login.PasswordSecurity;
import validator_and_check.Check.PasswordMatch;
import validator_and_check.Validator.PasswordValid;

import java.util.Scanner;

public class ChangePasswordCommand implements Command {
    private Scanner SCANNER = new Scanner(System.in);
    private String currentPassword;
    private String newPassword;
    private String confirmNewPassword;
    private String hashPassword;
    private PasswordSecurity passwordSecurity = new PasswordSecurity();
    private PasswordValid passwordValid = new PasswordValid();
    private PasswordMatch passwordMatch = new PasswordMatch();
    @Override
    public void execute() {
        System.out.println("Please enter the current password ");
        currentPassword = SCANNER.nextLine();
        if(passwordSecurity.isMatch(currentPassword,CurrentUser.getCurrentUser().getPassword())){
            do {
                System.out.println("Enter your new password: ");
                newPassword = SCANNER.nextLine();
                System.out.println("Enter your new password again: ");
                confirmNewPassword = SCANNER.nextLine();
            }while (!((passwordValid.isValid(newPassword)) && passwordMatch.isCheck(newPassword, confirmNewPassword)));

            hashPassword = BCrypt.hashpw(newPassword,BCrypt.gensalt());
            CurrentUser.getCurrentUser().setPassword(hashPassword);
        }else {
            System.out.println("Your password is incorrect");
        }
    }
}
