import java.util.Scanner;
public class Customer {
    protected int Id;
     protected String name;
     protected String pass;
    private Shoppingcart shoppingCart=new Shoppingcart();
    Scanner input =new Scanner(System.in);
    public Customer(int id,String newname,String passW){
        Id=id;
        name=newname;
        pass=passW;
    }


    public int getId(){
        return Id;
    }
    public String getPass(){
        return pass;
    }
    public void setId(int id){
        this.Id=id;
    }

    public String getName(){
        return name;
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
    public void displayCart(Customer cus){
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
}
