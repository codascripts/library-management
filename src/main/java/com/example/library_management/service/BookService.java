package com.example.library_management.service;

import com.example.library_management.dto.BookDto;
import com.example.library_management.models.Book;
import com.example.library_management.repo.BookRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public Book getBookById(Long id){
        return bookRepo.findById(id).orElse(null);
    }

    public Book getBookByTitle(String title){
        return bookRepo.findByTitle(title).orElse(null);
    }

    public Book addBook(Book addedBook){
        return bookRepo.save(addedBook);
    }

    public Book updateBook(Long id, Book updateBook){
        Book existingBook = new Book();
        updateBook.setBookId(existingBook.getBookId());
        updateBook.setTitle(existingBook.getTitle());
        updateBook.setBookName(existingBook.getBookName());
        updateBook.setAuthor(existingBook.getAuthor());
        updateBook.setGenre(existingBook.getGenre());
        updateBook.setAvailabilityStatus(existingBook.getAvailabilityStatus());

        return bookRepo.save(updateBook);
    }

    public Book deleteBook(Long id){
        Book book = bookRepo.findById(id).orElse(null);
        if(book != null){
            bookRepo.deleteById(id);
        }
        return book;
    }
}
