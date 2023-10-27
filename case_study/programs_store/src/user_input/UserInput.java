package user_input;
import java.util.Scanner;

public class UserInput {
    Scanner userInput= new Scanner(System.in);

    private String userInputProductName= userInput.nextLine();

    private double userInputPrice= userInput.nextDouble();

    private int userInputQuantity= userInput.nextInt();

    public String getUserInputProductName() {
        return userInputProductName;
    }

    public void setUserInputProductName(String userInputProductName) {
        this.userInputProductName = userInputProductName;
    }

    public double getUserInputPrice() {
        return userInputPrice;
    }

    public void setUserInputPrice(double userInputPrice) {
        this.userInputPrice = userInputPrice;
    }

    public int getUserInputQuantity() {
        return userInputQuantity;
    }

    public void setUserInputQuantity(int userInputQuantity) {
        this.userInputQuantity = userInputQuantity;
    }
}
