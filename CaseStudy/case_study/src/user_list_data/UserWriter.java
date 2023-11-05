package user_list_data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserWriter {
    BufferedWriter bufferedWriter;

    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("userdata.csv"));
            bufferedWriter.write("");
        } catch (IOException e) {

        }
    }


}
