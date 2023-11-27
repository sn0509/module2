package products;


public class OrderedProduct {
    private String ID;
    private String sellerName;
    private String customerID;
    private String name;
    private int quantity;
    private double price;
    private String productDescription;
    private String softwareClassification;

    public OrderedProduct(String ID, String sellerName, String customerID, String name, int quantity,
                          double price, String productDescription, String softwareClassification) {
        this.ID = ID;
        this.sellerName = sellerName;
        this.customerID = customerID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.productDescription = productDescription;
        this.softwareClassification = softwareClassification;
    }

    public OrderedProduct() {
    }

    @Override
    public String toString() {
        return " SellerName: " + sellerName +
                "Name: " + name +
                "Quantity: " + quantity +
                "Price: " + price +
                "ProductDescription: " + productDescription +
                "SoftwareClassification: " + softwareClassification;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSoftwareClassification() {
        return softwareClassification;
    }

    public void setSoftwareClassification(String softwareClassification) {
        this.softwareClassification = softwareClassification;
    }
}
