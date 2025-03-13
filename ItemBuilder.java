interface ItemBuilder {
    void buildTitle(String title);
    void buildPublicationYear(int publicationYear);
    Item getResult(); 
}