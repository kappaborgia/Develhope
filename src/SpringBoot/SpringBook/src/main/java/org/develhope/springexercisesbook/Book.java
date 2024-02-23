package org.develhope.springexercisesbook;

public class Book {
    private String title;
    private String author;
    private String genere;
    private int id;

    public Book(String title, String author, String genere, int id) {
        this.title = title;
        this.author = author;
        this.genere = genere;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
