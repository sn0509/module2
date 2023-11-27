package data;

import com.opencsv.CSVWriter;
import filePath.MyCartFilePath;
import products.MyCart;

import java.io.FileWriter;

public class MyCartWriterData {
    public void writerMyCartToCSVFile(MyCart myCart) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(MyCartFilePath.filePath,true))) {

                String[] record = {myCart.getUID(),myCart.getPID(), myCart.getProductName(),String.valueOf(myCart.getItemPrice()),
                String.valueOf(myCart.getQuantity()),String.valueOf(myCart.getItemTotal())};
                csvWriter.writeNext(record);
            } catch (Exception e) {

            }
        }
    }
}
