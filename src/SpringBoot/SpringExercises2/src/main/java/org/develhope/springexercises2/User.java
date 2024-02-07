package org.develhope.springexercises2;

public class User {
    private String name;
    private String city;
    private String saluto;

    public User(String name, String city, String saluto) {
        this.name = name;
        this.city = city;
        this.saluto = saluto;

    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
