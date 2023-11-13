package Menu;

public class MenuInput {
    public static void  firstMenuList() {
        System.out.println("""
                Welcome to Store;
                1.Display the products list.
                2.Search for products by ID.
                3.Add a new product.
                4.Remove products by ID.
                5.Arrange prices in ascending order.
                6.Sort prices in descending order.
                0.Exit.
                """);
    }
    public  void secondChoice() {
        System.out.println("Enter the product ID you want to search: ");
    }
    public  void thirdChoiceAddProductID() {
        System.out.println("Enter the ID of the product you want to Add: ");
    }
    public void userInput(String type) {
        System.out.println("Enter the " + type +  " of the product you want to Add: ");
    }
    public  void thirdChoiceAddProductName(){
        System.out.println("Enter the name of the product you want to Add: ");
    }
    public  void fourthChoice() {
        System.out.println("Enter the entity.Product ID you want to remove from list: ");
    }

    public  void secondMenu() {
        System.out.println("""
                Are you sure you want to do it?
                1.Yes.
                2.No.
                0.Return to Menu List.
                """);
    }
    public void invalidInput(String reason) {
        System.out.println("Invalid input " + reason + ", Please try again" );
    }


}
