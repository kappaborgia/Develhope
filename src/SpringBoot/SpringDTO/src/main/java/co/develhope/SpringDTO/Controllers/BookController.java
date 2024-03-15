package co.develhope.SpringDTO.Controllers;

import co.develhope.SpringDTO.Service.BookService;
import co.develhope.SpringDTO.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    Book addBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @GetMapping("list")
    List<Book> getAllBook(){
        return bookService.returnList();
    }
    @PutMapping("/update/{id}")
    Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id,book);
    }
}
