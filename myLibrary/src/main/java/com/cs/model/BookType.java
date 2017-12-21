package com.cs.model;

import lombok.Getter;

@Getter
public enum BookType {
    FANTASY("Fantasy"), DRAMA("Drama"), DETECTIVE("Detective"), HORROR("Horror");

    private String typeTitle;

    BookType(String typeTitle) {
        this.typeTitle = typeTitle;
    }
}
