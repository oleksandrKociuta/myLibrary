package com.cs.mapper;

import com.cs.model.Book;
import com.cs.model.BookType;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getLong("id"));
        book.setName(resultSet.getString("name"));
        BookType type = BookType.valueOf(resultSet.getString("type"));
        book.setType(type);
        return book;
    }
}
