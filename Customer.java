
import java.util.Scanner;
public class Customer extends Account {

public static int numOfCustomers=0;


    public Customer()
    {}
    
    public Customer(String username, String name, String password, String phone_no, String address) {
        super(username, name, password, phone_no, address);
    }
    
     
      public static void helpcenter (){
           Scanner input=new Scanner(System.in);
    boolean rollIt=true;
   
            while(rollIt){
                System.out.println("                        ----------------------------------------ღ◦ HELP CENTER ◦ღ-------------------------------------");
       System.out.println("                                                    ▼△▼△▼△▼△▼△▼△▼△▼△▼▼△▼△▼△▼△▼  ");
        System.out.println("                                               choose what you need help with. If you do not find what you are looking for contact us  ");
        System.out.println("                                                ♡ 1-Return and Exchange ♡  ");
        System.out.println("                                                ♡ 2-covide-19 updates ♡  ");
        System.out.println("                                                ♡ 3- your rights ♡  ");
        System.out.println("                                                ♡ 4- contact us ✉♡  ");
        System.out.println("                                                ♡ 5- Exit The System ♡  ");
        System.out.println("                                                ♡ Please Enter : ♡  ");
    int ch;
    ch=input.nextInt();
    switch (ch){
        case 1:
       System.out.println("------★Exchange and Return Policy:★------\n" + 
                                    " you have 7 days to return any defective book such as missing pade or mess printing \n" + 
                                    " Exchange feature is not available");
      break;
        case 2:
           boolean f=true;
           while(f){ 
        System.out.println("------★covide-19 precautionary measures★------");

           System.out.println("                                                frequently asked qoustions:  ");
        System.out.println("                                                1-Is it safe to shop online?  ");
        System.out.println("                                                2-What measures are you taking to ensure customer safety?  ");
        System.out.println("                                                3-Are shipments sanitized?  ");
        System.out.println("                                                4-exit  ");
           
           System.out.println("Dear cutomer....enter please");
      
          
        int s;
       s=input.nextInt();
      
           
       switch(s){
           case 1 :
       
           System.out.println("➼  As per saudi Health Authority guidelines, “there is no scientific evidence until now, which proves that COVID-19 can be transmitted through products”.");
           break;
           case 2 :
               System.out.println("➼  We are monitoring the situation closely and are taking precautionary measures including: \n" +
"\n" +
"Ensuring drivers sanitize their hands before and after all deliveries\n" +
"Daily sanitization of all Namshi locations, including our warehouse, studio & offices\n" +
"Temperature checks for our delivery drivers, warehouse staff and all our employees");
               break;
           case 3 :
               System.out.println("➼  All of our locations are sanitized daily ");
               break;
               case 4 :
            f=false;
            break;
       }}break;
        case 3:
            System.out.println("------★your rights★------");
            System.out.println("➼ You have rights about your personal data:\n" +
"\n" +
"1. You have the right to be informed of any personal data which we may hold or process about you\n" +
"2. You have the right to request access to the personal data which we may hold or process about you\n" +
"3. You have the right to require us to correct any inaccuracies in your data free of charge\n" +
"4. You have the right to ask us to stop using your personal data for direct marketing purposes\n" +
"5. You have the right to ask us to erase your personal data or restrict the processing of your personal data\n" +
"6. You have the right to request us to transfer any personal data which we may hold to you or any other service provider of your choice.\n" +
"7. You have the right to lodge a complaint with the supervisory authority.\n" +
"\n" +
"If you have any concern about your data, you can contact us");
     break;
        
        case 4:
            System.out.println("------★contact us★------");
            System.out.println("➼ you are more than welcome to contact us via phone on ✆+966 502 398306 or via email ✉SFKbook.store@gmail.com and our support team will be there for you");
    break;
       case 5:
                    System.out.println("");
                System.out.println(" thank you....Regards,support team ♡ ");
                System.out.println("");
                rollIt=false;
                    break;
                    default:
                    System.out.println("Choice doesn't exist in the menu try again 😄");
                    break;
    
    }}
        
    
}
   }
