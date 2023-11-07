public class DrawPicture {
    private static String result = "";
    public static void drawRectangle(int height, int width) {
        for(int i = 0; i < height; i++ ){
            for(int j = 0; j < width; j++ ){

                result += "*" + " ";
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
