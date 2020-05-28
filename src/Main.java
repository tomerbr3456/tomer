import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void makeNewLibrary(Library library)
    {
        Scanner myObj = new Scanner(System.in);
        for (int i=0;i<library.bookShelfList.size();i++)
        {
            if(library.bookShelfList.get(i)!=null)
            {
                for(int j=0;j<library.bookShelfList.get(i).booksOnShelf.length;j++)
                {
                    if(library.bookShelfList.get(i).booksOnShelf[j]==null)
                    {
                        Book book=new Book();
                        System.out.println("enter bookname");
                        String bookname=myObj.next();
                        book.bookName=bookname;
                        library.bookShelfList.get(i).booksOnShelf[j]=book;
                    }
                }
            }
        }
    }
    public static  void addBook(int BookShelfPlacement,int LibraryPlacement,Library Library,Book book)
    {
        if(Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]==null
                && Library.bookShelfList.get(LibraryPlacement).canBeAdded()==true)
            Library.bookShelfList.get(LibraryPlacement).booksOnShelf[BookShelfPlacement]=book;
    }
    public static void addBookByName(String bookName,Library library)
    {
        Book book=new Book();
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
    public static void deleteByName(String bookName,Library Library)
    {
        for (int i=0;i<Library.bookShelfList.size();i++)
        {
            Library.bookShelfList.get(i).deleteByBookName(bookName);
        }
    }
    public static void printLibrary(Library Library)
    {
        for (int i=0;i<Library.bookShelfList.size();i++)
        {
            System.out.println("BookShelf number + BooksNames and Placements" +" "+ i);
            Library.bookShelfList.get(i).printBookShelf();
        }
    }
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Library library=new Library();
        Library xy=new Library();
        makeNewLibrary(xy);
        Book a=new Book();
        Book b=new Book();
        Book c=new Book();
        Book d=new Book();
        Book e=new Book();
        Book f=new Book();
        Book g=new Book();
        Book h=new Book();
        Book i=new Book();
        Book j=new Book();
        Book k=new Book();
        Book l=new Book();
        Book m=new Book();
        Book n=new Book();
        Book o=new Book();
        Book p=new Book();
        Book q=new Book();
        Book r=new Book();
        Book s=new Book();
        Book t=new Book();
        Book u=new Book();
        Book v=new Book();
        Book w=new Book();
        Book x=new Book();
        Book y=new Book();
        a.bookName="a";
        b.bookName="b";
        c.bookName="z";
        d.bookName="t";
        e.bookName="e";
        f.bookName="k";
        g.bookName="g";
        h.bookName="h";
        i.bookName="i";
        j.bookName="j";
        k.bookName="k";
        l.bookName="l";
        m.bookName="m";
        n.bookName="n";
        o.bookName="o";
        p.bookName="p";
        q.bookName="q";
        r.bookName="r";
        s.bookName="s";
        t.bookName="t";
        u.bookName="u";
        v.bookName="v";
        w.bookName="w";
        x.bookName="x";
        y.bookName="y";
        BookShelf shelf1=new BookShelf();
        BookShelf shelf2=new BookShelf();
        BookShelf shelf3=new BookShelf();
        BookShelf shelf4=new BookShelf();
        BookShelf shelf5=new BookShelf();
        shelf1.booksOnShelf[0]=a;
        shelf1.booksOnShelf[1]=b;
        shelf1.booksOnShelf[2]=c;
        shelf1.booksOnShelf[3]=d;
        shelf1.booksOnShelf[4]=e;
        shelf2.booksOnShelf[0]=f;
        shelf2.booksOnShelf[1]=g;
        shelf2.booksOnShelf[2]=h;
        shelf2.booksOnShelf[3]=i;
        shelf2.booksOnShelf[4]=j;
        shelf3.booksOnShelf[0]=k;
        shelf3.booksOnShelf[1]=l;
        shelf3.booksOnShelf[2]=m;
        shelf3.booksOnShelf[3]=n;
        shelf3.booksOnShelf[4]=o;
        shelf4.booksOnShelf[0]=p;
        shelf4.booksOnShelf[1]=q;
        shelf4.booksOnShelf[2]=r;
        shelf4.booksOnShelf[3]=s;
        shelf4.booksOnShelf[4]=t;
        shelf5.booksOnShelf[0]=u;
        shelf5.booksOnShelf[1]=v;
        shelf5.booksOnShelf[2]=w;
        shelf5.booksOnShelf[3]=x;
        shelf5.booksOnShelf[4]=y;
        library.bookShelfList.add(shelf1);
        library.bookShelfList.add(shelf2);
        library.bookShelfList.add(shelf3);
        library.bookShelfList.add(shelf4);
        library.bookShelfList.add(shelf5);
        System.out.println("Enter 1 to add book by placement");
        System.out.println("Enter 2 to add book by name");
        System.out.println ("Enter 3 to delete book by placement");
        System.out.println("Enter 4 to delete book by name");
        System.out.println("Enter 5 to sort the library");
        System.out.println("Enter 6 to print the library");

        while (true) {
            System.out.println("Enter number between 1 to 6");
            int userInput = myObj.nextInt();
            System.out.println(userInput);
            if (userInput == 1) {

                System.out.println("enter BookShelfPlacement and LibraryPlacement");
                int BookShelfPlacement = myObj.nextInt();
                int LibraryPlacement = myObj.nextInt();
                if((BookShelfPlacement<0 || BookShelfPlacement>5)||(LibraryPlacement<0||LibraryPlacement>5) )
                {
                    System.out.println("Wrong Input");
                }
                else {
                    Book book = new Book();
                    book.bookName = "tomerBook";
                    addBook(BookShelfPlacement, LibraryPlacement, library, book);
                }
            }
            else if (userInput==2)
            {
                System.out.println("insert BookName");
                String bookName = myObj.next();
                addBookByName(bookName,library);
            }
            else if (userInput == 3) {
                System.out.println("enter BookShelfPlacement and LibraryPlacement");
                String userInput6 = myObj.next();
                String userInput7 = myObj.next();
                int userInput8 = Integer.parseInt(userInput6);
                int userInput9 = Integer.parseInt(userInput7);
                deleteBookByPlace(userInput8, userInput9, library);
            } else if (userInput == 4) {
                System.out.println("enter bookname");
                String bookName = myObj.next();
                deleteByName(bookName,library);
                System.out.println(bookName);
            } else if (userInput == 5) {
                library.sortTheLibrary();
            } else if (userInput == 6) {
                printLibrary(library);
            }
        }


    }




}