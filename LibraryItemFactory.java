public abstract class LibraryItemFactory {
    public Item createItem(String type, String title, int publicationYear, String extraData) {
        if (type.equals("book")) {
            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(extraData);
            book.setPublicationYear(publicationYear);
            return book;
        } else {
            Magazine magazine = new Magazine();
            magazine.setTitle(title);
            magazine.setPublicationYear(publicationYear);
            magazine.setIssueNumber(publicationYear);
            return magazine;
        }
    }
    
    public abstract Item buildItem();
}