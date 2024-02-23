package co.develhope.SpringMockDB.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String lastame;

    @Column(nullable = false)
    private String firstname;

    @Column(unique = true, nullable = false)
    private String email;

}
