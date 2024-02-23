package co.develhope.springhibernate;

import com.fasterxml.jackson.annotation.JacksonInject;
import jakarta.persistence.*;

@Entity
@Table
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn
    Students students;

    @ManyToOne
    @JoinColumn
    Classes classes;
}
