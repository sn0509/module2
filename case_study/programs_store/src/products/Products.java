package products;

public class Products {

    private String productsName;

    private double prices;

    private int quantity;

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public double getPrice() {
        return prices;
    }

    public void setPrice(double price) {
        this.prices = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Products(String productsName,double prices, int quantity){
        this.productsName=productsName;
        this.prices=prices;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productsName='" + productsName + '\'' +
                ", price=" + prices +
                ", quantity=" + quantity +
                '}';
    }
}
