package Menu;

public class MenuItem {
    private String name;
    private ExecuteCommand command;

    public MenuItem(String name, ExecuteCommand command) {
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public ExecuteCommand getCommand() {
        return command;
    }
}
