import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 3 side a,b,c: ");
        int a=userInput.nextInt();
        int b=userInput.nextInt();
        int c=userInput.nextInt();
        try {
            if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
                System.out.println("a,b,c là chiều dài của các cạnh trong 1 tam giác");
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }jaems




    }
}