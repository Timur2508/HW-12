public class Main {

    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author viktorPelevin = new Author("Viktor", "Pelevin");

        Book heartsInAtlantis = new Book("Hearts In Atlantis", stephenKing, 1997);
        Book generationP = new Book("Generation «П»", viktorPelevin, 1998);

        generationP.setIssueYear(1999);

        // print out Author
        System.out.println(stephenKing); // Автор{имя='Stephen', фамилия='King'}
        System.out.println(viktorPelevin); // Автор{имя='Viktor', фамилия='Pelevin'}

        // print out Book
        System.out.println(heartsInAtlantis);
        System.out.println(generationP);

        // equals and hashCode
        Author steveKing = new Author("Steve", "King");
        System.out.println(stephenKing.equals(steveKing)); // false

        Author stevenKing = new Author("Stephen", "King");
        System.out.println(stephenKing.equals(stevenKing)); // true

        Book heartsInAtlantis2 = new Book("Hearts In Atlantis", stevenKing, 2005);
        System.out.println(heartsInAtlantis2.equals(heartsInAtlantis)); // true

        Book heartsInAtlantis3 = new Book("Hearts In Atlantis", viktorPelevin, 1997);
        System.out.println(heartsInAtlantis3.equals(heartsInAtlantis)); // false
        System.out.println(generationP.equals(heartsInAtlantis3)); // false
    }
}