import java.util.Scanner;
public class LoanInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the rate per year: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of month: ");
        double month = input.nextDouble();
        double interest = amount * (rate / 100)/12 * month;
        System.out.println("The total interest is " + interest*3);
        input.close();
    }
}
