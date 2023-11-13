import java.util.Arrays;
import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the column of the array: ");
        int column=input.nextInt();
        System.out.print("Enter the row of the array: ");
        int row=input.nextInt();
        int [][] numbers= new int[column][row];
        int index1 = 0, index2 = 0;

        for(int i=0;i<column;i++) {
            for(int j=0;j<row;j++) {
                numbers[i][j]=input.nextInt();
            }
        }
        int max = numbers[0][0];
        for (int i=0;i<column;i++) {
            for (int j=0;j<row;j++) {
                if(numbers[i][j]>max) {
                    max=numbers[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }


        System.out.println("The max of 2-dimensional array is :" + max + " at element " + index1  + " and index " + index2  );
    }
}
