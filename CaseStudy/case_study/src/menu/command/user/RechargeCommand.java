package menu.command.user;

import data.user.UpdateUserData;
import data.user.UserDataList;
import menu.command.Command;
import user.CurrentUser;
import user.User;
import userFunctions.WalletRecharge;

public class RechargeCommand implements Command {
    private UpdateUserData updateData = new UpdateUserData();
    @Override
    public void execute() {
        WalletRecharge walletRecharge =new WalletRecharge();
        walletRecharge.rechargeToWallet();
        for(User user : UserDataList.getInstance().getUserList()) {
            if(user.getUsername().equals(CurrentUser.getCurrentUser().getUsername())){
                user.setBalance(CurrentUser.getCurrentUser().getBalance());
                System.out.println("Recharge to wallet successful.");
                break;
            }
        }
        updateData.updateUserData(UserDataList.getInstance().getUserList());
    }
}
