
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author shahad
 */
public class Distributor extends Account {

    protected boolean deliveryStatus;
    protected Date dateOfDel;
    public static int numOfDistru;
    protected double deliveryfee;

    public Distributor() {
    }

    public Distributor(boolean deliveryStatus, double deliveryfee) {
        this.deliveryStatus = deliveryStatus;
        this.deliveryfee = deliveryfee;
        numOfDistru++;
    }
    public Distributor(String username, String name, String password, String phone_no, String address) {
        super(username, name, password, phone_no, address);
    }

    
    //Calculate the delivery fees
    public void Deliveryfee (double distance)
    {
    if (distance == 0) 
    {
        //If customer do not want to deliver the order
        deliveryfee = 0.0;
        System.out.println("There is no delivery fee.");
    } 
    else if (distance > 1) 
    {
        deliveryfee = ((distance * 0.5) + 2.0);
        System.out.println("Your delivery fee is: $" + deliveryfee);
    } 
    else if (distance < 0) {
        System.out.println("Invalid input");
    }
    
    }
    
    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
    public void delivaryConf(){
        //Print out the date of delivery
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dateOfDel = new Date();
        System.out.println(dateFormat.format(dateOfDel));
        
        //Print out the delivery status
        if(deliveryStatus)
            System.out.println("order has been successfully delivered");
        else if(!deliveryStatus)
            System.out.println("order has not been delivered");
    }
    
    
}
