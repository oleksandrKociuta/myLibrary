package com.cs.controller;

import com.cs.facade.BookFacade;
import com.cs.model.Book;
import com.cs.model.BookType;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@RestController
@Setter
public class BookController {

    @Autowired
    private BookFacade bookFacade;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addBook(@RequestParam String name, @RequestParam BookType type) {
        bookFacade.addBook(name, type);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ModelAndView deleteBook(@RequestParam Long id) {
        bookFacade.deleteBook(id);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/getAllBooks", method = RequestMethod.GET)
    public ModelAndView getAllBooks(ModelMap map) {
        Collection<Book> books = bookFacade.getBooks();
        map.put("booksList", books);
        return new ModelAndView("booksPage", map);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateBook(@RequestParam Long id, @RequestParam String name, @RequestParam BookType type) {
        bookFacade.updateBook(id, name, type);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public ModelAndView getBookById(@RequestParam Long id, ModelMap map) throws Exception {
        Book book = bookFacade.getBook(id);
        map.put("book", book);
        return new ModelAndView("chosenBookPage", map);
    }
}
