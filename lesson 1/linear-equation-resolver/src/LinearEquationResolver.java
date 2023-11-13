import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, and c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = b * b - 4 * a * c;

        if (a != 0) {
            double answer= (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else if (b == c) {
            System.out.println(" The solution is all x!");
        } else {
            System.out.print("No solution!");
        }

        input.close();
    }
}
