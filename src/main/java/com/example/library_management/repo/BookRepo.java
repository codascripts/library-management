package com.example.library_management.repo;

import com.example.library_management.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {
    // searching by title
    Optional<Book> findByTitle(String title);
}
