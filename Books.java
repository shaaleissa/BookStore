
import java.util.ArrayList;
import java.util.Scanner;
public class Books {
    private int bookId;
    private int quantity;
    private boolean ava;
    String name;
    double price;
    int type;
    public static int numOfBooks=0;
    static Scanner input=new Scanner(System.in);

    public Books(){
        bookId=0;
        quantity=0;
        ava=true;

    }
    public Books(int newBookId, boolean newAve, int newQuan,double newPrice){
        bookId=newBookId;
        ava=newAve;
        quantity=newQuan;
        price=newPrice;

    }


    public void AddBooks(int type){
        if(type==1){
            Journal.AddJournal(createJournal());
         
        } 

    }
    public void DisplayBooksInfo(int type){
        if(type==1){
            

        }

    }
    public int getBookId(){
        return bookId;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean getAv(){
        return ava;
    }
    public void setBookId(int newBookId){
        bookId=newBookId;
    }
    public void setQuantity(int newQuantity){
        quantity=newQuantity;
    }
    public void setAv(boolean newAv){
        ava=newAv;
    }

    public static Journal createJournal(){
        System.out.println("Enter id");
        int id=input.nextInt();
        System.out.println("Enter quantty");
        int quan=input.nextInt();
        System.out.println("Enter 1 if ava 0 if not");
        boolean avae=input.nextBoolean();
        System.out.println("Enter price:");
        double price=input.nextDouble();
        return new Journal(id,quan,avae,price);

    }
   
}
class Journal extends Books{
    static int numOfJour=1;
    final static int MAX_JOURNALS=5;
    private static ArrayList<Journal> journal= new ArrayList<Journal>();

    public Journal(){
        
    }

    public Journal(int newbookId, int newquantity, boolean newava,double newPrice){
        super(newbookId, newava, newquantity,newPrice);
    }
    public void DisplayJournals(Journal j1){
        System.out.println("Id:"+j1.getBookId());
    }

    public static void AddJournal(Journal j){
        if(j.getBookId()<=MAX_JOURNALS){
            journal.add(j);
            
        }
    }
    

    
   
}
class Studybooks extends Books{
    static int numOfStudybooks=1;
}
class Magazines extends Books{
    static int numOfMagazines=1;
}
