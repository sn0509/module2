package menu;

public interface Menu {
    void addMenuItem(MenuItem menuItem);
    void displayMenu();
    void runCommand(int index);
}
