import java.util.*;

public class Library  extends BookShelf{
    String libraryName;
    ArrayList<BookShelf> bookShelfList;
    public Library()
    {
        this.libraryName="tomer's Library";
        this.bookShelfList=new ArrayList<BookShelf>();

    }
    public Library(String libraryName)
    {
        this.libraryName=libraryName;
    }
    public void addBookToShelf(int placement,Book newBook)
    {
        this.bookShelfList.get(placement).booksOnShelf[this.bookShelfList.get(placement).numOfBooksOnShelf()+1]=newBook;
    }
//    available not possible
    public void addBook(int BookShelfPlacement,int LibraryPlacement,Library Library,Book book)
    {
    if(Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]==null
            && Library.bookShelfList.get(LibraryPlacement).canBeAdded()==true)
        Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]=book;
    }

    public  void addBookByName(String bookName,Library library)
    {
        Book book=new Book() {};
        book.bookName=bookName;
        for (int i=0;i<library.bookShelfList.size();i++)
        {
            for (int j=0;j<library.bookShelfList.get(i).booksOnShelf.length;j++)
            {
                if(library.bookShelfList.get(i).booksOnShelf[j]==null)
                {
                    library.bookShelfList.get(i).booksOnShelf[j]=book;
                }
            }
        }
    }

    public static void deleteBookByPlace(int BookShelfPlacement,int LibraryPlacement,Library Library)
    {
        if(Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]!=null)
            Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]=null;
    }
    public void removeBookById(String bookName,int Id)
    {
        this.bookShelfList.get(Id).deleteByBookName(bookName);

    }
    public static void deleteByName(String bookName,Library Library)
    {
        for (int i=0;i<Library.bookShelfList.size();i++)
        {
            Library.bookShelfList.get(i).deleteByBookName(bookName);
        }
    }
    public void sortTheLibrary()
    {
        for (int i=0;i<this.bookShelfList.size();i++)
        {
            this.bookShelfList.get(i).sortAlphabetically();
        }
    }
<<<<<<< HEAD
    public  void printLibrary(Library Library)
    {
        for (int i=0;i<Library.bookShelfList.size();i++)
        {
            System.out.println("BookShelf number + BooksNames and Placements" +" "+ i);
            Library.bookShelfList.get(i).printBookShelf();
        }
    }
=======
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
>>>>>>> tomernew

}
