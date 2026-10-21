public abstract class Title {
    private String title;
    private String literatureType;
    protected double rate;

    public Title(String literatureType, String title) {
        this.literatureType = literatureType;
        this.title = title;
    }

    public void calculateRoyalty() {

    }

    public double convertLiteratureType() {
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
