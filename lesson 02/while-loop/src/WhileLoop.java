import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        byte flag = 0;

        int i = 2;
        while(i < Math.sqrt(number)+1){
            if (number % i ==0){
               flag++;
                break;
            } i++;
        }
        if(flag>0){
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }

          input.close();
    }
    }

