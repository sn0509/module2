package products;

public class CurrentProduct extends Products{
    private static Products currentProduct;
    public CurrentProduct(String id, String uid, String name, int quantity, double price, String productDescription,
                          String softwareClassification, boolean isActive) {
        super(id, uid, name, quantity, price, productDescription, softwareClassification, isActive);
    }

    public static void setCurrentProduct(Products products){
        currentProduct = products;
    }
    public static Products getCurrentProduct(){
        return currentProduct;
    }
}
