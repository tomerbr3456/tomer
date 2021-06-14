public class ReadingBook extends Book {
    int bookPrice=numOfPages*3;

    public int getBookPrice()
    {
        return this.bookPrice;
    }
    public void setBookPrice(int numOfPages)
    {
        this.bookPrice=numOfPages*3;
    }

}
