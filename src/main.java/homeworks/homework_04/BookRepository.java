package main.java.homeworks.homework_04;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
