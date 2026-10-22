public abstract class Title {
    private String title;
    private String literatureType;
    protected final double rate = 0.067574;

    public Title(String literatureType, String title) {
        this.literatureType = literatureType;
        this.title = title;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI", "TE" -> {return 3;}
            case "LYRIK" -> {return 6;}
            case "SKØN" -> {return 1.7;}
            case "FAG" -> {return 1;}
            default -> {return 0;}
        }
    }

    abstract double calculatePoints();
}