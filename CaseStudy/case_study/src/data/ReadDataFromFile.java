package data;

import User.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
    public static void readFile() {
        String csvFilePath = "D:\\CodeGym\\module2\\source\\module2\\" +
                "CaseStudy\\case_study\\src\\UserData\\userData.csv";
        String line = "";
        List<String> userOnLine = new ArrayList<>();
        List<User> userList = new ArrayList<>();

        BufferedReader bufferedReader;

        {
            try {
                bufferedReader = new BufferedReader(new FileReader(csvFilePath));
                while ((line = bufferedReader.readLine()) != null) {
                    userOnLine.add(line);
                }
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File not found!");
            }

        }

    }
}





