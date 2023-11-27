package menu.command;

import data.user.UserReaderData;
import org.mindrot.jbcrypt.BCrypt;
import user.User;
import validator_and_check.Check.PasswordMatch;
import validator_and_check.Validator.PasswordValid;

import java.util.Scanner;

public class ForgotPasswordCommand implements Command{
    private Scanner SCANNER = new Scanner(System.in);
    private PasswordMatch passwordMatch = new PasswordMatch();
    private PasswordValid passwordValid = new PasswordValid();
    private String username;
    private String newPassword;
    private String confirmPassword;
    private String hashPassword ;
    private String email;
    @Override
    public void execute() {
        System.out.println("Enter your username: ");
        username = SCANNER.nextLine();
        System.out.println("Enter the email you used to register for this account.");
        email = SCANNER.nextLine();
        UserReaderData userReaderData = new UserReaderData();
        userReaderData.readDataFromFile();

        for(User user : userReaderData.readDataFromFile()){
            if(username.equalsIgnoreCase(user.getUsername()) && email.equalsIgnoreCase(user.getEmail())){
                do {
                    System.out.println("Enter your new password: ");
                    newPassword = SCANNER.nextLine();
                    System.out.println("Enter your new password again: ");
                    confirmPassword = SCANNER.nextLine();
                }while (!((passwordValid.isValid(newPassword)) && passwordMatch.isCheck(newPassword, confirmPassword)));
                hashPassword = BCrypt.hashpw(newPassword,BCrypt.gensalt());
                user.setPassword(hashPassword);
                System.out.println("Your Password have been changed.");
                break;
            }
        }
        System.out.println("Your username does not exist, or the email used for registration is incorrect.");
    }
}
