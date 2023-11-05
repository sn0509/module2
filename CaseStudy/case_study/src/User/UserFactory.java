package User;

public interface UserFactory {
     public static User createUser(String type){
         switch (type){
             case "Admin" :
                 return new Admin();
             case "Customer":
                 return new Customer();
             case "Seller":
                 return new Seller();
             default:
                 throw new IllegalArgumentException("Invalid User type " + type);
         }
     }

}
