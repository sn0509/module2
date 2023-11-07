import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\module2\\source\\module2\\lesson-16\\16_2_BT_find_max\\find_max_value_and_writer\\src\\numbers.txt");
        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\module2\\source\\module2\\lesson-16\\16_2_BT_find_max\\find_max_value_and_writer\\src\\result.txt", maxValue);
    }
}