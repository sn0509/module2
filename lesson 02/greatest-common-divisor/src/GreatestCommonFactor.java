import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1= input.nextInt();
        System.out.print("Enter the second number:");
        int number2= input.nextInt();

        if(number1==0 || number2==0) {
            System.out.println("Non greatest common factor");
        }
        while (number1 != number2){
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        System.out.println("Greatest common factor: " + number1);
    }
}
