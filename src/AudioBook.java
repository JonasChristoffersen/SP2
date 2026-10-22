public class AudioBook extends PhysicalTitle implements IAudioBook{
    private int durationInMinutes;

    public AudioBook(String literatureType, String title, int copies, int durationInMinutes) {
        super(literatureType, title, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
