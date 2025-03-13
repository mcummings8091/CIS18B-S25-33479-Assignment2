interface IBorrowable {
    public void borrowItem(String borrower);
    public void returnItem();
    public boolean isBorrowed();
}