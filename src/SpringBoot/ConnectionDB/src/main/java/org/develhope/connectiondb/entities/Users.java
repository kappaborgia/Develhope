package org.develhope.connectiondb.entities;

import jakarta.persistence.*;


@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
     private String name;
    @Column(nullable = false)
    private String surname;

   public Users(int id, int  age, String city, String name, String surname){
       this.id = id;
       this.age = age;
       this.city = city ;
       this.name = name;
       this.surname = surname;

   }

}
