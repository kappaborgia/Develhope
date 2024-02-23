package co.develhope.springhibernate.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String  description;


}
