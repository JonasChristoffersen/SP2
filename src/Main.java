public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Olga Ravn");
        PrintedBook title1 = new PrintedBook("SKØN", "Eventyr1",140,166);
        AudioBook title2 = new AudioBook("FAG","Eventyr2",140,192);
        PrintedBook title3 = new PrintedBook("SKØN", "Eventyr3",280,124);
        author1.addTitle(title1);
        author1.addTitle(title2);
        author1.addTitle(title3);

        Author author2 = new Author("Jonas");
        EBook eBook1 = new EBook("FAG","Triatlon",97,50,205,360000,false);
        author2.addTitle(eBook1);

        printStats(author1);
        printStats(author2);
    }

    public static void printStats(Author author){
        System.out.println("\"" + author.getName() + "\" gets paid: " + author.calculateRoyalties() + " DKK, for the books that " + author.getName() + " has in the library!");
    }
}
