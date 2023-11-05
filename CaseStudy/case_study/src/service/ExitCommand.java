package service;

import Menu.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exit");
    }

    @Override
    public void undo() {
    }
}
