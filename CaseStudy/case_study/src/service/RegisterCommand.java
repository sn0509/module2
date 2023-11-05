package service;

import Menu.Command;

import java.util.Scanner;

public class RegisterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Register Information");
    }

    @Override
    public void undo() {

    }
}
