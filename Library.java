
import java.util.ArrayList;

public class Library {

    private static Library instance;

    private ArrayList<Item> collection;

    private Library() {
        collection = new ArrayList<>();
    }

    public static Library getInstance() {
        // Double checked locking, prevents two threads from accessing 
        if (instance == null) {
            synchronized (Library.class) {
                if (instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public void addItem(Item item) {
        collection.add(item);
    }

    public void listAvailableItems() {
        for (Item item : collection) {
            System.out.println(item.getTitle());
        }
    }       

    public void findItembyTitle(String title) {
        for (Item item : collection) {
            if (item.getTitle().equals(title)) {
                System.out.println("Title: " + item.getTitle());
                System.out.println("Publication Year: " + item.getPublicationYear());
            }
        }
    }
}