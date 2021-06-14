
 public abstract class Book {
    String bookName;
    String bookWriter;
    int bookPrice;
    int numOfPages;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book ()
    {
        this.bookName="";
        this.bookWriter="anonymous";
        this.bookPrice=0;
        this.numOfPages=0;
    }
    public Book (Book book)
    {
        this.bookName=book.bookName;
        this.bookPrice=book.bookPrice;
        this.bookWriter=book.bookWriter;
        this.numOfPages=book.numOfPages;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setBookParameters(String bookName , String bookWriter, int bookPrice, int numOfPages)
    {
        this.bookName=bookName;
        this.bookWriter=bookWriter;
        this.bookPrice=bookPrice;
        this.numOfPages=numOfPages;
    }
    public void printBook(int bookIndex)
    {
        System.out.println(this.getBookName() + " BookName " + this.getBookWriter()+ " BookWriter "+ this.getBookPrice() + " BookPrice "  +this.getNumOfPages()+ " NumOfPages " +"BookIndex "+ bookIndex);
    }
}