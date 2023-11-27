package menu.command;

import menu.command.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Wish you have a good day, and see you again.\n");
    }
}
