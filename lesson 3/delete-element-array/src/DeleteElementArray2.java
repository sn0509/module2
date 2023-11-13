import java.util.ArrayList;
import java.util.Scanner;
public class DeleteElementArray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0, 1, 8, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter the index of the element to be deleted");
        int index = input.nextInt();
        ArrayList<Integer> llnumbers = new ArrayList<Integer>();
        for (int number:numbers) {
            llnumbers.add(number);
        }

        llnumbers.remove(index);

        for (int number:llnumbers) {
            System.out.print(number + " ");
        }

    }
}



