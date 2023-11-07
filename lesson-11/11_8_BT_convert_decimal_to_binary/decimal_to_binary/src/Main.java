import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to convert! ");
        int number = scanner.nextInt();


        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }
        System.out.println(stack);
        System.out.println(stack.size());

        int[] numbers = new int[stack.size()];
    for (int i = 0; i < numbers.length; i++){
        numbers[i]=stack.pop();
    }
        System.out.println(Arrays.toString(numbers));
    }
    }