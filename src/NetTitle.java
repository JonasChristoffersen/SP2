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
        return 0.0; //Fix return
    }

    private int getUseFactor() {
        return 0; //Fix this return
    }

    protected int getReach() {
        return reach;
    }

    public int getAvailability() {
        return availability;
    }

    public int getUse() {
        return use;
    }
}
