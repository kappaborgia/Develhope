package co.develhope.springrepository1.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private Integer serialNumber;
    @Column(nullable = true)
    private Double currentPrice;
}
