package data.user;

import com.opencsv.CSVWriter;
import filePath.UserFilePath;
import user.User;

import java.io.FileWriter;


public class UserWriterData {

    public void writerUsersToCSVFile(User user) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(UserFilePath.filePath,true))) {

                    String[] record = {user.getUserID(), user.getUsername(), user.getPassword(), user.getFullName(),
                            user.getEmail(), user.getPhoneNumber(), user.getUserType(),
                            String.valueOf(user.getBalance()), String.valueOf(user.isActive()), String.valueOf(user.isBan())};
                    csvWriter.writeNext(record);
            } catch (Exception e) {

            }
        }
    }
}
