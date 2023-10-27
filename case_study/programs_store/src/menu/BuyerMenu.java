package menu;

public class BuyerMenu {
    public void buyerMainMenu(){
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

    public void buyerProfileMenu(){
        System.out.println("""
                1.Change password.
                2.Deposit money into your wallet.
                3.Become to Membership of store.
                4.Review your order products history list.
                5.Become to the seller with us.
               
                0.Back to previous menu.
                """);
    }



}
