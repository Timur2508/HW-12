public class Main {

    public static void main(String[] args) {

        System.out.println("Домашняя работа № 12");

        System.out.println("Задание № 1");

        System.out.println(" ");

        Book book = new Book("Война и мир ", "Л.Н. Толстой ", 1863);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());

        System.out.println(" ");

        Book book2 = new Book("Гранатовый браслет", "А. И. Куприн", 1911);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());

        System.out.println(" ");

        Book book3 = new Book("Преступление и наказание", "Ф.М. Достоевский ", 1867);
        System.out.println("book3.name = " + book3.getName());
        System.out.println("book3.author = " + book3.getAuthor());
        System.out.println("book3.yearOfPublication = " + book3.getYearOfPublication());

        System.out.println(" ");

        System.out.println("Изменяем год публикации с помощью сеттера");
        book.setYearOfPublication(1864);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        System.out.println(" ");

        System.out.println("Задание № 2");

        System.out.println(" ");

        Author author = new Author(" Лев", "  Толстой ");
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());

        System.out.println(" ");

        Author author2 = new Author("  Александр ", "Куприн ");
        System.out.println("author2.name = " + author2.getName());
        System.out.println("author2.surname = " + author2.getSurname());

        System.out.println(" ");

        Author author3 = new Author("Федор", "Достоевский");
        System.out.println("author3.name = " + author3.getName());
        System.out.println("author3.surname = " + author3.getSurname());

    }
}