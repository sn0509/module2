package products;

import user_input.UserInput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class ProductManager {
    static List<Products> productsList= new ArrayList<>();

    FileWriter programList;

//    {
//        try {
//            programList = new FileWriter("products.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }





    static UserInput sellerInput = new UserInput();

    static Products products =
            new Products(sellerInput.getUserInputProductName(),
            sellerInput.getUserInputPrice(), sellerInput.getUserInputQuantity());



    public static void Add(){
        productsList.add(products);
        System.out.println(productsList.getFirst());


    }




}
