public abstract class NetTitle extends Title{
    private int availability;
    private int reach;
    private int use;

    public NetTitle(String literatureType, String title, int availability, int reach, int use) {
        super(literatureType, title);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected double getPseudoCopies() {
        return (reach * 5) + (availability * 0.5) + use;
    }

    private int getUseFactor() {
        return 0; //This get-method never gets used -> Therefor
    }
}
