import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input number: " );
        int input = scanner.nextInt();
        int result = calculateAmstrong(input);
        if (result == input) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static int calculateAmstrong(int input) {
        int result = 0;
        while (input != 0) {
            result += (int) Math.pow(input % 10, 3);
            input /= 10;
        }
        return result;
    }



}
