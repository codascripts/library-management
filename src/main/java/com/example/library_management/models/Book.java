package com.example.library_management.models;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private Long bookId;
    @NotEmpty(message = "Title is required")
    private String title;
    private String bookName;
    private String author;
    private String genre;
    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availabilityStatus;
}
