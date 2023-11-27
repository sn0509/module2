package data;

import com.opencsv.CSVWriter;
import filePath.MyCartFilePath;
import products.MyCart;

import java.io.FileWriter;
import java.util.List;

public class UpdateMyCartData {
    public void updateMyCart (List<MyCart> myCartList) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(MyCartFilePath.filePath)))
            {
                for(MyCart myCart : myCartList){
                    String[] record = {myCart.getUID(),myCart.getPID(),myCart.getProductName()
                            ,String.valueOf(myCart.getItemPrice()),
                    String.valueOf(myCart.getQuantity()),String.valueOf(myCart.getItemTotal())};
                    csvWriter.writeNext(record);
                }
            } catch (Exception e) {

            }
        }
    }
}
