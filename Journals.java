
public class Journals extends Books {
    public static int numOfJournals;

    public Journals(){
        
    }

    public Journals(int bookID,String name,int type,double price,int quantity,boolean availability){
        super(bookID,name,type,price,quantity,availability);
        numOfJournals++;
        }
        @Override
    public String toString(){
        return "Journals information is:"+super.toString();
    }
}
