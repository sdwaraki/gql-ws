package com.sumanth.projects.gql.gqlws.repository;

import com.sumanth.projects.gql.gqlws.model.Author;
import com.sumanth.projects.gql.gqlws.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private final List<Book> books;

    public BookRepository() {
        books = new ArrayList<>();
        Author author1 = new Author(1, "JK Rowling");
        Book book1 = new Book(new Integer(1), "Harry Potter - 1", "Kids Magic novel", author1, new Double(20.99));
        books.add(book1);
        Author author2 = new Author(2, "Andy Wier");
        Book book2 = new Book(2, "The Martian", "Space travel novel", author2, new Double(13.99));
        books.add(book2);
    }

    public List<Book> getBooks() {
        return books;
    }
}
