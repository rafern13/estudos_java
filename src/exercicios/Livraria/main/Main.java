package exercicios.Livraria.main;

import exercicios.Livraria.Models.Book;
import exercicios.Livraria.Models.Library;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Effective Java", "Joshua Bloch", 416, "1234567890", 50.0),
                new Book("Java Concurrency in Practice", "Brian Goetz", 384, "0987654321", 45.0),
                new Book("Clean Code", "Robert C. Martin", 464, "1122334455", 40.0)
        );

        Library library = new Library(books);

        Optional<Book> book1 = library.findBookByTitle("Effective Java");
        book1.ifPresent(b -> System.out.println("Livro encontrado: "+b.getTitle()));

        library.applyDiscountToBooksByAuthor("Joshua Bloch", 10);

        int pages = library.getPagesByTitle("Clean Code");
        System.out.println("Páginas: " + pages);

        // Testar o preço total
        double totalPrice = library.calculateTotalPriceByAuthor("Brian Goetz");
        System.out.println("Preço total: " + totalPrice);
    }


}
