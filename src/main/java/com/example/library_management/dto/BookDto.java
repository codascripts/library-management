package com.example.library_management.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {
    private String title;
    private String bookName;
    private String author;
    private String genre;
    private String availabilityStatus;
}
