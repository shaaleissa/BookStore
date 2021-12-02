package books;


public class Magazines extends Books{
public int numOfMagazines;
    public Magazines() {
    }
    public Magazines(int bookID,String name,int type,double price,int quantity,boolean availability){
    super(bookID,name,type,price,quantity,availability);
    numOfMagazines++;
    }
@Override
    public String toString(){
        return "Magazines information is:"+super.toString();
    }
}
