import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class BookShelf extends Book {
    Book [] booksOnShelf;
    int shelfId;
    public int numOfBooksOnShelf()
    {
        int counter=0;
        for(int i=0;i<this.booksOnShelf.length;i++)
        {
            if(this.booksOnShelf[i]!=null)
            {
                counter++;
            }
        }
        return counter;
    }
    public BookShelf()
    {
        this.booksOnShelf=new Book [5];

    }
    public int getPagesOnShelf()
    {
        int counter=0;
        for (int i=0;i<this.numOfBooksOnShelf();i++)
        {
            if(this.booksOnShelf[i]!=null)
                counter+=this.booksOnShelf[i].numOfPages;
        }
        return counter;
    }
    public boolean canBeAdded()
    {
        if (this.getPagesOnShelf()>1500||this.numOfBooksOnShelf()>5)
        {
            System.out.println("book cannot be added");
            return false;
        }
        return true;
    }
    public void deleteBook(int bookNum)
    {
        if(this.numOfBooksOnShelf()>bookNum && bookNum>0)
        {
            if(this.booksOnShelf[bookNum]!=null)
            {
                this.booksOnShelf[bookNum]=null;
            }

        }
        else
            System.out.println("this book doesnt exist");

    }
    public void deleteByBookName(String bookName)
    {
        for (int i=0;i<this.booksOnShelf.length;i++)
        {
            if(this.booksOnShelf[i].bookName.equals(bookName))
            {
                this.booksOnShelf[i]=null;
            }
        }
    }
    public void setDefultBookShelf()
    {
        this.shelfId=999;
    }
    public void printBookShelf()
    {
        for(int i=0;i<this.booksOnShelf.length;i++)
        {
            if(this.booksOnShelf[i]!=null)
                System.out.println(this.booksOnShelf[i].bookName + "  " + i +"  name of the book and placement");
            else
                System.out.println("null"+ i);
        }
    }
    public void sortAlphabetically()
    {
        if(this.numOfBooksOnShelf()<5)
            System.out.println("the library isnt full");
        else {
            Arrays.sort(this.booksOnShelf, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.bookName.compareTo(o2.bookName);
                }
            });
        }
    }

}