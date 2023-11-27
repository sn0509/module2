package data;

import com.opencsv.CSVReader;
import filePath.MyCartFilePath;
import products.MyCart;
import ProductsFunction.ShopCartList;

import java.io.FileReader;
import java.util.List;

public class MyCartReaderData {
    public List<MyCart> readDataFromFile(){
        ShopCartList.getInstance();
        try (CSVReader csvReader = new CSVReader(new FileReader(MyCartFilePath.filePath))) {
            List<String[]> rows = csvReader.readAll();
            for (String[] row : rows) {
                MyCart myCart = new MyCart(row[0],row[1],row[2],Double.parseDouble(row[3]),
                        Integer.parseInt(row[4]),Double.parseDouble(row[5]) );

                ShopCartList.getInstance().addProduct(myCart);
            }
        } catch (Exception e) {

        }
        return ShopCartList.getInstance().getProductsList();
    }
}
