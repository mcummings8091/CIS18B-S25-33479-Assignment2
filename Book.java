
public class Book extends Item implements IBorrowable {
    private String author;
    private String ISBN;
    private String borrorwer;

    public Book() {
        super();
        author = "";
        ISBN = "";
        borrorwer = "";
    }

    public Book(String author, String ISBN, String title, int publicationYear) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // IBorrowable interface implementaiton
    @Override
    public void borrowItem(String borrower) {
        if (this.borrorwer == null || this.borrorwer.length() == 0) {
            this.borrorwer = borrower;
        } else {
            System.out.println(this.getTitle() + " is currently borrowed!");
        }
    }

    @Override
    public void returnItem() {
        borrorwer = ""; // Clear borrower field
    }

    @Override
    public boolean isBorrowed() {
        return this.borrorwer.length() != 0; // If borrowed lenght is not 0, someone is borrowing the book.
        // Expression will evaluate to true or false
    } 
}