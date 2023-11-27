package data.user;

import com.opencsv.CSVReader;
import filePath.UserFilePath;
import user.User;
import user.UserFactory;

import java.io.FileReader;
import java.util.List;

public class UserReaderData {
    UserDataList userList = UserDataList.getInstance();
    public List<User> readDataFromFile() {
        try (CSVReader csvReader = new CSVReader(new FileReader(UserFilePath.filePath))) {
            List<String[]> rows = csvReader.readAll();
            for (int rowIndex = 0; rowIndex < rows.size();rowIndex++) {
                    User user = UserFactory.createUser(rows.get(rowIndex)[0], rows.get(rowIndex)[1], rows.get(rowIndex)[2],
                            rows.get(rowIndex)[3], rows.get(rowIndex)[4], rows.get(rowIndex)[5], rows.get(rowIndex)[6],
                            Double.parseDouble(rows.get(rowIndex)[7]), Boolean.parseBoolean(rows.get(rowIndex)[8]),
                            Boolean.parseBoolean(rows.get(rowIndex)[9]));
                    UserDataList.getInstance().addUser(user);
            }
        } catch (Exception e) {

        }
        return userList.getUserList();
    }
}
