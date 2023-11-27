package menu.command.user;


import data.user.UpdateUserData;
import data.user.UserDataList;
import menu.command.Command;
import user.CurrentUser;
import user.User;

public class SaveInformationCommand implements Command {
    private UpdateUserData updateData = new UpdateUserData();
    @Override
    public void execute() {
        for (User user : UserDataList.getInstance().getUserList()){
            if(user.getUsername().equals(CurrentUser.getCurrentUser().getUsername())){
                user.setPassword(CurrentUser.getCurrentUser().getPassword());
                user.setFullName(CurrentUser.getCurrentUser().getFullName());
                user.setEmail(CurrentUser.getCurrentUser().getEmail());
                user.setPhoneNumber(CurrentUser.getCurrentUser().getPhoneNumber());
                user.setBalance(CurrentUser.getCurrentUser().getBalance());
                System.out.println("Your information has been successfully updated \n");
                break;
            }
        }
        updateData.updateUserData(UserDataList.getInstance().getUserList());
    }
}
