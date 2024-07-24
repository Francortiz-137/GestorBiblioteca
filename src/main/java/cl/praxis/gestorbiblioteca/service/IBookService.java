package cl.praxis.gestorbiblioteca.service;

import cl.praxis.gestorbiblioteca.entity.Book;

import java.util.List;

public interface IBookService {
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);
    void deleteBookById(Long id);
    List<Book> findAll();
    Book findById(Long id);
    List<Book> findAllByAuthor(String author);
    List<Book> findAllByTitle(String title);
}
