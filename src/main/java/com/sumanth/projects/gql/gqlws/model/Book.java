package com.sumanth.projects.gql.gqlws.model;

public class Book {

    private Integer id;
    private String title;
    private String description;
    private Author author;
    private Double price;

    public Book(Integer id, String title, String description, Author author, Double price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
