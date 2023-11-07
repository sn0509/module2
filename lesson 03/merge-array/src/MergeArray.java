import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1=input.nextInt();
        int[] arr1=new int[size1];
        System.out.println("Enter element to add the array: ");
        for(int i=0;i<size1;i++)
        {
            arr1[i]=input.nextInt();
        }
       System.out.println("Enter the size of the second array: ");
        int size2=input.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Enter element to add the array: ");
        for(int i=0;i<size2;i++)
        {
            arr2[i]=input.nextInt();
        }
        int[] arr3=new int[size1+size2];
        int index=0;

        for (int i:arr1){
            arr3[index]=i;
            index++;
        }
        for (int i:arr2){
            arr3[index]=i;
            index++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
