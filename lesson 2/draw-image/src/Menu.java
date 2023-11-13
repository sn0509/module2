public class Menu {
    public static void printMainMenu() {
        System.out.println("""
                Menu
                1. Print the rectangle
                2. Print the square triangles
                3. Print isosceles triangles
                4. Exit
               Enter your choice:""");
    }

    public static void printInputWidth() {
        System.out.println("Enter the Width:");
    }

    public static void printInputHeight() {
        System.out.println("Enter the Height:");
    }

    public static void printTriangleCorner() {
        System.out.println(
                """
        Menu
        1. Top-left
        2. Bottom left
        3. Bottom right
        4. Top right
        5. Exit
        Enter your triangle:
                """
        );
    }
}
