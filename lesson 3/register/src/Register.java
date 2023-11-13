import java.util.Scanner;
public class Register {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
        String username = input.nextLine();
        System.out.println("Hello " + username + "!");
        String password = input.nextLine();
        System.out.println("Hello " + password + "!");

    }
}
