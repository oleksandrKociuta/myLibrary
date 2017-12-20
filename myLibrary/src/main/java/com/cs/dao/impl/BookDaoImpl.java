package com.cs.dao.impl;

import com.cs.dao.BookDao;
import com.cs.mapper.BookMapper;
import com.cs.model.Book;
import com.cs.model.BookType;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Setter
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private BookMapper mapper;

    @Override
    public void createBook(String bookName, BookType bookType) {
        String SQL = "INSERT INTO Book (name, type) VALUES (?, ?)";
        template.update(SQL, bookName, bookType);

    }

    @Override
    public Book getBook(Long id) {
        String SQL = "SELECT * FROM Book WHERE id = ?";
        return template.queryForObject(SQL, new Object[]{id}, mapper);
    }

    @Override
    public Collection<Book> getAllBooks() {
        String SQL = "SELECT * FROM Book";
        return template.query(SQL, mapper);
    }

    @Override
    public void deleteBook(Long id) {
        String SQL = "DELETE FROM Book WHERE id = ?";
        template.update(SQL, id);
    }

    @Override
    public void updateBook(Long id, String name, BookType bookType) {
        String SQL = "UPDATE Book SET name = ?, type = ? WHERE id = ?";
        template.update(SQL, name, bookType, id);
    }
}
