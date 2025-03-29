package com.example.library_management.controller;

import com.example.library_management.dto.BookDto;
import com.example.library_management.models.Book;
import com.example.library_management.service.BookService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // all api calls
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long bookId){
        Book book = bookService.getBookById(bookId);

        if(book == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(book);
    }

//    @GetMapping("/title/{title}")
//    public void getBookByTitle(){
//
//    }

    @PostMapping
    public Book addBook(){
        return bookService.addBook(new Book());
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long bookId, @RequestBody Book book){
        Book updateBook = bookService.getBookById(bookId);
        if(updateBook == null){
            throw new RuntimeException("Book with id " + bookId + " not found");
        }
        return bookService.updateBook(bookId, updateBook);
    }

    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable("id") Long bookId){
        return bookService.deleteBook(bookId);
    }
}
