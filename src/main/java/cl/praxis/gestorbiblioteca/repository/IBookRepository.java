package cl.praxis.gestorbiblioteca.repository;

import cl.praxis.gestorbiblioteca.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(String author);

    List<Book> findAllByTitle(String title);
}
