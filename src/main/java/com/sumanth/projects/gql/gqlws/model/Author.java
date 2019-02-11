package com.sumanth.projects.gql.gqlws.model;

public class Author {

    Integer Id;
    String name;

    public Author(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
