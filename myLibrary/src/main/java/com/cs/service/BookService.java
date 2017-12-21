package com.cs.service;

import com.cs.dao.BookDao;
import com.cs.model.Book;
import com.cs.model.BookType;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Setter
@Service
public class BookService {

    @Autowired
    private BookDao dao;

    public void addBook(String name, String type) {
        dao.createBook(name, type);
    }

    public void deleteBook(Long id) {
        dao.deleteBook(id);
    }

    public Book getBook(Long id) {
        return dao.getBook(id);
    }

    public Collection<Book> getBooks() {
        return dao.getAllBooks();
    }

    public void updateBook(Long id, String name, String type) {
        dao.updateBook(id, name, type);
    }
}
