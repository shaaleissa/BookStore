
import java.util.Scanner;
public class Customer extends Account {

public static int numOfCustomers=0;


    public Customer()
    {}
    
    public Customer(String username, String name, String password, String phone_no, String address) {
        super(username, name, password, phone_no, address);
    }
    
}