package Menu;

import constant.Constants;

public class Navigation {
    MenuInput menuInput = new MenuInput();
    UserInput userInput = new UserInput();
    public void firstMenu() {
        int choice = Constants.USER_CHOICE_INIT;
        while (choice != Constants.USER_CHOICE_QUIT) {
            menuInput.firstMenuList();
            choice = userInput.userChoice();
            switch (choice) {
                case Constants.USER_CHOICE_QUIT:
                    System.out.println("Exit");
                    break;
                    default:
                        menuInput.invalidInput("choice");
                        break;
            }
        }
    }
}
