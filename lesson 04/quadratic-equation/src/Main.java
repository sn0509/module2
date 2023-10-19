import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Enter number b: ");
//        double b = scanner.nextDouble();
//        System.out.print("Enter number c: ");
//        double c = scanner.nextDouble();

//        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        //tao object tu class khong co tham so nhap vao
        QuadraticEquation quadraticEquation2 = new QuadraticEquation();
//        quadraticEquation.calculateResult();
        System.out.println("Enter number a:");
        quadraticEquation2.setA(scanner.nextDouble());
        System.out.println("Enter number b:");
        quadraticEquation2.setB(scanner.nextDouble());
        System.out.println("Enter number c:");
        quadraticEquation2.setC(scanner.nextDouble());
        quadraticEquation2.calculateResult();
        }
    }
