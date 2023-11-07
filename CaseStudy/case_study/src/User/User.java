package User;

import java.util.Scanner;

public abstract class UserProperties {
    Scanner SCANNER = new Scanner(System.in);
    private String name = SCANNER.nextLine();
    private String password= SCANNER.nextLine();

    public UserProperties() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
