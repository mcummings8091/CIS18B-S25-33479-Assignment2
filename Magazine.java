public class Magazine extends Item {
    private int issueNumber;

    public Magazine() {
        super();
        issueNumber = 0;
    }

    public Magazine(int issueNumber, String title, int publicationYear) {
        super(title, publicationYear); // Superclass constructor
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}