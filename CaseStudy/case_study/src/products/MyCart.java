package products;

public class MyCart {
    private String UID;
    private String PID;
    private String productName;
    private double itemPrice;
    private int quantity;
    private double itemTotal;

    public MyCart() {
    }

    public MyCart(String UID, String PID, String productName, double itemPrice, int quantity, double itemTotal) {
        this.UID = UID;
        this.PID = PID;
        this.productName = productName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.itemTotal = itemTotal;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    @Override
    public String toString() {
        return "productName: " + productName +
                " ItemPrice: " + itemPrice +
                " quantity: " + quantity +
                " itemTotal: " + itemTotal;
    }
}
