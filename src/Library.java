import java.util.*;

public class Library  extends BookShelf{
    String libraryName;
    ArrayList<BookShelf> bookShelfList;
    public Library()
    {
        this.libraryName="tomer's Library";
        this.bookShelfList=new ArrayList<BookShelf>();

    }
    public void library(String libraryName)
    {
        this.libraryName=libraryName;
    }
    public void addBookToShelf(int placement,Book newBook)
    {
        this.bookShelfList.get(placement).booksOnShelf[this.bookShelfList.get(placement).numOfBooksOnShelf()+1]=newBook;
    }
    public void addFirstPossibleBook(Book book)
    {
        for(int i=0;i<bookShelfList.size();i++)
        {
            if(this.bookShelfList.get(i).canBeAdded()==true)
            {
                this.bookShelfList.get(i).booksOnShelf[0]=book;
                break;
            }

        }
    }
    public void removeBook(String bookName)
    {
        for (int i=0;i<this.bookShelfList.size();i++)
        {
            this.bookShelfList.get(i).deleteByBookName(bookName);
        }
    }
    public void removeBookById(String bookName,int Id)
    {
        for (int i=0;i<this.bookShelfList.size();i++)
        {
            if(this.bookShelfList.get(i).shelfId==Id);
            {
                this.bookShelfList.get(i).deleteByBookName(bookName);
            }
        }

    }
    public void sortTheLibrary()
    {
        for (int i=0;i<this.bookShelfList.size();i++)
        {
            this.bookShelfList.get(i).sortAlphabetically();
        }
    }
//    public void makeNewLibrary(Library library)
//    {
//        Scanner myObj = new Scanner(System.in);
//        for (int i=0;i<library.bookShelfList.size();i++)
//        {
//            if(library.bookShelfList.get(i)!=null)
//            {
//                for(int j=0;j<library.bookShelfList.get(i).booksOnShelf.length;j++)
//                {
//                    if(library.bookShelfList.get(i).booksOnShelf[j]==null)
//                    {
//                        Book book=new Book();
//                        System.out.println("enter bookname");
//                        String bookname=myObj.next();
//                        book.bookName=bookname;
//                        library.bookShelfList.get(i).booksOnShelf[j]=book;
//                    }
//                }
//            }
//        }
//    }

}
