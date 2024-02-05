package org.develhope.ex2;

public class Libro {
    private int id;
    private String titolo;
    private String author;
    private String genere;

    public Libro(int id, String titolo, String author, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.author = author;
        this.genere = genere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
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

    @Override
    public String toString() {
        return "Libreria:" + '\n' +
                "TITOLO: " + titolo + '\'' + " AUTHOR: " + author + '\n' +
                "ID: " + id + " Genere: " + genere;
    }
}
