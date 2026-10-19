package problem3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(2);
        Book book = new Book("Java Basics", "Ali", 200);
        Magazine magazine = new Magazine("Science", "October", 2026);

        System.out.println("Add book: " + library.add(book));
        System.out.println("Add magazine: " + library.add(magazine));

        System.out.println("\nDocuments:");
        library.displayDocuments();

        System.out.println("\nAuthors:");
        library.displayAuthors();

        System.out.println("\nFind the book:");
        System.out.println(library.document(book.getNumRec()));

        System.out.println("\nDelete magazine: " + library.delete(magazine));

        System.out.println("\nDocuments after deletion:");
        library.displayDocuments();
    }
}
