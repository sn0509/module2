package ProductsManager;

import java.util.Random;

public class GetProductID {
    private int length = 8;
    private String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public String getProductsID(){
        Random random = new Random();
        StringBuilder randomID = new StringBuilder(length);
        for(int i = 0; i < length; i++){
            int index = random.nextInt(characters.length());
            randomID.append(characters.charAt(index));
        }
        return String.valueOf(randomID);
    }
}
