public class EBook extends NetTitle{
    private int characters;
    private boolean illustrated;

    public EBook(String literatureType, String title, int availability, int reach, int use, int characters, boolean illustrated) {
        super(literatureType, title, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages() {
        if (illustrated) {
            return (characters / 1800 + 20) * 1.1;
        } else {
            return characters / 1800 + 20;
        }
    }

    @Override
    double calculatePoints() {
        return calculatePages() * convertLiteratureType() * getPseudoCopies();
    }
}
