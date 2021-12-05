
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author shahad
 */
public class Account {
ArrayList<Account> existAccount= new ArrayList<Account>();
   protected String username ;
    protected String name ;
    protected String password ;
    protected String phone_no;
    protected String address;
    private Shoppingcart shoppingCart=new Shoppingcart();
    public static int numOfAccount;

    

    
     public boolean validPass() 
    {
        //return true if and only if password:
        //1. have at least eight characters.
        //2. consists of only letters and digits.
        //3. must contain at least two digits.
        if (password.length() < 8) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

     public boolean ValidUsername()
    {
        //return true if and only if Username:
        //1. start with characters
        //2. Number of characters must be between 8 to 15.
    Pattern unPattern = Pattern.compile("^[a-zA-Z0-9.!@#$%^&*-_]{8,15}$");
    Matcher unMatcher = unPattern.matcher(username);
    if(unMatcher.matches()){
        return true;
    } else {
        return false;
    }
    }
  
    
     public boolean validateLogin(Account acc){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter username :");
        String inpUsername=input.next();
        System.out.println("Enter password :");
        String inpPass=input.next(); 
        if(acc.username.equals(inpUsername)&&acc.password.equals(inpPass)){
        if(acc.SignUp()==true)
        System.out.print("Welcome "+acc.name);
            return true;
            }
            else{
        System.out.println("You need to sign up first");
        return false;}
     }
     
  
   public boolean SignUp(){
        
        if(ValidUsername()&& validPass()){
            System.out.println("You have been signed up successfully");
            return true;
        }
        else{
            System.out.println("Incorrect username or password, try again ");
            return false;
        }
    }
   
    public void displayCart(Account cus){
        if(cus instanceof Customer){
        System.out.print("Chosen Payment Method :");
        if(cus.shoppingCart.getPaymentMethod()==1){
            System.out.println("Cash");
        }
        if(cus.shoppingCart.getPaymentMethod()==2){
            System.out.println("Credit");
        }
        System.out.println("*****************************");
        System.out.print("Student Discount: ");
        if(cus.shoppingCart.getIfStudent()==true){
            System.out.println("Applicable");
        }
        else{
        System.out.print("Not Applicable");
        System.out.println(" ");}
        System.out.println("*****************************");
        System.out.print("Delivary: ");
        if(cus.shoppingCart.getDeliverReq()==true){
            System.out.println("Requested");
            System.out.println("Delivary pin:"+cus.shoppingCart.getDeliveryPin());
        }
        System.out.println("*****************************");
        System.out.println("Total Price:"+cus.shoppingCart.getTotalPrice());
    }
    else 
System.out.println("This feature is only for customers ");
    }
   
    
    
    
    
    // constructors, setters and getters
    
    public Account() {
    }

    public Account(String username, String name, String password, String phone_no, String address) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone_no = phone_no;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Shoppingcart getCart(){
        return shoppingCart;
    }
    public void setCart(int paymentMethod, boolean ifStudent, boolean newdeliverReq, int newdeliverPin,double newtotalPrice){
        int pa=paymentMethod;
        boolean ifS=ifStudent;
        boolean delR=newdeliverReq;
        int delp=newdeliverPin;
        double total=newtotalPrice;
        shoppingCart.setPaymentMethod(pa);
        shoppingCart.setIfStudent(ifS);
        shoppingCart.setDeliverReq(delR);
        shoppingCart.setDeliveryPin(delp);
        shoppingCart.setTotalPrice(total);
    }

    

}
