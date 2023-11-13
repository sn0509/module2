package User;

import java.util.Random;


public class UserID {
    public static String getRandomUserID(int length) {
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder id = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            id.append(randomChar);
        }

        return id.toString();
    }
}
