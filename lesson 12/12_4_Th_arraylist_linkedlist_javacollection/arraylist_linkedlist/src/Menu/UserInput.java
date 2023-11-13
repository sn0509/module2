package Menu;

import java.util.Scanner;
public class UserInput {
private  final Scanner SCANNER = new Scanner(System.in);
    public  int userChoice(){

        return SCANNER.nextInt();
    }

    public  int setID(){

        return SCANNER.nextInt();
    }
    public  String setName(){

        return SCANNER.nextLine();
    }
    public  double setPrice(){

        return SCANNER.nextLong();
    }

    public  int removeByID(){

        return SCANNER.nextInt();
    }

    public  int changeByID(){

        return SCANNER.nextInt();
    }
//    public static String changeProductName(){
//        Scanner name = new Scanner(System.in);
//    }
}
