package data.product;

import com.opencsv.CSVWriter;
import filePath.ProductsFilepath;
import products.Products;

import java.io.FileWriter;

public class ProductWrite {
    public void writerProductToCSVFile(Products product) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(ProductsFilepath.filePath,true))) {

                String[] record = {product.getId(), product.getUid(), product.getName(), String.valueOf(product.getQuantity()),
                        String.valueOf(product.getPrice()), product.getProductDescription(), product.getSoftwareClassification(),
                        String.valueOf(product.isActive())};
                csvWriter.writeNext(record);
            } catch (Exception e) {

            }
        }
    }
}
