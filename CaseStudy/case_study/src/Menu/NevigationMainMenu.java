package Menu;

import service.ExitCommand;
import service.LoginCommand;
import service.RegisterCommand;

import java.util.Scanner;

public class NevigationMainMenu {
    private final Scanner SCANNER = new Scanner(System.in);

    public void MainMenu(){
        Menu mainMenu = new MenuMain();

        mainMenu.addMenu(new MenuItem("Exit", new ExitCommand()));
        mainMenu.addMenu(new MenuItem("Login", new LoginCommand()));
        mainMenu.addMenu(new MenuItem("Register", new RegisterCommand()));

    }
}
