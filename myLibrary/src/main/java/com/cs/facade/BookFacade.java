package com.cs.facade;

import com.cs.model.Book;
import com.cs.model.BookType;
import com.cs.service.BookService;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Setter
@Component
public class BookFacade {

    @Autowired
    private BookService service;

    public void addBook(String name, String type) {
        if (StringUtils.isBlank(name)) {
            throw new RuntimeException();
        }
        service.addBook(name, type);
    }

    public void deleteBook(Long id) {
        service.deleteBook(id);
    }

    public Collection<Book> getBooks() {
        return service.getBooks();
    }

    public void updateBook(Long id, String name, String type) {
        if (StringUtils.isBlank(name)) {
            throw new RuntimeException();
        }
        service.updateBook(id, name, type);
    }

    public Book getBook(Long id) {
        return service.getBook(id);
    }
}
