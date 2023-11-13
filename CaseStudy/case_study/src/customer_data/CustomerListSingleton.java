package customer_data;

import User.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerListSingleton {
    private static CustomerListSingleton instance;
    private final List<Customer> CUSTOMER_LIST;
    private CustomerListSingleton(){
        CUSTOMER_LIST =new ArrayList<>();
    }
    public static synchronized CustomerListSingleton getInstance(){
        if(instance == null){
            instance = new CustomerListSingleton();
        }
        return instance;
    }
}
