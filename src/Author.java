import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    //This class only needs logic inside calculateRoyalties()!

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double totalRoyalties = 0.0;
        for (Title title : titles) {
            totalRoyalties += title.calculateRoyalty();
        }
        return Math.round(totalRoyalties * 100.0) / 100.0; //Using Math.round(method * 100) / 100.0 to only show first 2 decimals
    }

    public String getName() {
        return name;
    }
}
