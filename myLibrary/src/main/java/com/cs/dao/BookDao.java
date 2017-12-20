package com.cs.dao;

import com.cs.model.Book;
import com.cs.model.BookType;

import java.util.Collection;

public interface BookDao {

    void createBook(String bookName, BookType bookType);

    Book getBook(Long id);

    Collection<Book> getAllBooks();

    void deleteBook(Long id);

    void updateBook(Long id, String name, BookType bookType);
}
