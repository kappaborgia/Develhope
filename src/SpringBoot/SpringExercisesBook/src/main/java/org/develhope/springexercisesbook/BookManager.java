package org.develhope.springexercisesbook;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class BookManager {

    private List<Book> bookList = new ArrayList<>();

    public BookManager() {
        bookList.add(new Book("Il diavolo veste prada", "Lauren Weisberger", "Romanzo", 001));
        bookList.add(new Book("Inseguendo un raggio di luce", "Amedeo Balbi", "Fisica",002 ));
        bookList.add(new Book("La fisica dei perplessi", "Jim Al-khalili", "Fisica", 003));
        bookList.add(new Book("Non ti muovere", "Margaret Marzanti", "Margaret Marzanti", 004));
    }

    @GetMapping("/libri/{id}")
    public Book getBookById(@PathVariable int id){
        for(Book book : bookList){
            if(book.getId() == id){
                return book;
            }
        } return null;
    }
    @GetMapping("/libri")
    public List<Book> getAllBook(){
        return bookList;
    }

    @GetMapping("/libri/genere/{genere}")
    public List<Book> getBookType(@PathVariable String genere){
        List<Book> typeBook = new ArrayList<>();
        for(Book book : bookList){
            if(book.getGenere().equals(genere)){
                typeBook.add(book);
            }
        } return typeBook;

    }









}
}
