public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Olga Ravn");
        PrintedBook t1 = new PrintedBook("SKØN", "Eventyr1",140,166);
        AudioBook t2 = new AudioBook("SKØN","Eventyr2",140,192);

        a1.addTitle(t1);
        a1.addTitle(t2);

        System.out.println("olga får: " + a1.calculateRoyalties());

        Author a2 = new Author("Jonas");
        EBook e1 = new EBook("FAG","Triatlon",97,50,205,360000,false);

        a2.addTitle(e1);

        System.out.println("Jonas får: " + a2.calculateRoyalties());

    }
}
