public class Admin extends Account {
    public static int numOfAdmins;

    //constructor 
    public Admin(){

    }
    public Admin(String username, String name, String password, String phone_no, String address) {
        super(username, name, password, phone_no, address);
    }

}
