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

    public void addAccount(String name, BookType type) {
        dao.createBook(name, type);
    }

    public void deleteAccount(Long id) {
        dao.deleteBook(id);
    }

    public Book getAccount(Long id) {
        return dao.getBook(id);
    }

    public Collection<Book> getAccounts() {
        return dao.getAllBooks();
    }

    public void updateAccount(Long id, String name, BookType type) {
        dao.updateBook(id, name, type);
    }
}
