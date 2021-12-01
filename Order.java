import java.util.ArrayList;
public class Order{
    private ArrayList<Books> bookOrder=new ArrayList<Books>();
    private int quantity;
    public static int numOfOrders=0;

    public Order(){

    }

    public Order( Books[] newBookOrder, int newQuantity){

    }

  
    public ArrayList<Books> getBookOrder(){
        return bookOrder;
    }
   
    public int getQuantity(){
        return quantity;
    }
    public void setBookOrder(ArrayList<Books> newBookOr){
        bookOrder=newBookOr;
    }
    public void setQuantity(int newQuantity){
        quantity=newQuantity;
    }

    
}