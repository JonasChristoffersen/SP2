public class PrintedBook extends PhysicalTitle{
    private int pages;

    public PrintedBook(String literatureType, String title, int copies, int pages) {
        super(literatureType, title, copies);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}