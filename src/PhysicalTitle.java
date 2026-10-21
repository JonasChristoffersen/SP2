public abstract class PhysicalTitle extends Title{
    protected int copies;

    //This class is DONE!

    public PhysicalTitle(String literatureType, String title, int copies) {
        super(literatureType, title);
        this.copies = copies;
    }
}