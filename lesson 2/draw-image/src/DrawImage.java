import java.util.Scanner;
public class DrawImage {
    static Scanner input = new Scanner(System.in);
    static int width = 0;
    static int height = 0;
    public static void main(String[] args) {
        int choice = -1;


        Menu.printMainMenu();
        choice = input.nextInt();

        switch (choice){
            case 1:
//                Menu.printInputWidth();
//                int width = input.nextInt();
//                Menu.printInputHeight();
//                int height = input.nextInt();
                inputWidthAndHeight();
                DrawPicture.drawRectangle(height, width);

                break;
            case 2:
                inputWidthAndHeight();
                int triangle = input.nextInt();
                switch ( triangle ){
                    case 1:
                        System.out.println("");
                        break;
                    case 2:

                }

        }
    }
    private static void inputWidthAndHeight() {
        Menu.printInputWidth();
        width = input.nextInt();
        Menu.printInputHeight();
        height = input.nextInt();
    }

}
