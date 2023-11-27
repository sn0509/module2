package menu.command.user;

import data.user.SearchSellerList;
import data.user.UserDataList;
import data.user.UserReaderData;
import menu.command.Command;
import userManager.SearchSeller;

import java.util.Scanner;

public class SearchSellerCommand implements Command {
    private Scanner SCANNER = new Scanner(System.in);
    @Override
    public void execute() {
        SearchSellerList.releaseInstance();
        UserReaderData readerData = new UserReaderData();
        readerData.readDataFromFile();
        SearchSeller search = new SearchSeller();
        System.out.println("Enter seller name: ");
        String sellerName = SCANNER.nextLine();
        search.searchSeller(UserDataList.getInstance().getUserList(),sellerName);
        SearchSellerList.releaseInstance();
        UserDataList.releaseInstance();
    }
}
