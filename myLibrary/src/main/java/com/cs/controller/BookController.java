package com.cs.controller;

import com.cs.facade.BookFacade;
import com.cs.model.Book;
import com.cs.model.BookType;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Setter
@RestController
public class BookController {

    @Autowired
    private BookFacade bookFacade;

    @PostMapping(value = "/add")
    public ModelAndView addBook(@RequestParam String name, @RequestParam String type) {
        bookFacade.addBook(name, type);
        return new ModelAndView("index");
    }

    @PostMapping(value = "/delete")
    public ModelAndView deleteBook(@RequestParam Long id) {
        bookFacade.deleteBook(id);
        return new ModelAndView("index");
    }

    @GetMapping(value = "/getAllBooks")
    public ModelAndView getAllBooks(ModelMap map) {
        Collection<Book> books = bookFacade.getBooks();
        map.put("booksList", books);
        return new ModelAndView("booksPage", map);
    }

    @PostMapping(value = "/update")
    public ModelAndView updateBook(@RequestParam Long id, @RequestParam String name, @RequestParam String type) {
        bookFacade.updateBook(id, name, type);
        return new ModelAndView("index");
    }

    @PostMapping(value = "/getById")
    public ModelAndView getBookById(@RequestParam Long id, ModelMap map) throws Exception {
        Book book = bookFacade.getBook(id);
        map.put("book", book);
        return new ModelAndView("chosenBookPage", map);
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        return new ModelAndView("error/genericException");
    }
}
