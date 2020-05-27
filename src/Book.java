
public class Book {
    String bookName;
    String bookWriter;
    int bookPrice;
    int numOfPages;
    public void setDefultBook()
    {
        this.bookName="";
        this.bookWriter="";
        this.bookPrice=0;
        this.numOfPages=0;
    }
    public void setBookByAnotherOne(Book book)
    {
        this.bookName=book.bookName;
        this.bookPrice=book.bookPrice;
        this.bookWriter=book.bookWriter;
        this.numOfPages=book.numOfPages;
    }
    public void setBookParameters(String bookName ,String bookWriter, int bookPrice, int numOfPages)
    {
        this.bookName=bookName;
        this.bookWriter=bookWriter;
        this.bookPrice=bookPrice;
        this.numOfPages=numOfPages;
    }
    public void printBook()
    {
        System.out.println(this.bookName + "שם הספר"+ this.bookWriter+ "שם המחבר"+ this.bookPrice + "מחיר הספר" +this.numOfPages+ "מספר העמודים בספר");
    }
}