package service;

import Menu.Command;

public class LoginCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Login");
    }

    @Override
    public void undo() {

    }
}
