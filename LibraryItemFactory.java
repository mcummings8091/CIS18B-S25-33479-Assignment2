

public class LibraryItemFactory {

    public Item createItem(String type, String title, int publicationYear, String extraData) {
        if (type.toLowerCase().equals("book")) {
            BookBuilder bookBuilder = new BookBuilder();
            bookBuilder.buildTitle(title);
            bookBuilder.buildAuthor(extraData);
            bookBuilder.buildPublicationYear(publicationYear);
            return bookBuilder.getResult();
        } else if (type.toLowerCase().equals("magazine")) {
            MagazineBuilder magazineBuilder = new MagazineBuilder();
            magazineBuilder.buildTitle(title);
            magazineBuilder.buildPublicationYear(publicationYear);
            magazineBuilder.buildIssueNumber(Integer.parseInt(extraData));
            return magazineBuilder.getResult();
        } else {
            System.out.println("Invalid type: " + type);
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }
    
}


