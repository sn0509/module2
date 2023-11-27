package data.user;

import com.opencsv.CSVWriter;
import filePath.UserFilePath;
import user.User;

import java.io.FileWriter;
import java.util.List;

public class UpdateUserData {
    public void updateUserData(List<User> userList) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(UserFilePath.filePath))) {
                for (User user : UserDataList.getInstance().getUserList()) {
                    String[] record = {user.getUserID(), user.getUsername(), user.getPassword(), user.getFullName(),
                            user.getEmail(), user.getPhoneNumber(), user.getUserType(),
                            String.valueOf(user.getBalance()), String.valueOf(user.isActive()), String.valueOf(user.isBan())};
                    csvWriter.writeNext(record);
                }
            } catch (Exception e) {

            }
        }
    }
}
