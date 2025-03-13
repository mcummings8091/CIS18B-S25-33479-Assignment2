import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String borrower, userQuery;


        LibraryItemFactory factory = new LibraryItemFactory();
        Library itemCollection = Library.getInstance();

        System.out.println("Enter your name: ");
        borrower = keyboardInput.nextLine();

        System.out.println("\n\nCreating Books...");
        Item book1 = factory.createItem("book", "Heart Talk", 2018, "Cleo Wade");
        Item book2 = factory.createItem("book", "Scythe", 2016, "Neal Schusterman");
        itemCollection.addItem(book1); //Add first book to collection
        itemCollection.addItem(book2); //Add second book to collection

        System.out.println("Lending books...\n\n");
        System.out.println(book1.getTitle() + " Borrowoed by: " + borrower);
        System.out.println(book2.getTitle() + " Borrowoed by: " + borrower);
        

        System.out.println("\n\nCreating Magazine...");
        itemCollection.addItem(factory.createItem("magazine", "Thrasher Magazine", 2018, "500"));

        System.out.println("\n\nAvailable Items:");
        itemCollection.listAvailableItems(); //List items to user

        System.out.println("\n\nEnter item title: "); //Prompt user for input
        userQuery = keyboardInput.nextLine();

        itemCollection.findItembyTitle(userQuery);

    }
}