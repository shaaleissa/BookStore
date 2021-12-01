import java.util.Scanner;
public class App {

    public static Books j1=new Journal(4, 3, true, 112);
    public static void shoppingCartSystem(Customer c1){
        Scanner input=new Scanner(System.in);
        boolean keepGoing=true;
        while(keepGoing){
        int ch;
        System.out.println("** Welcome To Shopping Cart System **");
        System.out.println("Enter 1 to add books");
        System.out.println("Enter 2 to romove books");
        System.out.println("Enter 3 to place order and show invoice ");
        System.out.println("Enter 4 to show invoice");
        System.out.println("Enter 5 to cancel order");
        System.out.println("Enter 6 to exit shopping cart system");
        ch=input.nextInt();
     switch(ch){
         case 1:
         c1.getCart().AddBook(ch,c1,j1);
         break;
         case 2:
         c1.getCart().RemoveBook(ch,c1,j1);
         break;
         case 3:
         c1.getCart().PlaceOrder(c1, c1.getCart().getOrder());
         c1.getCart().showBill(c1);
         break;
         case 4:
         c1.getCart().showBill(c1);
         break;
         case 5:
         c1.getCart().cancelOrder(c1);
         break;
         case 6: System.out.println("Thank you for shopping with us");
         keepGoing=false;

     }

    }}
    public static void main(String[] args) {
        Customer c1=new Customer(1, "Shahad","1234");
        Scanner input=new Scanner(System.in);
   
        int choice;
        boolean keepRolling=true;
        while(keepRolling){
        System.out.println("  ♥ SFK BookStore Welocmes You ♥  ");
        System.out.println("  ♥ Who is Using Our System Today ? ♥  ");
        System.out.println("  ♥ 1- Admin ♥  ");
        System.out.println("  ♥ 2- Customer ♥  ");
        System.out.println("  ♥ 3- Disturbuting Agent ♥  ");
        System.out.println("  ♥ 4- Exit The System♥  ");
        System.out.println("  ♥ Please Enter : ♥  ");
        choice=input.nextInt();
        switch(choice){
            case 1:
            boolean keepItUp=true;
            while(keepItUp){
                System.out.println("  ♥ Hello Dear Admin!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Add Books ♥  ");
                System.out.println("  ♥ 4-Checks Number of Orders ♥  ");
                System.out.println("  ♥ 5-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                int what;
                what=input.nextInt();
                switch(what){
                    case 1:
                    // sign up
                    break;
                    case 2:
                    // sign in
                    break;
                    case 3:
                    // add books from books class
                    break;
                    case 4:
                    System.out.println("The number of current orders are: "+ Order.numOfOrders);
                    break;
                    case 5:
                    System.out.println(" ♥♥ Bye Bye ♥♥ ");
                    keepItUp=false;
                    break;
                }

            }
                break;
            case 2:
            boolean keepgoing=true;
            while(keepgoing){
                int answer;
                System.out.println("  ♥ Hello Dear Customer!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Order Books ♥  ");
                System.out.println("  ♥ 4-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                answer=input.nextInt();
                switch(answer){
                    case 1:
                    // sign up
                    break;
                    case 2:
                    // sign in
                    break;
                    case 3:
                    shoppingCartSystem(c1);
                    break;
                    case 4:
                    System.out.println("");
                System.out.println(" ♥♥ Bye Bye ♥♥ ");
                System.out.println("");
                keepgoing=false;
                    break;
                }
                
            }
        
                break;
                case 3:
                boolean rollIt=true;
            while(rollIt){
                System.out.println("  ♥ Hello Dear Agent!♥  ");
                System.out.println("  ♥ 1-Create Account ♥  ");
                System.out.println("  ♥ 2-Sign in ♥  ");
                System.out.println("  ♥ 3-Checks Orders♥  ");
                System.out.println("  ♥ 4-Exit System ♥  ");
                System.out.println("  ♥ Please Enter : ♥  ");
                int what;
                what=input.nextInt();
                switch(what){
                    case 1:
                    // sign up
                    break;
                    case 2:
                    // sign in
                    break;
                    case 3:
                    // checks orders
                    break;
                    case 4:
                    System.out.println("");
                System.out.println(" ♥♥ Bye Bye ♥♥ ");
                System.out.println("");
                rollIt=false;
                    break;
                }
            }
                break;
                case 4: System.out.println(" ♥♥ Thank You For Using Our System We Wish You A Pleasent Day ♥♥ ");
                keepRolling=false;
                break;
            
        }

    }
}
}
    

      
    
    
    
