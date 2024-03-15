package co.develhope.SpringDTO.DTO;

public class BookDTO {
    private Long id;
    private String title;
    private Integer isbn;

    public BookDTO(Long id, String title, Integer isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
    }

    public BookDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
