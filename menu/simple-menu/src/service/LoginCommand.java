package service;

import menu.Command;
import menu.NavigationMenuProfile;

public class LoginCommand implements Command {


    @Override
    public void execute() {
        System.out.println("Login!");
        Command navigationMenuProfile = new NavigationMenuProfile();
        navigationMenuProfile.execute();
    }
}
