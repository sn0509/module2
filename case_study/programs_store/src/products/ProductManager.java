package products;

import user_input.UserInput;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Products> productsList= new ArrayList<>();



    public static void main(String[] args) {
        UserInput sellerInput = new UserInput();

        Products products = new Products(sellerInput.getUserInputProductName(),
                sellerInput.getUserInputPrice(), sellerInput.getUserInputQuantity());
    }

    public void Add(){
        
    }



}
