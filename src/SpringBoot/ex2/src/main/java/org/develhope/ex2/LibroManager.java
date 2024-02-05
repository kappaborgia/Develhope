package org.develhope.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class LibroManager {
    private List<Libro> bookList = new ArrayList<>();

    public LibroManager() {
        bookList.add(new Libro(001, "Il diavolo veste prada", "Lauren Weisberger", "Romanzo"));
        bookList.add(new Libro(002, "Inseguendo un raggio di luce", "Amedeo Balbi", "Fisica"));
        bookList.add(new Libro(003, "La fisica dei perplessi", "Jim Al-khalili", "Fisica"));
        bookList.add(new Libro(004, "Non ti muovere", "Margaret Marzanti", "Giallo"));
    }

    @GetMapping("/libri/{id}")
    public Libro getBookById(@PathVariable int id){
        for(Libro libro : bookList){
            if(libro.getId() == id){
                return libro;
            }
        } return null;
    }
    @GetMapping("/libri")
    public List<Libro> getAllBook(){
        return bookList;
        }

    @GetMapping("/libri/genere/{genere}")
    public List<Libro> getBookType(@PathVariable String genere){
        List<Libro> typeBook = new ArrayList<>();
        for(Libro libro : bookList){
            if(libro.getGenere().equals(genere)){
                typeBook.add(libro);
            }
        } return typeBook;

    }









    }



