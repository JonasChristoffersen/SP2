public class EAudioBook extends NetTitle implements IAudioBook{
    private int durationInMinutes;

    public EAudioBook(String literatureType, String title, int availability, int reach, int use, int durationInMinutes) {
        super(literatureType, title, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    double calculatePoints() {
        return (durationInMinutes / 2) * convertLiteratureType() * ((getReach() * 5) + (getAvailability() * 0.5) + getUse());
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
