package userFunctions;

import data.user.UserReaderData;
import user.CurrentUser;

import java.util.Scanner;

public class WalletRecharge {
    private Scanner SCANNER = new Scanner(System.in);
    private double refill ;
    private double present;
    private UserReaderData updateData = new UserReaderData();
    public void rechargeToWallet(){
        System.out.println("Enter the amount you want to add to your wallet: ");
        refill= SCANNER.nextDouble();
        present = CurrentUser.getCurrentUser().getBalance() + refill;
        CurrentUser.getCurrentUser().setBalance(present);
    }
}
