import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    static List<String> list = new ArrayList<>();
    public static void readFile(String path){

        try{
            File file = new File(path);

            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine()) != null){
                list.add(line);
            }
            br.close();
        }
        catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void writeFile(String path){

    }
}
