package exercicios.Livraria.Models;

import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> findBookByTitle(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                return Optional.of(book);
            }
        }
        return Optional.empty();

    }
    public Optional<Book> findBookByIsbn(String isbn) {
        for (Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                return Optional.of(book);

            }
        }
        return Optional.empty();

    }

    public void applyDiscountToBooksByAuthor(String author, double discountPercentage) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.setPrice(book.getPrice()-book.getPrice()*discountPercentage);
            }
        }

    }

    public int getPagesByTitle(String title) {
        for (Book book : books ) {
            if (book.getTitle().equals(title)) {
                return book.getPages();
            }
        }
        return -1;

    }

    public double calculateTotalPriceByAuthor(String author) {
        double valorTotal = 0;
        for(Book book : books) {
            if(book.getAuthor().equals(author)) {
                valorTotal += book.getPrice();
            }
        }
        return valorTotal;

    }
}
