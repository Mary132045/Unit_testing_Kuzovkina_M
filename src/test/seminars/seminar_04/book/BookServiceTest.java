package seminars.seminar_04.book;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


import main.java.seminars.seminar_04.book.Book;
import main.java.seminars.seminar_04.book.BookRepository;
import main.java.seminars.seminar_04.book.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        Book book = new Book("1", "Book1", "Author1");
        when(bookRepository.findById("1")).thenReturn(book);

        Book foundBook = bookService.findBookById("1");

        assertNotNull(foundBook);
        assertEquals("1", foundBook.getId());
        assertEquals("Book1", foundBook.getTitle());
        assertEquals("Author1", foundBook.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);

        List<Book> foundBooks = bookService.findAllBooks();

        assertNotNull(foundBooks);
        assertEquals(2, foundBooks.size());
        assertEquals("Book1", foundBooks.get(0).getTitle());
        assertEquals("Book2", foundBooks.get(1).getTitle());
    }
}