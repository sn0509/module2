package customer_data;

import User.CurrentUser;
import User.UserFactory;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    String filePath = System.getProperty("user.dir") + "/UserData/userData.csv";

    <CurrentUser> userList = new ArrayList<>();
    public void fileReader(){

        {
            try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

                List<String[]> rows = reader.readAll();

                for (String[] row : rows) {
                    CurrentUser currentUser = new CurrentUser();

                     currentUser.setUserID(row[0]);

                     currentUser.setUserName (row[1]);

                     currentUser.setPassword (row[2]);

                     currentUser.setRole (row[3]);

                     currentUser.setFullName (row[4]);

                     currentUser.setEmail (row[5]);
                     currentUser.setPhoneNumber (row[6]);
                     currentUser.setBalance (Double.parseDouble(row[7]));
                    currentUser.setActive(Boolean.parseBoolean(row[8]));
                    userList.add(currentUser);
                    System.out.println(currentUser);
//                    CurrentUser.getRemove();
                }
                System.out.println(userList);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void writerData(){


        {
            try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){

            }catch (Exception e){

            }
        }
    }
}
