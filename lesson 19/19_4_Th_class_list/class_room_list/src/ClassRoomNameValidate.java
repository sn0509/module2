import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoomNameValidate {
    Scanner SCANNER = new Scanner(System.in);


    public boolean isValidate (){
        System.out.println("Enter class name");
        String user=SCANNER.nextLine();
        String regex = "^[CAP][^!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\/`'\"|-]{4}\\d{4}[GHIK]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user);

        boolean result = matcher.matches();
        if(result){
            System.out.println("Tên hợp lệ");
            return true;
        }
        System.out.println("Tên không hợp lệ");
        return false;
    }

}
