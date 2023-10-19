import java.util.Scanner;
public class MoneyConvert {
    public static void main(String[] args) {
        double dollar,rate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a dollar amount: ");
        dollar=input.nextDouble();
        System.out.print("Enter a rate: ");
        rate= dollar * 23000;
        System.out.print(dollar + " = " + rate + "VND");

        input.close();
    }
}
