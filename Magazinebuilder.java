class MagazineBuilder implements ItemBuilder {
    private Magazine magazine;

    public MagazineBuilder() {
        this.magazine = new Magazine();
    }

    public void buildIssueNumber(int issueNumber) {
        magazine.setIssueNumber(issueNumber);
    }

    @Override
    public void buildTitle(String title) {
        this.magazine.setTitle(title);
    }

    @Override
    public void buildPublicationYear(int publicationYear) {
        this.magazine.setPublicationYear(publicationYear);
    }

    @Override
    public Item getResult() {
        return magazine;
    }
}