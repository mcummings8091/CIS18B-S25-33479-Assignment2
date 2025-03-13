public abstract class LibraryItemFactory {
    private ItemBuilder builder;
    
    public LibraryItemFactory(ItemBuilder builder) {
        this.builder = builder;
    }
    public Item createItem(String type, String title, int publicationYear, String extraData) {
        if (type.equals("book")) {
            BookBuilder bookBuilder = new BookBuilder();
            bookBuilder.buildTitle(title);
            bookBuilder.buildAuthor(extraData);
            bookBuilder.buildPublicationYear(publicationYear);
            return bookBuilder.getResult();
        } else {
            MagazineBuilder magazineBuilder = new MagazineBuilder();
            magazineBuilder.buildTitle(title);
            magazineBuilder.buildPublicationYear(publicationYear);
            magazineBuilder.buildIssueNumber(Integer.parseInt(extraData));
            return magazineBuilder.getResult();
        }
    }
    
    public abstract Item buildItem();
}


