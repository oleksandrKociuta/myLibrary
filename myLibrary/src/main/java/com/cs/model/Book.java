package com.cs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {
    private long id;
    private String name;
    private BookType type;

    public Book(long id, String name, BookType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book : " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type.getTypeTitle();
    }
}
