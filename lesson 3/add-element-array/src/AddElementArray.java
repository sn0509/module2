import java.util.Scanner;
public class AddElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0, 1, 8, 3, 4, 5, 6, 7, 8, 9};
        int[] newNumbers = new int[numbers.length];
        for (int number : numbers
        ) {
            System.out.print(number + " ");
        }
        System.out.print("\nEnter the index of the element to be added: ");
        int index = input.nextInt();

        if (index < 0 || index > numbers.length-1) {
            System.out.println("Invalid index");
            return;
        }else {
            System.out.print("\nEnter the the element to added: ");
            int inputNumber = input.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (i == index) {
                newNumbers[i] = inputNumber;

            } else {
                newNumbers[i] = numbers[i];
            }

        }
        }
        for (int k : newNumbers) {
            System.out.println(k + " ");
        }
    }
}



