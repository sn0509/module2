package userManager.register;

import data.user.UserReaderData;
import data.user.UserWriterData;
import user.User;

import java.util.List;

public class RegisterService {
    public void register() {
        UserReaderData userReaderData = new UserReaderData();
        List<User> userList = userReaderData.readDataFromFile();
        UserRegister userRegister = new UserRegister();
        User user = userRegister.getRegister();
        System.out.println("Your account has been successfully registered. Please log in again to use it");
        UserWriterData userWriterData = new UserWriterData();
        userWriterData.writerUsersToCSVFile(user);
    }
}
