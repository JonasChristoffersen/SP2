public abstract class PhysicalTitle extends Title{
    protected int copies;

    public PhysicalTitle(String literatureType, String title, int copies) {
        super(literatureType, title);
        this.copies = copies;
    }
}