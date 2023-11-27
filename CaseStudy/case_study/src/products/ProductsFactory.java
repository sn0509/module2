package products;

public class ProductsFactory {
    public static Products createProduct(String id, String uid, String name, int quantity, double price,
                                  String productDescription, String softwareClassification,boolean isActive){
        switch (softwareClassification){
            case "System Software":
                return new SystemSoftware(id,uid,name,quantity,price,productDescription,softwareClassification,isActive);
            case "Operating System":
                return new OperatingSystem(id,uid,name,quantity,price,productDescription,softwareClassification,isActive);
            case "Application Software":
                return new ApplicationSoftware(id,uid,name,quantity,price,productDescription,softwareClassification,isActive);
            default:
                return null;
        }
    }

}
