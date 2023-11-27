package data.product;

import com.opencsv.CSVWriter;
import filePath.ProductsFilepath;
import products.Products;

import java.io.FileWriter;
import java.util.List;

public class UpdateProductData {
    public void updateProductData (List<Products> productsList) {
        {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(ProductsFilepath.filePath)))
            {
                for(Products products : productsList){
                    String[] record = {products.getId(),products.getUid(),products.getName(),
                            String.valueOf(products.getQuantity()), String.valueOf(products.getPrice()),
                            products.getProductDescription(),products.getSoftwareClassification(), String.valueOf(products.isActive())};
                            csvWriter.writeNext(record);
                }
            } catch (Exception e) {

            }
        }
    }
}
