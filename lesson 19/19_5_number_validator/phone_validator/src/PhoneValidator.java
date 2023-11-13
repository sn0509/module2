import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    public static boolean isValidate(){
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Enter your number phone to check: ");
        String input = SCANNER.nextLine();
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Phone number is valid");
            return true;
        }
        System.out.println("Phone number invalid");
        return false;
    }
}
