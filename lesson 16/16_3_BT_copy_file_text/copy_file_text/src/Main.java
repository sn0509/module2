import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap duong dan file can sao chep: ");
        String path= input.nextLine();
//        System.out.println("Nhap duong dan file chua noi dung: ");
//        String filePath2=input.nextLine();

        ReadFile.readFile(path);

    }
}