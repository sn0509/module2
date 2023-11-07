import java.util.Scanner;
public class DeleteElementArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0, 1, 8, 3, 4, 5, 6, 7, 8, 9};
        for (int number:numbers
             ) {
            System.out.print(number + " ");
        }
        System.out.println("\nEnter the index of the element to be deleted");
        int index = input.nextInt();
        int count = count(numbers, index);
        int[] newNumbers = new int[numbers.length-count];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] != index){
              newNumbers[k] = numbers[i];
              k++;
            }
        }
        for (int newNumber : newNumbers) {
            System.out.print(newNumber + " ");
        }
    }

    public static int count(int[] array, int index) {
        int count = 0;
        for (int j : array) {
            if (j == index) {
                count++;
            }
        }
        return count;
    }
}



