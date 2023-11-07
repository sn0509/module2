import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge: ");
        int FirstEdge = input.nextInt();
        System.out.println("Enter the second edge: ");
        int SecondEdge = input.nextInt();
        System.out.println("Enter the third edge: ");
        int ThirdEdge = input.nextInt();

        Triangle triangle = new Triangle();
        Triangle.getTriangle(FirstEdge, SecondEdge, ThirdEdge);

    }
}