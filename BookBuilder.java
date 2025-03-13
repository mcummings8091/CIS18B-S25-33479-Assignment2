class BookBuilder implements ItemBuilder {
    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public void buildAuthor(String author) {
        book.setAuthor(author);
    }

    public void buildISBN(String ISBN) {
        book.setISBN(ISBN);
    }

    public void buildBorrower(String borrower) {
        book.borrowItem(borrower);
    }

    @Override
    public void buildTitle(String title) {
        this.book.setTitle(title);
    }

    @Override
    public void buildPublicationYear(int publicationYear) {
        this.book.setPublicationYear(publicationYear);
    }

    @Override
    public Item getResult() {
        return book;
    }
}