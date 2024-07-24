package cl.praxis.gestorbiblioteca.controller;

import cl.praxis.gestorbiblioteca.entity.Book;
import cl.praxis.gestorbiblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    private final IBookService bookService;

    @Autowired
    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String books(Model model) {
        model.addAttribute("books", getBooks());
        return "books";
    }

    private List<Book> getBooks() {
        return bookService.findAll();
    }
}
