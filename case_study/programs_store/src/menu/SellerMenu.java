package menu;

public class SellerMenu {

    public void sellerMainMenu(){
        System.out.println("""
                -----Welcome back -----
                1.View your profile.
                2.Check your carts.
                3.Check your products.
                4.Find Products.
                5.Add new Products.
                6.Check your message.
                7.Inbox to Admin.
                
                0.Return to main menu.
                """);
    }

    public void sellerProfileMenu(){
        System.out.println("""
                1.Change Password.
                2.Deposit money into your wallet.
                3.Withdraw money in your wallet back to bank.
                4.Review your sold products.
                5.Become to Membership of store.
                
                0.Return to previous menu.
                """);
    }

    public void sellerProducts(){
        System.out.println("""
                1.Review all your products.
                2.
                
                0.Return to previous menu.
                """);
    }

}
