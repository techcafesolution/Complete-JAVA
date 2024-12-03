package Programes;

public class Challenges05 {
    public static void main(String[] args) {
        Book b=new Book("Science", "Stiphen Hukins","1");
        Book b1=new Book("2");
        b.getTotalBooks();
        b.bookDetails();
        b.borrowBook();
        b1.borrowBook();
        b.returnBook();
        b1.returnBook();

    }
}
class Book{
    String title;
    String author;
    String isbn;
    static int totalBook;
    static boolean isBorrowed;
    static{
        totalBook=0;
    }
    {//Count Object
        totalBook++;
    }
    Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    Book(String isbn){
        this("undefined","undefined",isbn);
    }
    public void bookDetails(){
        System.out.println("Book Name is:: "+title);
        System.out.println("Author Name is:: "+author);
        System.out.println("ISBN Number is:: "+isbn);
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed...");
        }else{
            isBorrowed=true;
            System.out.println("Let's read the book: "+this.title);
        }
    }
    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Thank you, please leave a review...");
        }else{
            System.out.println("Book is already exist...");
        }
    }
    public void getTotalBooks(){
        System.out.println("Total No of Book is:: "+totalBook);
    }
}
