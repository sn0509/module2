package User;

public class Customer extends UserProperties implements User{
    public Customer(String name,String password){
        super(name, password);
    }

    public Customer() {

    }
}
