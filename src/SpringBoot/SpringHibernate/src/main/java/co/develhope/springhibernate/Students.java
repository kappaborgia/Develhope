package co.develhope.springhibernate;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String firstname;
    @Column(unique = true, nullable = false)
    private String  email;

}
