package menu;

public interface UserMenu {

    default void UserMainMenu(){
        System.out.println("""
               -----Welcome back -----
                1.View your profile.
                2.Check your carts.
                3.Find Products.
                4.View hot Products in this week.
                5.Check your message.
                6.Inbox to Admin.

                0.Return to main menu.
                """);
    }
}
