package com.example.SpringWeb2.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Book {
    private Long id;
    private String title;
    private String isbn;

    public Book(Long id, String title, String isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
    }

    // Getters and setters can be added here if needed
    
}
