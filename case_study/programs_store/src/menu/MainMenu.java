package menu;

public class MainMenu {

    public void mainMenu(){
        System.out.println("""
                -----Welcome to GG Store-----
                -----What do you want to do now?-----
                1.Register.
                2.Signing.
                3.Find Products.
                4.View hot Products in this week.
                5.Leaves us a message.
                6.About Membership of store.
                7.Rule of GG store.
                
                0.Exit.
                """);
    }
    public void confirmAnyThing(){
        System.out.println("""
                ---Are you sure to do this?---
                1.Yes
                2.No
                
                0.Return to previous menu.
                """);
    }

    public void userCartsMenu(){
        System.out.println("""
                1.Seller information.
                2.Cancel order the products.
                3.Buy this products again.
                4.Report Seller to Admin.
                5.Report bug to Admin.
                
                0.Back to previous menu.
                """);
    }


}
