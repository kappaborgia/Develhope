package co.develhope.SpringDTO.Service;

import co.develhope.SpringDTO.DTO.BookDTO;
import co.develhope.SpringDTO.Repositories.BookRepository;
import co.develhope.SpringDTO.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book){
        // crea un libro
        return bookRepository.save(book);
    }
    public BookDTO getBookDTObyId(Long id){
        // ottieni un libro in formato DTO
        Book book = bookRepository.findById(id).orElse(null);
        return convertToDTO(book);
    }

    public List<Book> returnList(){
        // ritorna la lista di libri
        return bookRepository.findAll();
    }
    public List<BookDTO> listDTO(){
        // ritorna la lista di libri in formato DTO
        List<Book> books = bookRepository.findAll();
        List<BookDTO> bookDTOS = new ArrayList<>();
        for(Book book : books){
            bookDTOS.add(convertToDTO(book));
        }
        return bookDTOS;
    }

    public Book updateBook(Long id, Book book){
        bookRepository.findById(id);
        return bookRepository.save(book);
    }
































    private BookDTO convertToDTO(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(bookDTO.getTitle());
        bookDTO.setIsbn(bookDTO.getIsbn());
        return bookDTO;
    }
}
