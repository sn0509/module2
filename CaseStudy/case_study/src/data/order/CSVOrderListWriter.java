package data.order;

import com.opencsv.CSVWriter;
import filePath.OrderListFilePath;
import products.OrderedProduct;

import java.io.FileWriter;

public class CSVOrderListWriter {
    public void writerOrderedProductToCSVFile(OrderedProduct product) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(OrderListFilePath.filePath,true))) {

                String[] record = {product.getCustomerID(), product.getSellerName(), product.getName(), String.valueOf(product.getQuantity()),
                        String.valueOf(product.getPrice()), product.getProductDescription(), product.getSoftwareClassification()};
                csvWriter.writeNext(record);
            } catch (Exception e) {

            }
        }
    }
}
