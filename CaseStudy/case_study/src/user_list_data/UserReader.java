package user_list_data;

import java.io.*;

public class UserReader {
    public static final Character COMMA_DELIMITER = ',';

    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("userdata.csv"));
            String line;
            while((line=bufferedReader.readLine())!= null){
                    String[] data = line.split(",");
                System.out.println(data[0] + " _ " + data[1]);
            }
            bufferedReader.close();
        } catch (Exception e) {
        }
    }
}
